package tec.poo.tareas.battleship;

import java.util.Scanner;

public class BattleshipGame {

    public static void main(String... args) {

      Battleship battleship = new Battleship();
      while(battleship.isAlive()) {
          try {
              System.out.print("Enter a number" + ": ");
              Scanner scanner = new Scanner(System.in);
              int userGuess = scanner.nextInt();

              var result = battleship.hit(userGuess);

              if(result) {
                  System.out.println("Hit!");
                  if(!battleship.isAlive()) {
                      System.out.println("Ship was sunk in " + battleship.getAttempts() + " attempts");
                      break;
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
