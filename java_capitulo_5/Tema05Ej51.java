/**
 * Tema 5
 * 51º El gusano métrico se come dígitos con forma de rosquilla (el 0 y el 8).
 * Muestra un número antes y después de haber sido comido por el gusano
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej51 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    long n = sc.nextLong();
    long num = n;
    int longNum = 0;
    long numInv = 0;
    int cerosyochos = 0;
    int dig = 0;
    int cuenta = 0;
    long loqueQueda = 0;
    int cuenta2 = 0;

    while (num>0) {
      numInv = (numInv*10)+(num%10);
      num/=10;
      dig = (int)(num%10);
      if ((dig==8) || (dig==0)) {
        cuenta++;
      }
      longNum++;
    }
    System.out.println(longNum);
    System.out.println(numInv);
    System.out.println(cuenta);

    for (int i = 0; i < longNum; i++) {
      dig = (int)(numInv%10);
      numInv/=10;
      if ((dig!=8) && (dig!=0)) {
        System.out.print(dig+" ");
        cuenta2++;
        loqueQueda = loqueQueda + (long)(dig*Math.pow(10, longNum-cuenta2));
      }
    }/**/

    if (loqueQueda==n) {
      System.out.println("\nEl gusano numérico no se ha comido ningún dígito.");
    } else {
      System.out.println("\nDespués de haber sido comido por el gusano métrico se queda en " + (long)(loqueQueda/Math.pow(10, cuenta)));
    }
  }
}
