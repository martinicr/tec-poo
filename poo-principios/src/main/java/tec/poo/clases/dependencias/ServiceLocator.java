package tec.poo.clases.dependencias;

public class ServiceLocator {

    public static Logger getLogger() {
        return new Logger();
    }
}
