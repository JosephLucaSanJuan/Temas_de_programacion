/**
 * Tema 5
 * 50º Pinta un cartel con el número 155 hecho de asteriscos.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej50 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura del cartel: ");
    int alt = sc.nextInt();
    System.out.print("Introduce el número de espacios entre los números: ");
    int numEsp = sc.nextInt();
    int linea = 0;
    
    if ((alt<5)||(numEsp<1)) {
      System.out.println("Lo siento esos datos son incorrectos");
    } else {
      System.out.print("*");
      for (int i = 0; i < numEsp; i++) {
        System.out.print(" ");
      }
      System.out.print("****");
      for (int i = 0; i < numEsp; i++) {
        System.out.print(" ");
      }
      System.out.print("****");
      System.out.println();
  

      System.out.print("*");
      for (int i = 0; i < numEsp; i++) {
        System.out.print(" ");
      }
      System.out.print("*");
      for (int i = 1; i < numEsp+4; i++) {
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println();
      

      System.out.print("*");
      for (int i = 0; i < numEsp; i++) {
        System.out.print(" ");
      }
      System.out.print("****");
      for (int i = 0; i < numEsp; i++) {
        System.out.print(" ");
      }
      System.out.print("****");
      System.out.println();
      

      while (linea<alt-4) {
        System.out.print("*");
        for (int i = 1; i < numEsp+4; i++) {
          System.out.print(" ");
        }
        System.out.print("*");
        for (int i = 1; i < numEsp+4; i++) {
          System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
        linea++;
      }

      
      System.out.print("*");
      for (int i = 0; i < numEsp; i++) {
        System.out.print(" ");
      }
      System.out.print("****");
      for (int i = 0; i < numEsp; i++) {
        System.out.print(" ");
      }
      System.out.print("****");
      System.out.println();
    }
    sc.close();
  }
}
