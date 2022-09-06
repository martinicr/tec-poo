package tec.poo.clases.objetos;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class MutableTest {

    @Test
    public void increase() {
        var obj1 = new Mutable(10);
        obj1.increase();

        assertThat(obj1.getSomeNumber()).isEqualTo(11);

        /*
        La invocación del método increase() va a cambiar el estado del
        objeto obj1, al cambiar el valor de la propiedad someNumber.
         */
    }
}
