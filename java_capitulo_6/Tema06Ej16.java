/**
 * Tema06
 * 16º Crea una programa tragaperras.
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_6;

public class Tema06Ej16 {
  public static void main(String[] args) {
    int figura;
    int figura1 = 0;
    int figura2 = 0;
    int figura3 = 0;

    for (int i = 0; i < 3; i++) {
      figura = (int)(Math.random()*5+1);
      switch (figura) {
        case 1:
          System.out.print("corazón");
          break;
        case 2:
          System.out.print("diamnate");
          break;
        case 3:
          System.out.print("herradura");
          break;
        case 4:
          System.out.print("campana");
          break;
        case 5:
          System.out.print("limón");
          break;
        default:
          break;
      }
  
      switch (i) {
        case 1:
          figura1 = figura;
          break;
        case 2:
          figura2 = figura;
          break;
        case 3:
          figura3 = figura;
          break;
        default:
          break;
      }
      System.out.print(" ");
    }
      
    if ((figura1==figura2) && (figura2==figura3)) {
      System.out.println("\nEnhorabuena has ganado 10 monedas.");
    } else if ((figura1==figura2) || (figura2==figura3) || (figura1==figura3)) {
      System.out.println("\nBien ha recuperado su moneda");
    } else {
      System.out.println("\nLo siento, ha perdido.");
    }
  }
}
