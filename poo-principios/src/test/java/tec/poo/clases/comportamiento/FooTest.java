package tec.poo.clases.comportamiento;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

public class FooTest {

    @Test
    public void invokeMethods() {
        var foo = new Foo();
        var actual = foo.someMethod();

        // Error de compilación
        // var actual = foo.stepOne();

        assertThat(actual).isEqualTo(143);

        /*
        Los métodos privados NO están disponibles en este contexto. Generalmente,
        cuando se desea probar un método privado, esto se hace por medio del
        método público que lo utiliza.
         */
    }

    @Test
    public void noNullSafeBarValue() {

        Foo foo = new Foo();
        Bar bar = null;

        // Esta invocación causa NullPointerException
        // foo.someOtherMethod(bar);

//        try {
//            foo.someOtherMethod(bar);
//        } catch (Exception ex) {
//
//        }

        Assertions.assertThrows(NullPointerException.class, () -> {
            foo.someOtherMethod(bar);
        });
    }

    @Test
    public void nullSafeBarValue() {

        Foo foo = new Foo();
        Bar bar = null;

        foo.nullSafeOtherMethod(bar);

        /*
        Este código no se cae. Validar siempre y cuando se pasen objetos
        como argumento, tenemos que tomar en cuenta si el argumento es nulo o
        no. A partir de Java 8 se introdujo la clase Optional que es muy útil
        para esto.
         */
    }

    @Test
    public void nullSafeWithOptional() {

        Foo foo = new Foo();
        Bar bar = null;
        
        foo.nullSafeWithOptional(Optional.ofNullable(bar));
    }

}
