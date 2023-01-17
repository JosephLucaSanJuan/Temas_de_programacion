package Ejercicio2;

import java.util.Scanner;

public class Tema09Ej02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("1. Anda con la bicicleta");
    System.out.println("2. Haz el caballito");
    System.out.println("3. Anda con el coche");
    System.out.println("4. Quema rueda");
    System.out.println("5. Kms Bicicleta");
    System.out.println("6. Kms Coches");
    System.out.println("7. Kms Totales");
    System.out.println("8. Salir");
    
    Bicicleta b = new Bicicleta(8);
    Coche c = new Coche(7);
    boolean salir = false;
    do {
      System.out.print("\nElige una opción (1-8): ");
      int opcion = sc.nextInt();
      int kmRec = 0;
      salir = false;

      switch (opcion) {
        case 1:
          System.out.print("¿Cuántos vamos a recorrer? ");
          kmRec = sc.nextInt();
          b.recorre(kmRec);
          break;
        case 2:
          b.caballito();
          break;
        case 3:
          System.out.print("¿Cuántos vamos a recorrer? ");
          kmRec = sc.nextInt();
          b.recorre(kmRec);
          break;
        case 4:
          c.quemaRuedas();
          break;
        case 5:
          System.out.println("La bicicleta ha recorrido " + b.getKilometrosRecorridos()+" Km.");
          break;
        case 6:
          System.out.println("El coche ha recorrido " + b.getKilometrosRecorridos()+" Km.");
          break;
        case 7:
          System.out.println("Los vehículos han recorrido en total " + Vehiculo.getKilometrosTotales()+" Km.");
          break;
        case 8:
          salir = true;
          break;
        default:
          break;
      }
    } while (!salir);
    sc.close();
  }
}
