package Array_de_objetos.Ejercicio3;

import java.util.Scanner;

public class ColeccionDeDisco {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Disco[] coleccion = new Disco[100];

    /*for (int i = 0; i < 100; i++) {
      coleccion[i]=new Disco();
    }*/

    int op, duracion;
    String codigo, autor, titulo, genero, duracionString;

    do {
      System.out.println("\n\nCOLECCIÓN DE DISCOS");
      System.out.println("===================");
      System.out.println("1. Listado de Discos");
      System.out.println("2. Crea un disco");
      System.out.println("3. Modifica un disco");
      System.out.println("4. Borrar un disco");
      System.out.println("5. Salir");
      System.out.print("Elige una opcion: ");
      op = sc.nextInt();

      switch (op) {
        case 1:
          System.out.println("\nLISTADO DE DISCOS");
          System.out.println("================");
          for (int i = 0; i < 100; i++) {
            if (!coleccion[i].getCodigo().equals("VACIO")) {
              System.out.println(coleccion[i]);
            }
          }
          break;
      
        case 2:
          System.out.println("\nCREA UN DISCO");
          System.out.println("=============");

          System.out.print("Introduce el código del disco");
          codigo=sc.nextLine();

          System.out.print("Introduce el autor: ");
          autor=sc.nextLine();

          System.out.print("Introduce el titulo: ");
          titulo=sc.nextLine();

          System.out.print("Introduce el genero: ");
          genero=sc.nextLine();

          System.out.print("Introduce el duracion: ");
          duracion=sc.nextInt();
          break;
      
        case 3:
          
          break;
      
        case 4:
          
          break;
      
        default:
          break;
      }
    } while (op!=5);
    sc.close();
  }
}
