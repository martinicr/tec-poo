package tec.poo.clases.herencia.interfaz;

import org.junit.jupiter.api.Test;
import tec.poo.clases.herencia.interfaz.Bar;
import tec.poo.clases.herencia.interfaz.Foo;

import static org.assertj.core.api.Assertions.*;

public class BarTest {

    @Test
    public void newInstance() {
        Bar bar = new Bar();
        bar.foo();

        assertThat(bar).isInstanceOf(Bar.class);
        assertThat(bar).isInstanceOf(Foo.class);

    }
}
