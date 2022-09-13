package tec.poo.clases.herencia;

public abstract class Persona {

    protected String name;

    abstract public int getSalary();

    public int numberOfVacationsPerYear() {
        return 10;
    }
}
