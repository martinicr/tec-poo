package tec.poo.clases.objetos;

public class Mutable {

    private int someNumber;

    public Mutable(int initialNumber) {
        this.someNumber = initialNumber;
    }

    public void increase() {
        this.someNumber++;
    }

    public int getSomeNumber() {
        return this.someNumber;
    }
}
