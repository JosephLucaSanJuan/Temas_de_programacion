/**
 * Tema07
 * Arrays bidimensionales
 * 
 * 10º Juega al 3 en rayas.
 * 
 * @author Joseph Luca San Juan Thompson
 */

import java.util.Scanner;

public class Tema07EjArrayBiEj10 {

  static final String JUGADOR = "$";
  static final String ORDENADOR = "O";
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[][] tablero = new String[3][3];
    int movimientos = 0;
    boolean ganoYo = false;
    boolean ganasTu = false;
    String coordenadas;
    String fila = "cba";

    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero.length; j++) {
        tablero[i][j] = " ";
      }
    }

    do {
      System.out.println("  ┌───┬───┬───┐");
      for (int i = 0; i < tablero.length; i++) {
        System.out.print(fila.charAt(i)+" | ");
        for (int j = 0; j < tablero.length; j++) {
          System.out.print(tablero[i][j]+" | ");
        }
        if (i < tablero.length-1) {
          System.out.println("\n  ├───┼───┼───┤");
        }
      }
      System.out.println("\n  └───┴───┴───┘");
      System.out.println("    1   2   3  \n");

      System.out.print("Introduce una coordenada como b3: ");
      coordenadas = sc.nextLine();
      int x = fila.indexOf(coordenadas.charAt(0));
      int y = coordenadas.charAt(1)-1-48;
      tablero[x][y] = JUGADOR;
      movimientos++;

      ganoYo = (
        tablero[0][0]==JUGADOR && tablero[1][1]==JUGADOR && tablero[2][2]==JUGADOR || 
        tablero[0][0]==JUGADOR && tablero[0][1]==JUGADOR && tablero[0][2]==JUGADOR || 
        tablero[0][0]==JUGADOR && tablero[1][0]==JUGADOR && tablero[2][0]==JUGADOR ||
        tablero[0][1]==JUGADOR && tablero[1][1]==JUGADOR && tablero[2][1]==JUGADOR || 
        tablero[1][0]==JUGADOR && tablero[1][1]==JUGADOR && tablero[1][2]==JUGADOR || 
        tablero[2][0]==JUGADOR && tablero[1][1]==JUGADOR && tablero[0][2]==JUGADOR || 
        tablero[2][0]==JUGADOR && tablero[2][1]==JUGADOR && tablero[2][2]==JUGADOR || 
        tablero[0][2]==JUGADOR && tablero[1][2]==JUGADOR && tablero[2][2]==JUGADOR
      );

      if (!ganoYo && (movimientos<9)) {
        do {
          x = (int)(Math.random()*3);
          y = (int)(Math.random()*3);
        } while (!tablero[x][y].equals(" "));
  
        tablero[x][y] = ORDENADOR;
        movimientos++;
        ganasTu = (
          tablero[0][0]==ORDENADOR && tablero[1][1]==ORDENADOR && tablero[2][2]==ORDENADOR || 
          tablero[0][0]==ORDENADOR && tablero[0][1]==ORDENADOR && tablero[0][2]==ORDENADOR || 
          tablero[0][0]==ORDENADOR && tablero[1][0]==ORDENADOR && tablero[2][0]==ORDENADOR ||
          tablero[0][1]==ORDENADOR && tablero[1][1]==ORDENADOR && tablero[2][1]==ORDENADOR || 
          tablero[1][0]==ORDENADOR && tablero[1][1]==ORDENADOR && tablero[1][2]==ORDENADOR || 
          tablero[2][0]==ORDENADOR && tablero[1][1]==ORDENADOR && tablero[0][2]==ORDENADOR || 
          tablero[2][0]==ORDENADOR && tablero[2][1]==ORDENADOR && tablero[2][2]==ORDENADOR || 
          tablero[0][2]==ORDENADOR && tablero[1][2]==ORDENADOR && tablero[2][2]==ORDENADOR
        );
      }
    } while (!ganasTu && !ganoYo || movimientos==9);
    
    System.out.println("  ┌───┬───┬───┐");
    for (int i = 0; i < tablero.length; i++) {
      System.out.print(fila.charAt(i)+" | ");
      for (int j = 0; j < tablero.length; j++) {
        System.out.print(tablero[i][j]+" | ");
      }
      if (i < tablero.length-1) {
        System.out.println("\n  ├───┼───┼───┤");
      }
    }
    System.out.println("\n  └───┴───┴───┘");
    System.out.println("    1   2   3  \n");

    if (ganoYo) {
      System.out.println("¡Enhorabuena!¡Has ganado!");
    } else if (ganasTu) {
      System.out.println("Lo siento. Has perdido");
    } else {
      System.out.println("Empate. No gana nadie");
    }
    sc.close();
  }
}
