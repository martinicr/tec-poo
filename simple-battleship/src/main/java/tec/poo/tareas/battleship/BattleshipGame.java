package tec.poo.tareas.battleship;

import java.util.HashMap;
import java.util.Map;

public class BattleshipGame {

    private static final Map<String, Integer> LETTER_TO_NUMBER = new HashMap<>() {{
       put("A", 0);
       put("B", 1);
       put("C", 2);
       put("D", 3);
       put("E", 4);
       put("F", 5);
       put("G", 6);
    }};

    private Board board;
    private int numberOfAttempts;

    public BattleshipGame() {
        this.board = Board.defaultBoardSetup();
        this.numberOfAttempts = 0;
    }

    // constructor
    public BattleshipGame(Board board) {
       this.board = board;
       this.numberOfAttempts = 0;
    }

    public boolean hasBattleships() {
        return !this.board.getBattleshipsInBoard().isEmpty();
    }

    public Battleship hit(String position) {
        // validation de la variable position

        var x = LETTER_TO_NUMBER.get(position.substring(0,1));
        if(x != null) {
            var y = Integer.parseInt(position.substring(1,2));
            var battleshipPosition = this.board.getBattleshipAtPosition(x, y);
            numberOfAttempts++;

            if(null != battleshipPosition) {
                if(!battleshipPosition.alreadyImpacted()) {
                    var battleship = battleshipPosition.getBattleship();
                    if(battleship.isAlive()) {
                        battleship.increaseHit();
                        battleshipPosition.setImpacted(true);
                        return battleship;
                    }
                }
            }
        }
        return null;
    }

    public int getNumberOfAttempts() {
        return this.numberOfAttempts;
    }

    public boolean allBattleshipsAlive() {
        if(!this.hasBattleships()) {
            return false;
        }

        var aliveBattleships = this.board.getBattleshipsInBoard()
                .stream()
                .filter(Battleship::isAlive)
                .count();

        return aliveBattleships != 0;
    }

}
