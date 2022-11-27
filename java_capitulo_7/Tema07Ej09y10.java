/**
 * Tema07
 * 9º Escribe 8 números y márcalos como pares e impares.
 * 
 * 10º Escribe un array de 20 números entre 0 y 100
 * y luego escríbelo de nuevo con los pares primeros.
 * 
 * 
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_7;

import java.util.Scanner;

public class Tema07Ej09y10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    /*int n[] = new int[8];

    for (int i = 0; i < 8; i++) {
      System.out.print("Introduce un número entero: ");
      n[i] = sc.nextInt();
    }
    for (int i = 0; i < 8; i++) {
      if (n[i]%2==0) {
        System.out.println(n[i]+" par");
      } else {
        System.out.println(n[i]+" impar");
      }
    }*/

    int array[] = new int[20];
    int cuentaPar = 0;
    int cuentaImpar = 0;
    
    int numPar[] = new int[20];
    int numImpar[] = new int[20];

    System.out.println("Introduce 20 números: ");
    for (int i = 0; i < 20; i++) {
      array[i] = (int)(Math.random()*101);
      System.out.print(array[i]+" ");
      if (array[i]%2==0) {
        numPar[cuentaPar++] = array[i];
      } else {
        numImpar[cuentaImpar++] = array[i];
      }
    }
    System.out.println();
    
    System.out.println("\nNuevo array con pares primeros:");
    for (int i = 0; i < cuentaPar; i++) {
      System.out.print(numPar[i]+" ");
    }
    for (int i = 0; i < cuentaImpar; i++) {
      System.out.print(numImpar[i]+" ");
    }
    sc.close();
  }
}
