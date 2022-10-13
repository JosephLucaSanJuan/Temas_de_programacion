package java_capitulo_3;

public class Tema03Ej09 {
  public static void main(String[] args) {
    System.out.print("Introduce la altura del cono: ");
    double h = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce el radio de la base del mismo: ");
    double r = Double.parseDouble(System.console().readLine());

    double pi = 3.14;

    System.out.println((pi*(r*r)*h)/3);
  }
}
