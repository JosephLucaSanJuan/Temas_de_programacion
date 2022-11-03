package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej39 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int n = sc.nextInt();
    int fact = 1;

    for (int i = 1; i <= n; i++) {
      fact *= i;
      System.out.println(i+"!="+fact);
    }
    sc.close();
  }
}
