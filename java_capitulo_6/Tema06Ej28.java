/**
 * Tema06
 * 28º Dibuja HOLA con asteriscos.
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_6;

public class Tema06Ej28 {
  public static void main(String[] args) {
    int alt = (int)(Math.random()*6)*2+3;
    System.out.printf("Altura: %d\n",alt);

    System.out.println("*    *   ****   *        ****");
    for (int i = 0; i<alt/2; i++) {
      System.out.println("*    *  *    *  *       *    *");
    }
    System.out.println("******  *    *  *       ******");
    for (int i = 0; i<alt/2; i++) {
      System.out.println("*    *  *    *  *       *    *");
    }
    System.out.print("*    *   ****   ******  *    *");
  }
}
