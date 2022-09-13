package tec.poo.tareas.battleship;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private static final int BOARD_GRID_LENGTH = 7;
    private static final int BOARD_GRID_WIDTH = 7;

    enum ShipAligment {
       VERTICAL,
       HORIZONTAL
    };

    private BattleshipPosition[][] boardGrid;
    private List<Battleship> battleshipsInBoard;

    public Board() {
        this.boardGrid = new BattleshipPosition[BOARD_GRID_WIDTH][BOARD_GRID_LENGTH];
        this.battleshipsInBoard = new ArrayList<>();
    }

    public static Board defaultBoardSetup() {
        var board = new Board();
        var cabista = new Battleship("cabista", 3);
//        var poniez = new Battleship("poniez", 3);
//        var hacqui = new Battleship("hacqui", 3);

//        this.battleshipsInBoard = new ArrayList<>();
        board.addShipToBoard(cabista, 1, 0, ShipAligment.VERTICAL);
//        board.addShipToBoard(poniez, 1, 2, ShipAligment.VERTICAL);

        return board;
    }

    public BattleshipPosition[][] getBoardGrid() {
        return this.boardGrid;
    }

    public List<Battleship> getBattleshipsInBoard() {
        return this.battleshipsInBoard;
    }

    public BattleshipPosition getBattleshipAtPosition(int x, int y) {
        try {
            return this.boardGrid[x][y];
        } catch (Exception e) {
            return null;
        }
    }

    public void addShipToBoard(Battleship battleship, int x, int y, ShipAligment shipAligment) {
        if(shipAligment == ShipAligment.VERTICAL) {
            this.addShipInVerticalPosition(battleship, x, y);
        } else {
            this.addShipInHorizontalPosition(battleship, x, y);
        }
    }

    private void addShipInVerticalPosition(Battleship battleship, int x, int y) {
        int xIndex = 0;
        try {
            while (xIndex < battleship.getLength() && this.boardGrid[x][y] == null) {
                this.boardGrid[x][y] = new BattleshipPosition(x, y, battleship, false);
                x++;
                xIndex++;
            }

            if (xIndex == battleship.getLength()) {
                System.out.println("Ship " + battleship.getName() + " added to the board sucessfully");
                this.battleshipsInBoard.add(battleship);
            } else {
                System.out.println("Can't add Ship " + battleship.getName() + " to the board");
            }

        } catch (Exception e) {
            System.out.println("Can't add Ship " + battleship.getName() + " to the board. Invalid position " + x +", "+ y );
        }
    }

    private void addShipInHorizontalPosition(Battleship battleship, int x, int y) {
    }

}
