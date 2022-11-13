/**
 * Tema 6
 * Ejercicio 9.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_6;

public class Tema06Ej10 {

  public static void main(String[] args) {
    System.out.println("Escribe 10 líneas formados por los carácteres *,@,.,-,=,|");
    int n = 0;
    int cuentaFila = 0;
    int longLinea = 0;

    while (cuentaFila < 10) {
      n = (int) (Math.random() * 6) + 1;
      longLinea = (int) (Math.random() * 40) + 1;

      for (int i = 0; i < longLinea; i++) {
        switch (n) {
          case 1:
            System.out.print(".");
            break;
          case 2:
            System.out.print("*");
            break;
          case 3:
            System.out.print("-");
            break;
          case 4:
            System.out.print("=");
            break;
          case 5:
            System.out.print("|");
            break;
          case 6:
            System.out.print("@");
            break;
          default:
            break;
        }
      }
      System.out.println();
      cuentaFila++;
    }
  }
}
