package tec.poo.tareas.battleship;

public class BattleshipPosition {

    private int x, y;
    private boolean impacted;
    private Battleship battleship;

    public BattleshipPosition(int x, int y, Battleship battleship, boolean impacted) {
        this.x = x;
        this.y = y;
        this.battleship = battleship;
        this.impacted = impacted;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean alreadyImpacted() {
        return impacted;
    }

    public void setImpacted(boolean impacted) {
        this.impacted = impacted;
    }

    public Battleship getBattleship() {
        return battleship;
    }

    public void setBattleship(Battleship battleship) {
        this.battleship = battleship;
    }
}
