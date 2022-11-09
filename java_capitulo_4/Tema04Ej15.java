/**
 * Tema 4
 * 15º Crea una pirámide.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_4;

import java.util.Scanner;

public class Tema04Ej15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce el carácter con el que quieres contstruir la pirámide: ");
    String car = sc.nextLine();
    System.out.println("1. Arriba\n2. Abajo\n3. Izquierda\n4. Derecha");
    System.out.print("Indica en qué dirección quieres que apunte el vértice de la pirámide: ");
    int dir = sc.nextInt();

    switch (dir) {
      case 1:
        System.out.println("    "+car+"    ");
        System.out.println("   "+car+car+car+"   ");
        System.out.println("  "+car+car+car+car+car+"  ");
        System.out.println(" "+car+car+car+car+car+car+car+" ");
        System.out.println(car+car+car+car+car+car+car+car+car);
        break;
      case 2:
        System.out.println(car+car+car+car+car+car+car+car+car);
        System.out.println(" "+car+car+car+car+car+car+car+" ");
        System.out.println("  "+car+car+car+car+car+"  ");
        System.out.println("   "+car+car+car+"   ");
        System.out.println("    "+car+"    ");
        break;
      case 3:
        System.out.println("    "+car);
        System.out.println("   "+car+car);
        System.out.println("  "+car+car+car);
        System.out.println(" "+car+car+car+car);
        System.out.println(car+car+car+car+car);
        System.out.println(" "+car+car+car+car);
        System.out.println("  "+car+car+car);
        System.out.println("   "+car+car);
        System.out.println("    "+car);
        break;
      case 4:
        System.out.println(car);
        System.out.println(car+car);
        System.out.println(car+car+car);
        System.out.println(car+car+car+car);
        System.out.println(car+car+car+car+car);
        System.out.println(car+car+car+car);
        System.out.println(car+car+car);
        System.out.println(car+car);
        System.out.println(car);
        break;
      default:
        break;
    }
    sc.close();
  }
}
