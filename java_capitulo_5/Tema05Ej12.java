/**
 * Tema 5
 * 12º Escribe los n primeros números de la sucesión de fibonacci
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

public class Tema05Ej12 {
  public static void main(String[] args) {
    System.out.print("Escribe un número: ");
    int n = Integer.parseInt(System.console().readLine());
    int num = 0;
    int numAnt=1;
    int sumaAnt = 0;

    for (int i = 0; i < n; i++) {
      num = numAnt;
      numAnt = sumaAnt;
      sumaAnt += num;
      System.out.print(sumaAnt+" ");
    }
  }
}
