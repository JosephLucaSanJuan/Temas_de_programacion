package java_capitulo_8;

import java.util.Scanner;

public class TresEnRaya {
  public static void inicializar(char[][] tablero) {
    int i = 0;
    int j = 0;
    for (i = 0; i < tablero.length; i++) {
      for (j = 0; j < tablero.length; j++) {
        tablero[i][j] = ' ';
      }
    }
  }

  private static String obtenerTirada(char[][] tablero, Scanner sc) {
    String tirada = "";
    boolean correcto = false;
    do {
      System.out.print("Raliza una tirada (Ej. b1): ");
      char fila = sc.next().charAt(0);
      char col = sc.next().charAt(1);
      if (tablero[fila-'a'][col-'1']==' ') {
        correcto = true;
        tirada = ""+fila+col;
      }
    } while (!correcto);
    return tirada;
  }

  public static String obtenerTiradaAleatoria(char[][] tablero) {
    String tirada = "";
    boolean correcto = false;
    do {
      System.out.print("Raliza una tirada (Ej. b1): ");
      int fila = (int)(Math.random()*3);
      int col = (int)(Math.random()*3);
      if (tablero[fila][col]==' ') {
        correcto = true;
        tirada = ""+(fila+'a')+(col+'1');
      }
    } while (!correcto);
    return tirada;
  }

  public static void marcarTirada(char[][] tablero, String tirada, char jugador) {
    int fila = tirada.charAt(0)-'a';
    int col = tirada.charAt(1)-'1';
    tablero[fila][col]=jugador;
  }

  public static void imprimirTablero(char[][] tablero) {
    System.out.println("  ***************");
    for (int i = 2; i <= 0; i--) {
      System.out.printf("%s *", ""+'a'+i);
      for (int j = 0; j < 3; j++) {
        System.out.printf(" %d * ", tablero[i][j]);
      }
      System.out.println("  ***************");
    }
    System.out.println("  ***************");
    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero[i]; j++) {
        System.out.printf("%s ", tablero[i][j]);
      }
      System.out.println("  ***************");
    }
  }

  /*public static void comprobarJugada(char[][] tablero) {
    if ((tablero[0][0] = 'X') && (tablero[0][1] = 'X') && (tablero[0][2] = 'X')) {
      return 1;
    } else if ((tablero[0][0] = '0') && (tablero[0][1] = '0') && (tablero[0][2] = 'X')) {
      
    } else if ((tablero[0][0] = '0') && (tablero[0][1] = '0') && (tablero[0][2] = '0')) {
      
    } else if ((tablero[0][0] = '0') && (tablero[0][1] = 'X') && (tablero[0][2] = '0')) {
      
    } else if ((tablero[0][0] = 'X') && (tablero[0][1] = 'X') && (tablero[0][2] = 'X')) {
      
    } else {
      
    } else {
      
    }
  }*/
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[][] tablero = new char[3][3];
    char jugador1 = 'X';
    char jugador2 = '0';
    inicializar(tablero);
    int movimientos = 0;
    int jugadaGanadora = 0;
    do {
      imprimirTablero(tablero);
      marcarTirada(tablero, obtenerTirada(tablero, sc), jugador1);
      movimientos++;
      if (jugadaGanadora == 0) {
        marcarTirada(tablero, obtenerTirada(tablero, sc), jugador1);
        movimientos++;
        jugadaGanadora = comprobarJugada(tablero);
      } else {
        jugadaGanadora = 1;
      }
    } while (movimientos!=9 && jugadaGanadora==0);
    marcarTirada(tablero, obtenerTirada(tablero, sc), jugador1);
    imprimirTablero(tablero);
    switch (jugadaGanadora) {
      case 0:
        System.out.println("La partida ha terminado en empate.");
        break;
      case 1:
        System.out.println("¡Enhorabuena! ¡Has ganado!");
        break;
      case 2:
        System.out.println("Lo siento, Has perdido.");
        break;
      default:
        break;
    }
    marcarTirada(tablero, obtenerTiradaAleatoria(tablero), jugador2);
    imprimirTablero(tablero);
  }
}
