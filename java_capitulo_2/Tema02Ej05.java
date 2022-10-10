package java_capitulo_2;

public class Tema02Ej05 {
  public static void main(String[] args) {
    System.out.print("Introduce cuántas pesetas quieres convertir: ");
    double p = Double.parseDouble(System.console().readLine());

    double conversion = p/166.386;
    System.out.println(conversion);
  }
}
