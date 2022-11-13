/**
 * Tema 6
 * 1º Muestra la tirada de 3 dados.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_6;

public class Tema06Ej01 {
  public static void main(String[] args) {
    System.out.println("Tira 3 dados y muetra sus resultado y la suma de estos.");
    int dados = 0;
    int suma = 0;

    for (int i = 1; i <= 3; i++) {
      dados = (int)(Math.random()*6+1);
      System.out.println(dados);
      suma += dados;
    }
    System.out.printf("La suma de los tres dados es %d", suma);
  }
}
