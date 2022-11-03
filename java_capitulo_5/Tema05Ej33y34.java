/**
 * Tema 5
 * 33º Escribe la letra U con asteriscos.
 * 
 * 34º Escribe dos números y mezcla en dos otros los dígitos pares e impares.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej33y34 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    /*System.out.print("Introduce la altura de la U: ");
    int alt = sc.nextInt();

    for (int i = 1; i < alt; i++) {
      System.out.print("*");
      for (int j = 1; j <= alt-2; j++) {
        System.out.print(" ");
      }
      System.out.print("*\n");
    }

    System.out.print(" ");
    for (int i = 1; i <= alt-2; i++) {
      System.out.print("*");
    }*/

    System.out.print("Introduce un número: ");
    long n1 = sc.nextLong();
    System.out.print("Introduce otro: ");
    long n2 = sc.nextLong();
    long n = n1;
    long m = n2;
    long mezcla = 0;
    int numPares = 0;
    int numImpares = 0;
    int v = 0;

    while (n != 0) {
      v = (int)(n%10);
      mezcla = mezcla*10 + v;
      if (v%2==0) {
        numPares++;
      } else {
        numImpares++;
      }

      v = (int)(m%10);
      mezcla = mezcla*10 + v;
      if (v%2==0) {
        numPares++;
      } else {
        numImpares++;
      }

      n /= 10;
      m /= 10;
    }
    System.out.println(mezcla+" pares:"+numPares+" impares:"+numImpares);
    long digPar = 0;
    long digImpar = 0;
    int cont = 0;
    int valores = numPares+numImpares;
    int cuentaPar = 1;
    int cuentaImpar = 1;

    while (cont <= valores) {
      v = (int)(mezcla%10);
      if (v%2==0) {
        digPar=digPar + (long)(v*Math.pow(10, (numPares-cuentaPar)));
        cuentaPar++;
      } else {
        digImpar=digImpar + (long)(v*Math.pow(10, (numImpares-cuentaImpar)));
        cuentaImpar++; 
      }
      mezcla/=10;
      cont++;
    }
    System.out.print("El número formado por los dígitos pares: "+digPar);
    System.out.print("\nEl número formado por los dígitos impares: "+digImpar);
    sc.close();
  }
}
