package java_capitulo_6;

import java.util.Scanner;

public class Tema06Ej32 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la longitud del sendero en metros: ");
    int longitud = sc.nextInt();
    int hayNoObst = 0;
    int obst = 0;
    int obstaculo = 0;
    int espacios = 6;
    int esp = 0;

    for (int i = 0; i < longitud; i++) {
      esp = (int)(Math.random()*3-1);
      for (int j = 0; j < espacios-esp; j++) {
        System.out.print(" ");
      }
      hayNoObst = (int)(Math.random()*2);
      obst = (int)(Math.random()*5);
      obstaculo = (int)(Math.random()*2);

      System.out.print("|");
      for (int j = 0; j < 5; j++) {
        if (hayNoObst==1) {
          if (j==obst) {
            if (obstaculo==0) {
              System.out.print("O");
            } else if (obstaculo==1) {
              System.out.print("*");
            }
          } else {
            System.out.print(" ");
          }
        } else {
          System.out.print(" ");
        }
      }
      System.out.println("|");
    }
    sc.close();
  }
}
