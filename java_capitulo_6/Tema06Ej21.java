/**
 * Tema06
 * 21º Tira 5 monedas y escribe la posición en la que caen.
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_6;

public class Tema06Ej21 {
  public static void main(String[] args) {
    int moneda = 0;
    int posicion = 0;

    for (int i = 0; i < 5; i++) {
      moneda = (int)(Math.random()*8+1);
      posicion = (int)(Math.random()*2+1);

      switch (moneda) {
        case 1:
          System.out.print("1 céntimo");
          break;
        case 2:
          System.out.print("2 céntimos");
          break;
        case 3:
          System.out.print("5 céntimos");
          break;
        case 4:
          System.out.print("10 céntimos");
          break;
        case 5:
          System.out.print("20 céntimos");
          break;
        case 6:
          System.out.print("50 céntimos");
          break;
        case 7:
          System.out.print("1 euros");
          break;
        case 8:
          System.out.print("2 euros");
          break;
        default:
          break;
      }

      System.out.print(" - ");

      switch (posicion) {
        case 1:
          System.out.println("cara");
          break;
        case 2:
          System.out.println("cruz");
          break;
        default:
          break;
      }
    }
  }
}
