package tec.poo.tareas.battleship;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


public class BoardTest {

    @Test
    public void whenCreatedBoardGridIsLengthAndWithEqualToSeven() {
        var board = new Board();
        var boardGrid = board.getBoardGrid();

        assertThat(boardGrid[0].length).isEqualTo(7);
        assertThat(boardGrid[1].length).isEqualTo(7);
        assertThat(board.getBattleshipsInBoard()).hasSize(0);
    }

    @Test
    public void initBoardWithOneBattleship_whenWrongPosition_thenIgnore() {
        var board = new Board();
        var cabista = new Battleship("cabista", 3);
        board.addShipToBoard(cabista, 8, 0, Board.ShipAligment.VERTICAL);

        assertThat(board.getBattleshipsInBoard()).hasSize(0);
    }

    @Test
    public void initBoardWithOneBattleship_whenNegativePosition_thenIgnore() {
        var board = new Board();
        var cabista = new Battleship("cabista", 3);
        board.addShipToBoard(cabista, 0, -10, Board.ShipAligment.VERTICAL);

        assertThat(board.getBattleshipsInBoard()).hasSize(0);
    }

    @Test
    public void initBoardWithOneBattleships() {
        var board = new Board();

        var cabista = new Battleship("cabista", 3);

        board.addShipToBoard(cabista, 1, 0, Board.ShipAligment.VERTICAL);

        assertThat(board.getBattleshipsInBoard()).hasSize(1);
        assertThat(board.getBattleshipAtPosition(1,0).getBattleship()).isSameAs(cabista);
        assertThat(board.getBattleshipAtPosition(2,0).getBattleship()).isSameAs(cabista);
        assertThat(board.getBattleshipAtPosition(3,0).getBattleship()).isSameAs(cabista);
    }

    @Test
    public void initBoardWithTwoBattleships_whenPositionConflict_thenAddOne() {
        var board = new Board();

        var cabista = new Battleship("cabista", 3);
        var poniez = new Battleship("poniez", 3);

        board.addShipToBoard(cabista, 1, 0, Board.ShipAligment.VERTICAL);
        board.addShipToBoard(poniez, 2, 0, Board.ShipAligment.VERTICAL);

        assertThat(board.getBattleshipsInBoard()).hasSize(1);
        assertThat(board.getBattleshipAtPosition(1,0).getBattleship()).isSameAs(cabista);
        assertThat(board.getBattleshipAtPosition(2,0).getBattleship()).isSameAs(cabista);
        assertThat(board.getBattleshipAtPosition(3,0).getBattleship()).isSameAs(cabista);
    }

    @Test
    public void initBoardWithTwoBattleships() {
        var board = new Board();

        var cabista = new Battleship("cabista", 3);
        var poniez = new Battleship("poniez", 3);

        board.addShipToBoard(cabista, 1, 0, Board.ShipAligment.VERTICAL);
        board.addShipToBoard(poniez, 2, 2, Board.ShipAligment.VERTICAL);

        assertThat(board.getBattleshipsInBoard()).hasSize(2);
        assertThat(board.getBattleshipAtPosition(1,0).getBattleship()).isSameAs(cabista);
        assertThat(board.getBattleshipAtPosition(2,0).getBattleship()).isSameAs(cabista);
        assertThat(board.getBattleshipAtPosition(3,0).getBattleship()).isSameAs(cabista);

        assertThat(board.getBattleshipAtPosition(2,2).getBattleship()).isSameAs(poniez);
        assertThat(board.getBattleshipAtPosition(3,2).getBattleship()).isSameAs(poniez);
        assertThat(board.getBattleshipAtPosition(4,2).getBattleship()).isSameAs(poniez);
    }

}

