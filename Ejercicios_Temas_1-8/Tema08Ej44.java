/**
 * Tema08
 * 
 * 44º Crea una función para escribir una figura basándote en la altura
 * 
 * @author Joseph Luca San Juan Thompson
 */

import java.util.Scanner;

public class Tema08Ej44 {
  public static Scanner sc;
  public static void inicializar() {
    sc = new Scanner(System.in);
  }
  public static void cerrar() {
    sc.close();
  }

  public static void main(String[] args) {
    inicializar();
    System.out.print("Introduce la altura de la pirámide: ");
    int alt = sc.nextInt();
    piramide(alt);
    cerrar();
  }

  public static void piramide(int alt) {
    int niveles = 0;
    do {
      System.out.println(linea(alt, niveles+1));
      niveles++;
    } while (niveles < alt);
  }

  public static String linea(int altura, int espacios) {
    String linea = "";
    for (int i = 0; i < altura-1; i++) {
      if (i == espacios-1 || espacios==1) {
        linea+="*";
      } else {
        linea += " ";
      }
    }
    if (espacios <= altura) {
      linea += "*";
    }
    return linea;
  }
}
