/**
 * Tema06
 * 26º Crea una tableta de turrón con un vocado.
 * 
 * @author Joseph Luca San Juan Thompson
 */

import java.util.Scanner;

public class Tema06Ej31 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la cantidad de dinero que quieres apostar: ");
    int dinero = sc.nextInt();
    int dado1 = (int)(Math.random()*6+1);
    int dado2 = (int)(Math.random()*6+1);
    int suma = dado1+dado2;

    System.out.println("Tira los dados:");
    System.out.println("Dado 1: "+dado1+"\nDado 2: "+dado2+"\nSuma: "+suma);

    switch (suma) {
      case 7:
      case 11:
        System.out.println("\nHas ganado otros "+dinero+" euros. Ahora tienes "+dinero*2+" euros. Fin de partida");
        break;
    
      case 2:
      case 3:
      case 12:
        System.out.println("\nLo siento has perdido todo tu dinero. Fin de partida");
      break;

      case 4:
      case 5:
      case 6:
      case 8:
      case 9: 
      case 10:
        int suma2 = 0;
        boolean fin = false;
        do {
          System.out.println("\nTira los dados de nuevo.");
          sc.nextLine();
          dado1 = (int)(Math.random()*6+1);
          dado2 = (int)(Math.random()*6+1);
          suma2 = dado1+dado2;
          fin = false;

          System.out.println("Dado1: "+dado1+"\nDado 2: "+dado2+"\nSuma: "+suma2);

          if (suma2==7) {
            System.out.println("\nLo siento has perdido.");
            fin = true;
          } else if (suma2==suma) {
            System.out.println("Enhorabuena has ganado otros "+dinero+". Tienes "+dinero*2+" euros. Fin de partida");
            fin = true;
          } else {
            fin = false;
          }
        } while (!fin);
      break;
      default:
        break;
    }
    sc.close();
  }
}
