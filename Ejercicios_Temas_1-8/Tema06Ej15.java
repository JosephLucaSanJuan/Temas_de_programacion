/**
 * Tema06
 * 15º Escribe una partitura.
 * 
 * @author Joseph Luca San Juan Thompson
 */

import java.util.Scanner;

public class Tema06Ej15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nota1 = "";
    int numNotas = (int)(Math.random()*7+1)*4;
    String nota = "";
    int cuentaNotas = 0;

    do {
      int n = (int)(Math.random()*7);

      for (int i = 0; i < 4; i++) {
        n = (int)(Math.random()*7);
        switch (n) {
          case 0:
            nota = "do ";
            break;
          case 1:
            nota = "re ";
            break;
          case 2:
            nota = "mi ";
            break;
          case 3:
            nota = "fa ";
            break;
          case 4:
            nota = "sol ";
            break;
          case 5:
            nota = "la ";
            break;
          case 6:
            nota = "si ";
            break;
          default:
            break;
        }

        System.out.print(nota+" ");
        if (cuentaNotas == 0) {
          nota1 = nota;
        }
        if (cuentaNotas==numNotas-1) {
          nota = nota1;
        }
        cuentaNotas++;
      }

      if (cuentaNotas<numNotas-1) {
        System.out.print("| ");
      }
    } while (cuentaNotas<numNotas);
    System.out.println("||");
    sc.close();
  }
}
