/**
 * Tema 10
 * 5º Crea un programa que cree discos para modificar, añadir o borrar.
 * 
 * @author Joseph Luca San Juan Thompson
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Tema10Ej05 {
  public static void main(String[] args) {
    ArrayList<Disco> discos = new ArrayList<Disco>();

    discos.add(new Disco("12", "Walking With Dinosaurs", "Tim Haines", "documental"));
    discos.add(new Disco("24", "Steven Universe", "Rebbeca Sugar", "serie animada"));
    discos.add(new Disco("36", "Transformers Animated", "Ciro Nieli", "serie animada"));
    discos.add(new Disco("48", "A Game Of Thrones", "George RR Martin", "libro"));

    Scanner s = new Scanner(System.in);
    int op;
    String codInt;
    String titInt;
    String autInt;
    String tipInt;
    int x;

    do {
      System.out.println("==============");
      System.out.println("1. Listado");
      System.out.println("2. Nuevo Disco");
      System.out.println("3. Modificar");
      System.out.println("4. Borrar");
      System.out.println("5. Salir");
      System.out.print("Elige una opción: ");
      op = Integer.parseInt(System.console().readLine());

      switch (op) {
      case 1:
        System.out.println("\nLISTADO");
        for (Disco d: discos) {
          System.out.println(d);
        }
        break;

      case 2:
        System.out.println("\nNUEVO DISCO");
        System.out.println("Introduce el código de la pieza: ");
        codInt = s.nextLine();
        System.out.println("Introduce el título de la pieza de media: ");
        titInt = s.nextLine();
        System.out.println("Introduce el nombre del autor(a): ");
        autInt = s.nextLine();
        System.out.println("Introduce el tipo de soporte de historia: ");
        tipInt = s.nextLine();
        discos.add(new Disco(codInt, titInt, autInt, tipInt));
        break;
      case 3:
        System.out.println("\nMODIFICAR");
        System.out.print("Introduce el código del disco: ");
        codInt = s.nextLine();
        Disco d = new Disco(codInt, "", "", "");
        while (!discos.equals(d)) {
          System.out.println("Disco no registrado");
          System.out.println("Introduce un código válido: ");
          codInt = s.nextLine();
        }
        x = discos.indexOf(d);

        System.out.println("Introduce los nuevos datos del disco o pulsa INTRO para dejarlos igual.");

        System.out.format("Código: %s" + discos.get(x).getCodigo());
        System.out.print("Introduce el nuevo código: ");
        codInt = s.nextLine();
        if (!codInt.equals("")) {
          discos.get(x).setCodigo(codInt);
        }

        System.out.format("Titulo: %s" + discos.get(x).getTitulo());
        System.out.print("Introduce el nuevo titulo: ");
        titInt = s.nextLine();
        if (!titInt.equals("")) {
          discos.get(x).setTitulo(titInt);
        }

        System.out.format("Autor: %s" + discos.get(x).getAutor());
        System.out.println("Introduce el nuevo autor: ");
        autInt = s.nextLine();
        if (!autInt.equals("")) {
          discos.get(x).setAutor(autInt);
        }

        System.out.format("Tipo: %s" + discos.get(x).getTipo());
        System.out.print("Introduce el nuevo tipo: ");
        tipInt = s.nextLine();
        if (!tipInt.equals("")) {
          discos.get(x).setTipo(tipInt);
        }
        /*/**/
        break;
      
      case 4:
        System.out.println("\nBORRAR");
        
        System.out.println("Introduce el código del disco que quieres borrar: ");
        codInt = s.nextLine();
        int indiceParaBorrar = discos.indexOf(new Disco(codInt, "", "", ""));
        discos.remove(indiceParaBorrar);
        break;

      default:
      }
    } while (op != 5);
    s.close();
  }
}