/**
 * Tema05
 * 28º Calcula el factorial de un número leído.
 */

import java.util.Scanner;

public class Tema05Ej28 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Por favor, introduzca un número entero: ");
    int n = sc.nextInt();
    int num = n;

    for (int i = num-1; i > 0; i--) {
      num*=i;
    }
    System.out.println(n+" != "+num);
    sc.close();
  }
}
