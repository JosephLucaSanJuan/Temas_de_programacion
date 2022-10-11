package java_capitulo_3;

public class Tema03Ej01 {
  public static void main(String[] args) {
    System.out.print("Introduce un número: ");
    int n1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce otro: ");
    int n2 = Integer.parseInt(System.console().readLine());

    System.out.println(n1*n2);
  }
}
