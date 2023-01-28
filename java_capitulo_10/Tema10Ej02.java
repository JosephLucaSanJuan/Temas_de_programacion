/**
 * Tema 10
 * 2º Crea un ArrayList, añade 6 nombrrs y muéstralos.
 * 
 * @author Joseph Luca San Juan Thompson
 */
package java_capitulo_10;

import java.util.ArrayList;

public class Tema10Ej02 {
  public static void main(String[] args) {
    int arrayLength = (int)(Math.random()*11 + 10);
    int minimo = Integer.MAX_VALUE;
    int maximo = Integer.MIN_VALUE;
    int cuentaNum = 0;
    int suma = 0;

    ArrayList<Integer> numeros = new ArrayList<Integer>();

    for (int i = 0; i < arrayLength; i++) {
      int valor = (int)(Math.random()*101);
      numeros.add(valor);
      if (valor > maximo) {
        maximo = valor;
      } else if (valor < minimo) {
         minimo= valor;
      }
      suma += valor;
      cuentaNum++;
    }
    System.out.println(numeros);

    System.out.println("La suma es " + suma);
    System.out.println("El número máximo es " + maximo);
    System.out.println("El número mínimo es " + minimo);
    System.out.println("La media del array es " + suma/cuentaNum);
  }
}
