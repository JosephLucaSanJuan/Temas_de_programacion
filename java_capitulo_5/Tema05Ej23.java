/**
 * Tema 5
 * 23º Introduce números hasta que las suma sea mayor que 10000.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 0;
    int suma = 0;
    int cont = 0;
    
    while (suma <= 10000) {
      System.out.print(" introduce un números: ");
      n = sc.nextInt();
      suma += n;
      cont++;
    }
    System.out.print("Ha introducido " + cont+ " números ");
    System.out.print("que juntos suman " + suma);
    System.out.print(" y cuya media es " + (double)suma/(double)cont);
    sc.close();
  }
}
