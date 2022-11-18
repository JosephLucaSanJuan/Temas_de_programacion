/**
 * Tema06
 * 23º Muestra la tirada de 5 dados de poker.
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_6;

public class Tema06Ej23 {
  public static void main(String[] args) {
    int dado = 0;

    for (int j = 1; j <= 6; j++) {
      dado = (int)(Math.random()*6+1);

      switch (dado) {
        case 1:
          System.out.print("As");
          break;
        case 2:
          System.out.print("K");
          break;
        case 3:
          System.out.print("Q");
          break;
        case 4:
          System.out.print("J");
          break;
        case 5:
          System.out.print(7);
          break;
        case 6:
          System.out.print(8);
          break;
        default:
          break;
      }
  
      System.out.print(" ");
    }
  }
}
