/**
 * Tema 6
 * 8º.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_6;

public class Tema06Ej08 {
  public static void main(String[] args) {
    System.out.println("Muestra 3 apuestas en 3 columnas de 14 partidos y el pleno al final.");
    int n = 0;

    for (int i = 1; i <= 14; i++) {
      System.out.printf("%2d. |",i);
      for (int j = 1; j <= 3; j++) {
        n = (int)(Math.random()*6+1);
        switch (n) {
          case 1:
            System.out.print("1  |");
            break;
          case 2:
            System.out.print("1  |");
            break;
          case 3:
            System.out.print("1  |");
            break;
          case 4:
            System.out.print(" X |");
            break;
          case 5:
            System.out.print(" X |");
            break;
          case 6:
            System.out.print("  2|");
            break;
          default:
            break;
        }
      }
      System.out.println();
    }
    int n1 = (int)(Math.random()*4);
    int n2 = (int)(Math.random()*4);
    String tipo1 = "d";
    String tipo2 = "d";
    String N1 = String.valueOf(n1);
    String N2 = String.valueOf(n2);
    
    System.out.printf("PLENO AL 15 - Local...%"+tipo1+" Visitante...%"+tipo2, (n1<=1)?n1:N1, (n2<=1)?n2:N2);
    if (n2>1) {
      tipo2 = "s";
      N1 = "M";
    }
    if (n1>1) {
      tipo2 = "s";
      N1 = "M";
    }
  }
}
