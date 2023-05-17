package Array_de_objetos.Ejercicio3;

import java.util.Scanner;

public class ColeccionDeDisco {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Disco[] coleccion = new Disco[100];

    for (int i = 0; i < 100; i++) {
      coleccion[i]=new Disco();
    }/**/

    int op, duracion, huecoLibre;
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

          huecoLibre=-1;
          do {
            huecoLibre++;
          } while (!((coleccion[huecoLibre].getCodigo()).equals("VACIO")));

          System.out.print("Introduce el código del disco: ");
          codigo=sc.nextLine();
          coleccion[huecoLibre].setCodigo(codigo);

          System.out.print("Introduce el autor: ");
          autor=sc.nextLine();
          coleccion[huecoLibre].setAutor(autor);

          System.out.print("Introduce el titulo: ");
          titulo=sc.nextLine();
          coleccion[huecoLibre].setTitulo(titulo);

          System.out.print("Introduce el genero: ");
          genero=sc.nextLine();
          coleccion[huecoLibre].setGenero(genero);

          System.out.print("Introduce el duracion: ");
          duracion=sc.nextInt();
          coleccion[huecoLibre].setDuracion(duracion);
          break;
      
        case 3:
          System.out.println("\nMODIFICA UN DISCO");
          System.out.println("=================");
          
          System.out.print("Introduce el código del disco que quieres modificar: ");
          codigo = sc.nextLine();

          huecoLibre = -1;
          do {
            huecoLibre++;
          } while (!((coleccion[huecoLibre].getCodigo()).equals(codigo)));

          System.out.println("Introduce los nuevos datos del disco o pulsa INTRO si los quieres dejar igual.");
          System.out.print("Introduce el nuevo código del disco: ");
          codigo=sc.nextLine();
          if (!codigo.equals("")) {
            coleccion[huecoLibre].setCodigo(codigo);
          }

          System.out.print("Introduce el autor: ");
          autor=sc.nextLine();
          if (!autor.equals("")) {
            coleccion[huecoLibre].setAutor(autor);
          }

          System.out.print("Introduce el titulo: ");
          titulo=sc.nextLine();
          if (!titulo.equals("")) {
            coleccion[huecoLibre].setTitulo(titulo);
          }

          System.out.print("Introduce el genero: ");
          genero=sc.nextLine();
          if (!genero.equals("")) {
            coleccion[huecoLibre].setGenero(genero);
          }

          System.out.print("Introduce el duracion: ");
          duracionString=sc.nextLine();
          if (!duracionString.equals("")) {
            coleccion[huecoLibre].setDuracion(Integer.parseInt(duracionString));
          }
          break;
      
        case 4:
          System.out.println("\nBORRAR UN DISCO");
          System.out.println("===============");

          System.out.print("Introduce el código del disco a borrar: ");
          codigo = sc.nextLine();

          huecoLibre = -1;
          do {
            huecoLibre++;
          } while (!((coleccion[huecoLibre].getCodigo()).equals(codigo)));
          
          coleccion[huecoLibre].setCodigo("VACIO");
          System.out.println("Album borrado.");
          break;
      
        default:
          break;
      }
    } while (op!=5);
    sc.close();
  }
}
