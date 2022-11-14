/**
 * Tema06Ej14
 * 
 * @author Joseph Luca san Juan Thompson
 */
package java_capitulo_6;

import java.util.Scanner;

public class Tema06Ej14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("¿En qué número piensas?");
    int n = 0;
    //int numInt = 0;
    int intentos = 5;
    int respuesta = 0;

    while (intentos!=0) {
      n = (int)(Math.random()*101);
      System.out.print("Estas pensando en el número "+n);
      System.out.println("\n1. Si\n2.Más grande\n3. Más pequeño");
      respuesta = sc.nextInt();

      if (respuesta==1) {
        intentos = 0;
        System.out.println("Programa superior, Joseph inferior");
      } else if ((respuesta==2) && (intentos != 1)) {
        System.out.println((intentos-1)+" intentos restantes. Intentaremos un número más grande.");
      } else if ((respuesta==3) && (intentos!=1)) {
        System.out.println((intentos-1)+" intentos restantes. Intentaremos un número más pequeño.");
      }

      if ((intentos == 1) && (respuesta != 1)) {
        System.out.println("Intentos agotados. Iniciando autodestrucción.");
      }
      intentos--;
    }
    sc.close();
  }
}