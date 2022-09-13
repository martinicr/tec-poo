package tec.poo.clases.herencia;

import org.junit.jupiter.api.Test;

public class FooTest {

    @Test
    public void newSubClasses() {

        Foo foo = new Foo();
        foo.foo();
        foo.bar();

        Foo bar1 = new Bar();
        bar1.foo();
        bar1.bar();
        // Error de compilación: someMethod no pertenece a la definición de Foo
        //bar1.someMethod();

        Bar bar2 = new Bar();
        bar2.foo();
        bar2.bar();
        bar2.someMethod();

        // Casting: Convirtiendo un objeto de tipo Foo a Bar. Esto sirve porque
        // bar1 es parte de la jerarquía de classes, pero si fueran tipos
        // muy distintos podria dar error (Ej. de String a Bar)
        Bar bar3 = (Bar)bar1;
        bar3.someMethod();
    }
}
