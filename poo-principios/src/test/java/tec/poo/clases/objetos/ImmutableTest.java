package tec.poo.clases.objetos;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ImmutableTest {

    @Test
    public void increase() {
        Immutable obj2 = new Immutable(10);
        obj2 = obj2.increase();

        assertThat(obj2.getSomeNumber()).isEqualTo(11);

        /*
        La invocación del método increase() NO va a cambiar el estado del
        objeto obj2. Se recibe una nueva instancia con el valor de la
        variable someNumber incrementada.
         */
    }
}
