/**
 * Tema 4
 * 20º Averigua si el número introducido es capicúa.
 * 
 * @author Joseph Luca San Juan Thompson
 */

import java.util.Scanner;

public class Tema04Ej27 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("ELija un sabor de tarta (manzana, fresa o chocolate): ");
    String tarta = sc.nextLine();
    String chocolate = "";
    double precioTarta = 0;
    
    if (tarta.equals("chocolate")) {
      System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco) ");
      chocolate = sc.nextLine();
      if (chocolate.equals("negro")) {
        precioTarta = 14;
      } else if (chocolate.equals("blanco")){
        precioTarta = 15;
      }
    } else if (tarta.equals("fresa")) {
      precioTarta = 16;
    } else if (tarta.equals("manzana")) {
      precioTarta = 18;
    }

    System.out.print("¿Quieres nata? (si o no) ");
    String nata = sc.nextLine();
    System.out.print("¿Quiere ponerle nombre? ");
    String nombre = sc.nextLine();
    double total = precioTarta;

    if (tarta.equals("chocolate")) {
      System.out.printf("Tarta de %s %s: %.2f $\n", tarta, chocolate, precioTarta);
    } else {
      System.out.printf("Tarta de %s: %.2f $\n", tarta, precioTarta);
    }
    if (nata.equals("si")) {
      System.out.printf("Con nata: %.2f $\n", 2.50);
      total += 2.50;
    }
    if (nombre.equals("si")) {
      System.out.printf("Con nombre: %.2f $\n", 2.75);
      total += 2.75;
    }
    System.out.printf("Total: %.2f $", total);
    sc.close();
  }
}
