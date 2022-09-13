package tec.poo.clases.comportamiento;

import java.util.Optional;

public class Foo {

    private int number;

    public int someMethod() {
        var value = this.stepOne();
        return this.stepTwo(value);
    }

    public void setNumber(int newNumber) {
        this.number = newNumber;

        /*
        newNumber se convertirá en el nuevo valor de la propiedad number
         */
    }

    public int multiply(int other) {
        return this.number * other;

        /*
        En este caso other será multiplicado por el valor actual de la
        propiedad number
         */
    }

    public void someOtherMethod(Bar bar) {
        bar.doSomething();

        /*
        Otro objeto (Bar) se pasa como argumento, de tal forma que Foo
        puede invocar un método de él.
         */
    }

    public void nullSafeOtherMethod(Bar bar) {
        if(bar != null) {
            bar.doSomething();
        }
    }

    public void nullSafeWithOptional(Optional<Bar> bar) {
        if(bar.isPresent()) {
            bar.get().doSomething();
        }
    }

    private int stepOne() {
        return 88;
    }

    private int stepTwo(int value) {
        return 55 + value;
    }
}
