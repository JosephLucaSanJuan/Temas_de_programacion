package java_capitulo_3;

public class Tema03Ej05 {
  public static void main(String[] args) {
    System.out.print("Introduce la altura de un rectángulo: ");
    int altura = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce su longitud: ");
    int longitud = Integer.parseInt(System.console().readLine());

    System.out.println(altura*longitud);
  }
}
