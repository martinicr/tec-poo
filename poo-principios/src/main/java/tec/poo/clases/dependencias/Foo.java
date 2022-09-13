package tec.poo.clases.dependencias;

public class Foo {

    private Logger logger;

    public Foo() {

    }

    public Foo(Logger logger) {
        this.logger = logger;
    }

    public void logFromProperty() {
        this.logger.debug();
    }

    public void logFromDirectInstantiation() {
        var logger = new Logger();
        logger.debug();
    }

    public void logFromServiceLocator() {
        var logger = ServiceLocator.getLogger();
        logger.debug();
    }

}
