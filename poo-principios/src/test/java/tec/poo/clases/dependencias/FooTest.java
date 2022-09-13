package tec.poo.clases.dependencias;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class FooTest {

    @Test
    public void logFromClassProperty() {
        Logger logger = new Logger();
        Foo foo = new Foo(logger);
        foo.logFromProperty();
    }

    @Test
    public void logFromDirectInstantiation() {
        Foo foo = new Foo();
        foo.logFromDirectInstantiation();
    }

    public void logFromServiceLocator() {
        Foo foo = new Foo();
        foo.logFromServiceLocator();
    }

}
