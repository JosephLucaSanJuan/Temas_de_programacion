/**
 * Tema 4
 * 1º ¿Que asignatura hay a primera hora
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_4;

public class Tema04Ej01 {
  public static void main(String[] args) {
    System.out.print("Introduce un día de la semana: ");
    String d = System.console().readLine();

    if (d.equals("lunes")) {
      System.out.println("Programación");
    } else if (d.equals("martes")) {
      System.out.println("Sistemas Informáticos");
    } else if (d.equals("miercoles")) {
      System.out.println("Entornos de Desarrollo");
    } else if (d.equals("jueves")) {
      System.out.println("Programación");
    } else if (d.equals("viernes")) {
      System.out.println("FOL");
    } else {
      System.out.println("Ese día no hay clase");
    }
  }
}
