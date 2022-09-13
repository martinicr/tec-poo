package tec.poo.tareas.battleship;

import java.util.Scanner;

public class BattleshipApp {

    public static void main(String... args) {

      BattleshipGame battleshipGame = new BattleshipGame();
      while(battleshipGame.allBattleshipsAlive()) {
          try {
              System.out.print("Enter a guess: ");
              Scanner scanner = new Scanner(System.in);
              String userGuess = scanner.nextLine();

              var result = battleshipGame.hit(userGuess);

              if(null != result) {
                  System.out.println("Hit!");
                  if(!result.isAlive()) {
                      System.out.println("Ship "+ result.getName() + " was sunk after " + battleshipGame.getNumberOfAttempts() + " attempts");
                  }
              } else {
                  System.out.println("Miss!");
              }
          } catch (Exception ex) {
              System.err.println("Illegal value");
          }
      }

      System.exit(0);
    }


}
