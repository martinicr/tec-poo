package tec.poo.clases.objetos;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class FooTest {

    @Test
    public void newInstanceWithDefaultConstructor() {
        Foo obj1 = new Foo();
        Foo obj2 = new Foo();

        assertThat(obj1).isNotSameAs(obj2);

        /*
        Cuando se hizo la invocación a new Foo(), todo el código contenido
        dentro del método constructor se ejecuta.
         */
    }

    @Test
    public void newInstanceWithCustomConstructor() {
        Foo obj1 = new Foo();
        Foo obj2 = new Foo(20);

        assertThat(obj1.getSomeNumber()).isEqualTo(10);
        assertThat(obj2.getSomeNumber()).isEqualTo(20);
    }

    @Test
    public void invokePublicMethod() {
        Foo obj1 = new Foo();

        obj1.someMethod();

        /*
        Como el método someMethod es void (no devuelve nada),
        deberíamos de confirmar que luego de la ejecución de
        este método, algo en la instancia del objeto cambió
         */
    }

    @Test
    public void invokePublicStaticMethod() {
        Foo.aStaticMethod();

        /*
        Nótese cómo se invoca este método. No hace falta crear
        ninguna instancia.
        La invocación de este método no tuvo que haber cambiado el
        estado de ningún objeto.

        El método privateStaticMethod() no se puede acceder desde aquí porque
        es privado.
         */
    }

    @Test
    public void invokePublicConstant() {
        var actual = Foo.PUBLIC_CONSTANT_NUMBER;

        // La siguiente línea dará como resultado un error de compilación
        // Foo.PRIVATE_CONSTANT_NUMBER

        assertThat(actual).isEqualTo(77);

        /*
        Al igual que con la invocación del meétodo estático, obtener el valor
        de una variable estática no requiere instanciar el objeto.
         */
    }


}
