/**
 * Tema06
 * 24º Muestra un dígito aleatoriamente de un número.
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_6;

import java.util.Scanner;

public class Tema06Ej24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int n = sc.nextInt();
    int num = n;
    int dig = 0;
    int rep = 0;

    while (num>0) {
      num/=10;
      rep++;
    }
    dig = (int)(Math.random()*rep)+1;
    
    System.out.println((int)((n/(Math.pow(10, rep-dig)))%10));
    sc.close();
  }
}
