package java_capitulo_6;

import java.util.Scanner;

public class Tema06Ej31 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("¿Cuánto dinero quieres apostar?: ");
    int dinero = sc.nextInt();
    int dado1 = (int)(Math.random()*6)+1;
    int dado2 = (int)(Math.random()*6)+1;
    int suma = dado1+dado2;

    System.out.println("Dados 1: "+dado1);
    System.out.println("Dados 2: "+dado2);
    
    switch (suma) {
      case 7:
      case 11:
        System.out.print("¡Enhorabuena! ¡Ha ganado otros "+dinero+"$!.\n");
        System.out.print("Ahora tienes "+dinero*2+"$");
        break;
      case 2:
      case 3:
      case 12:
        System.out.print("Lo siento ha perdido la partida.");
        break;
      default:
        int primeraSuma = suma;
        boolean fin = false;
        do {
          System.out.println("\nContinue jugando.\nPulse INTRO para tirar los dados.");
          sc.nextLine();
          dado1 = (int)(Math.random()*6)+1;
          dado2 = (int)(Math.random()*6)+1;
          suma = dado1+dado2;
          System.out.println("Dado 1: "+dado1);
          System.out.println("Dado 2: "+dado2);
          if (suma==7) {
            System.out.println("Lo siento. Ha perdido todo su dinero.");
            fin = true;
          } else if (suma==primeraSuma) {
            System.out.println("Enhorabuena! ¡Has ganado otros "+dinero*2+"$.");
            System.out.println("Tienes "+dinero*2+"$");
            fin = true;
          } else {
            fin = false;
          }
        } while (!fin);
        break;
    }
    sc.close();
  }
}
