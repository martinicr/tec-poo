package tec.poo.tareas.battleship;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BattleshipGameTest {

    BattleshipGame battleshipGame;

    @BeforeEach
    public void setup() {
        Board board = Board.defaultBoardSetup();
        battleshipGame = new BattleshipGame(board);
    }

    @Test
    public void initBattleshipGame() {
        assertThat(battleshipGame.hasBattleships()).isTrue();
    }

    @Test
    public void verifyShipWasNotImpacted() {

        var actual = battleshipGame.hit("A5");

        assertThat(actual).isNull();
        assertThat(battleshipGame.getNumberOfAttempts()).isEqualTo(1);
    }

    @Test
    public void verifyShipWasImpacted() {

        var actual = battleshipGame.hit("D0");

        assertThat(actual).isNotNull();
        assertThat(actual.isAlive()).isEqualTo(true);
        assertThat(battleshipGame.getNumberOfAttempts()).isEqualTo(1);
    }

    @Test
    public void verifyShipWasImpactedTwice() {

        battleshipGame.hit("D0");
        var actual = battleshipGame.hit("B0");

        assertThat(actual).isNotNull();
        assertThat(actual.isAlive()).isEqualTo(true);
        assertThat(battleshipGame.getNumberOfAttempts()).isEqualTo(2);
    }

    @Test
    public void verifyShipWasSunk() {
        battleshipGame.hit("A5");
        battleshipGame.hit("D0");
        battleshipGame.hit("C0");
        battleshipGame.hit("D4");
        var actual = battleshipGame.hit("B0");

        assertThat(actual).isNotNull();
        assertThat(actual.isAlive()).isEqualTo(false);

        assertThat(battleshipGame.getNumberOfAttempts()).isEqualTo(5);
    }

    @Test
    public void verifyAllShipsAreAlive() {

        battleshipGame.hit("A5");
        battleshipGame.hit("D0");
        battleshipGame.hit("C0");
        battleshipGame.hit("D4");
        var actual = battleshipGame.hit("B0");

        assertThat(actual).isNotNull();
        assertThat(actual.isAlive()).isEqualTo(false);

        assertThat(battleshipGame.getNumberOfAttempts()).isEqualTo(5);
        assertThat(battleshipGame.allBattleshipsAlive()).isFalse();
    }

}
