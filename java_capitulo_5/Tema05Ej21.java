/**
 * Tema 5
 * 21º Dí cuantos números has escrito, la media de los impares y el mayor de los pares.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej21 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 1;
    int cuenta = 0;
    int cuentaImpar = 0;
    int sumaImpar = 0;
    int maxPar = 0;

    while (n>=0) {
      System.out.print("Introduce un número: ");
      n = sc.nextInt();
      if (n >= 0) {
        cuenta++;
        if (n%2 == 0) {
          if (n > maxPar) {
            maxPar = n;
          }
        } else {
          cuentaImpar++;
          sumaImpar += n;
        }
      }
    }
    System.out.println("Has introducido " + cuenta + " números.");
    System.out.println("Hay " + cuentaImpar + " número(s) impar(es) cuya media es " + sumaImpar/cuentaImpar);
    System.out.println("El mayor de los números pares es "+maxPar);
    //sc.close();
  }
}
