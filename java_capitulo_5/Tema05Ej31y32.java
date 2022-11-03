/**
 * Tema 5
 * 31º Escribe una L con asteriscos.
 * 
 * 32º Escribe y suma los dígitos pares de un número.
 * 
 * @author Joseph Luca San Juan Thompson
 * 
 * Hacer hasta el ejercicio 35 para mañana
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej31y32 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    /*System.out.print("Introduce la primera altura: ");
    int alt = sc.nextInt();
    int l = alt/2;

    for (int i = 1; i < alt; i++) {
      System.out.println("*");
    }

    for (int i = 0; i <= alt; i++) {
      System.out.print("*");
    } */

    System.out.print("Introduce un número: ");
    long n = sc.nextLong();
    long numInv = 0;
    int cuenta = 0;
    int dig;
    int suma = 0;

    if (n == 0) {
      cuenta=1;
    }

    while (n > 0) {
      numInv = (numInv*10)+(n%10); 
      n/=10;
      cuenta++;
    }
    System.out.println(numInv);

    for (int i =0; i < cuenta; i++) {
      dig = (int)(numInv%10);
      numInv /= 10;
      if (dig%2==0) {
        System.out.print(dig+" ");
        suma += dig;
      }
    }
    System.out.println("\nSuma de los dígitos pares: " + suma);
    sc.close();
  }
}
