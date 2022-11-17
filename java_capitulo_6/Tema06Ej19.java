/**
 * Tema06Ej19
 */
package java_capitulo_6;

public class Tema06Ej19 {
  public static void main(String[] args) {
    int n = 0;
    int maxPar = Integer.MIN_VALUE;
    int minImpar = Integer.MAX_VALUE;
    int suma = 0;

    for (int i = 0; i < 50; i++) {
      n = (int)(Math.random()*301)-100;
      System.out.print(n+" ");
      suma += n;
      if (n%2==0) {
        if (n>maxPar) {
          maxPar=n;
        }
      } else {
        if (n<minImpar) {
          minImpar = n;
        }
      }
    }
    System.out.println("\nMáximo: "+maxPar);
    System.out.println("Mínimo: "+minImpar);
    System.out.println("Media: "+suma/50);
  }
}