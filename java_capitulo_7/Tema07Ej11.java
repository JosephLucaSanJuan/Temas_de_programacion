/**
 * Tema07
 * 11º Escribe un array de 10 números.
 * Reescríbelo con los impares primero.
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_7;

public class Tema07Ej11 {
  public static void main(String[] args) {
    int n[] = new int[10];
    int nPar[] = new int[10];
    int nImpar[] = new int[10];
    int cuentaPar = 0;
    int cuentaImpar= 0;

    System.out.println("Array original:");
    System.out.print("Índice |");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%3d |", i);
    }
    System.out.print("\n Valor |");
    for (int i = 0; i < 10; i++) {
      n[i] = (int)(Math.random()*100);
      System.out.printf("%3d |", n[i]);
      if (n[i]%2==0) {
        nPar[cuentaPar++] = n[i];
      } else {
        nImpar[cuentaImpar++] = n[i];
      }
    }
    System.out.println();

    System.out.println("\nNuevo Array:");
    System.out.print("Índice |");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%3d |", i);
    }
    System.out.print("\n Valor |");
    for (int i = 0; i < cuentaImpar; i++) {
      System.out.printf("%3d |", nImpar[i]);
    }
    for (int i = 0; i < cuentaPar; i++) {
      System.out.printf("%3d |", nPar[i]);
    }
  }
}
