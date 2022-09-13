package tec.poo.clases.composicion;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class FooTest {

    @Test
    public void composeWithBarObjects() {
        Foo foo1 = new Foo(new Bar());
        Foo foo2 = new Foo(new Baz());

        assertThat(foo1).isNotNull();
        assertThat(foo2).isNotNull();

        /*
        Baz es de tipo Bar, por eso se puede pasar como argumento
         */
    }
}
