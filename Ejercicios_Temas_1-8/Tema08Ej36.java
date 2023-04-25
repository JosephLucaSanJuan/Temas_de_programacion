/**
 * Tema08
 * 
 * 36º Genera un array y filtra los números primos que contiene.
 * 
 * @author Joseph Luca San Juan Thompson
 */

import java.util.Scanner;

public class Tema08Ej36 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la longitud del array: ");
    int longitud = sc.nextInt();
    System.out.println("Introduce los intérvalos del array:");
    int p1 = sc.nextInt();
    int p2 = sc.nextInt();
    int array1[] = arrays.Arrays.generaArrayInt(longitud, p1, p2);

    System.out.println("\nArray original:");
    arrays.Arrays.mostrarArray(array1);
    System.out.println("\nArray Nuevo");
    arrays.Arrays.mostrarArray(filtrarPrimos(array1));
    sc.close();
  }

  public static int[] filtrarPrimos(int a[]) {
    int primos[] = new int[a.length];
    int cuentaPrimos = 0;
    for (int i : a) {
      if (esPrimo(i)) {
        primos[cuentaPrimos] = i;
        cuentaPrimos++;
      }
    }

    int p[] = new int[cuentaPrimos];
    for (int i = 0; i < p.length; i++) {
      p[i] = primos[i];
    }
    return p;
  }

  public static boolean esPrimo(int n){
    if (n < 0) {
      n = -n;
    } 
    if (n < 2) {
      return false;
    }

    for (int i = 2; i < n/2; i++) {
      if (n%i==0) {
        return false;
      }
    }
    return true;
  }
}
