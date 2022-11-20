/**
 * Tema06
 * 27º Juega piedra, papel o tijeras con un ordenador.
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_6;

import java.util.Scanner;

public class Tema06Ej27 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Turno del jugador (Introduce piedra, papel o tijera): ");
    String miTurno = sc.nextLine();
    System.out.println("Turno del ordenador: ");
    String turno02 = "";
    int turno = (int)(Math.random()*3);

    switch (turno) {
      case 0:
        turno02 = "piedra";
        break;
      case 1:
        turno02 = "papel";
        break;
      case 2:
        turno02 = "tijeras";
        break;
      default:
        break;
    }
    System.out.println(turno02);

    if (turno02.equals(miTurno)) {
      System.out.println("Empate.");
    } else {
      if ((turno02.equals("piedra")&&miTurno.equals("tijeras")) || (turno02.equals("tijeras")&&miTurno.equals("papel")) || (turno02.equals("papel")&&miTurno.equals("piedra"))) {
        System.out.println("Gana el ordenador.");
      } else {
        System.out.println("Gana el jugador.");
      }
    }
    sc.close();
  }
}
