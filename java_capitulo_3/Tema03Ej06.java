package java_capitulo_3;

public class Tema03Ej06 {
  public static void main(String[] args) {
    System.out.print("Introduce la altura de un triángulo: ");
    int altura = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce su base: ");
    int base = Integer.parseInt(System.console().readLine());

    System.out.println((altura*base)/2);
  }
}
