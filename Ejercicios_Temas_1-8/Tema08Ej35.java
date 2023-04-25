/**
 * Tema08
 * 
 * 35º Crea funciones para convertir un número en palotes
 * 
 * @author Joseph Luca San Juan Thompson
 */

import java.util.Scanner;

public class Tema08Ej35 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    long n = sc.nextLong();
    System.out.println(convierteEnPalotes(n));
    sc.close();
  }

  public static String convierteEnPalotes(long n){
    String resultado = "";
    for (int i = 0; i < longitud(n); i++) {
      for (int j = 0; j < posicion(n, i+1); j++) {
        resultado += "|";
      }
      if (i < longitud(n)-1) {
        resultado += "-";
      }
    }
    return resultado;
  }

  public static int longitud(long n) {
    if (n < 0) {
      n = -n;
    }
    if (n >= 0 && n < 10) {
      return 1;
    } else {
      int longitud = 0;
      while (n > 0) {
        n /=10;
        longitud++;
      }
      return longitud;
    }
  }

  public static int posicion(long n, int pos) {
    int digito = 0;
    int longitud = longitud(n);
    for (int i = longitud-1; i >= longitud-pos; i--) {
      digito = (int)(n / (long)Math.pow(10, i));
      n = (n % (long)Math.pow(10, i));
      //longitud--;
    }
    return digito;
  }
}
