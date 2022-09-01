package tec.poo.tareas.battleship;

public class Battleship {

    private final static int BOARD_LENGTH = 7;

    private int count;
    private int attempts;
    private int[] board;

    // constructor
    public Battleship() {
       this.count = 0;
       this.attempts = 0;
       this.board = new int[BOARD_LENGTH];
       init();
    }

    private void init() {
        this.board[0] = 1;
        this.board[1] = 1;
        this.board[2] = 1;
    }

    public void increaseCount() {
        this.count++;
    }

    public int getCount() {
        return this.count;
    }

    public int[] getBoard() {
        return this.board;
    }

    public boolean hit(int position) {

        this.attempts++;

        if(position < 0 || position >= BOARD_LENGTH) {
            return false;
        }

        if (this.board[position] == 1) {
            this.count++;
            return true;
        }
        return false;
    }

    public boolean isAlive() {
        return this.count < 3;
    }

    public int getAttempts() {
        return this.attempts;
    }
}
