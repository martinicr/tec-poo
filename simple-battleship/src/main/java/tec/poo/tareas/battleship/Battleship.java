package tec.poo.tareas.battleship;

public class Battleship {

    private static final int MIN_LENGTH = 3;

    private String name;
    private int length;
    private int hits;

    public Battleship(String name) {
        this(name, MIN_LENGTH);
    }

    public Battleship(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return this.name;
    }

    public int getLength() {
        return this.length;
    }

    public boolean isAlive() {
        return this.length > this.hits;
    }

    public void increaseHit() {
        this.hits++;
    }

}
