package java_capitulo_10.Ejercicio16;

import java.util.Scanner;

public class Tema10Ej16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean salir = false;
    Paises paises = new Paises();
    
    do {
      System.out.print("Introduce un país y te diré su capital: ");
      String pais = sc.nextLine();
      String capital = paises.getCapital(pais);
      if (pais.equals("salir")) {
        salir = true;
      } else {
        if(capital!=null){
          System.out.format("La capital de %s es %s", pais, capital);
          System.out.println();
        } else {
          System.out.printf("No conozco ese país ¿cuál es la capital de %s?: ", pais);
          capital = sc.nextLine();
          paises.anade(pais, capital);
          System.out.println("Gracias por enseñarme nuevas capitales.");
        }
      }
    } while (!salir);
    sc.close();
  }
}
