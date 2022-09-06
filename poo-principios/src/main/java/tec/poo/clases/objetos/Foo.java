package tec.poo.clases.objetos;

public class Foo {

    private static final int PRIVATE_CONSTAN_NUMBER = 44;
    public static final int PUBLIC_CONSTANT_NUMBER = 77;

    private int someNumber;
    private String someString;

    /*
    Si solamente existe un constructor en la clase, y es el constructor
    default (Foo()) su declaración puede ser omitida. Si hay más de uno
    se debe de incluir el método default obligatoriamente
     */

    public Foo() {
        this.someNumber = 10;
        this.someString = "Hello World";
    }

    public Foo(int initialNumber) {
        this.someNumber = initialNumber;
    }

    public void someMethod() {
        // Desde aqui se puede invocar a
        // aStaticMethod();
        // privateStaticMethod();
    }

    public int getSomeNumber() {
        return this.someNumber;
    }

    public static void aStaticMethod() {

        /* Desde aqui SE PUEDE invocar a
        privateStaticMethod();
        u otro método estático */

        /* Desde aqui NO SE PUEDE invocar someMethod directamente,
        hay que crear una nueva instancia de Foo.
         */

        // Error de compilación
        // someMethod();

        var foo = new Foo();
        foo.someMethod();
    }

    private static void privateStaticMethod() {

        /* Desde aqui SE PUEDE invocar a
        privateStaticMethod();
        u otro método estático */

        /* Desde aqui NO SE PUEDE invocar someMethod directamente,
        hay que crear una nueva instancia de Foo.
         */

        // Error de compilación
        // someMethod();

        var foo = new Foo();
        foo.someMethod();
    }

}
