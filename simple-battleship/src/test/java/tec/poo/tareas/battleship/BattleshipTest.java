package tec.poo.tareas.battleship;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BattleshipTest {

    @Test
    public void initBattleship() {

        Battleship battleship = new Battleship();
        var actual = battleship.getBoard();

        assertThat(actual).containsOnly(1,1,1,0,0,0,0);
    }

    @Test
    public void verifyIfShipWasNotImpacted() {

        Battleship battleship = new Battleship();
        var actual = battleship.hit(5);

        assertThat(actual).isFalse();
        assertThat(battleship.getCount()).isEqualTo(0);
        assertThat(battleship.isAlive()).isTrue();
        assertThat(battleship.getAttempts()).isEqualTo(1);
    }

    @Test
    public void verifyIfShipWasImpacted() {

        Battleship battleship = new Battleship();
        var actual = battleship.hit(2);

        assertThat(actual).isTrue();
        assertThat(battleship.getCount()).isEqualTo(1);
        assertThat(battleship.isAlive()).isTrue();
        assertThat(battleship.getAttempts()).isEqualTo(1);
    }

    @Test
    public void verifyIsAlive() {
        Battleship battleship = new Battleship();
        var actual = battleship.isAlive();

        assertThat(actual).isTrue();
        assertThat(battleship.getAttempts()).isEqualTo(0);
    }

    @Test
    public void verifyIsNotAlive() {
        Battleship battleship = new Battleship();
        battleship.hit(0);
        battleship.hit(1);
        battleship.hit(2);

        var actual = battleship.isAlive();
        assertThat(actual).isFalse();
        assertThat(battleship.getCount()).isEqualTo(3);
        assertThat(battleship.getAttempts()).isEqualTo(3);
    }

    @Test
    public void shipWasSunkIn10Attempts() {
        Battleship battleship = new Battleship();
        battleship.hit(6);
        battleship.hit(0);
        battleship.hit(3);
        battleship.hit(4);
        battleship.hit(6);
        battleship.hit(1);
        battleship.hit(6);
        battleship.hit(7);
        battleship.hit(5);
        battleship.hit(2);

        var actual = battleship.isAlive();
        assertThat(actual).isFalse();
        assertThat(battleship.getCount()).isEqualTo(3);
        assertThat(battleship.getAttempts()).isEqualTo(10);

    }

    @Test
    public void increaseCounterOneDigit() {

        Battleship battleship = new Battleship();
        battleship.increaseCount();
        var actual = battleship.getCount();

        assertThat(actual).isEqualTo(1);
    }



}
