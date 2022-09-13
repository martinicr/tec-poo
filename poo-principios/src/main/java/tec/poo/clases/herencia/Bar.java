package tec.poo.clases.herencia;

public final class Bar extends Foo {

    public void someMethod() {
        this.foo();
        this.bar();
        // Error de compilación. El método baz() es privado y no se puede heredar
        // this.baz();
    }

    // Error de compilación. No podemos sobrecargar un método privado de la superclase
//    @Override
//    public void baz() {
//
//    }
}
