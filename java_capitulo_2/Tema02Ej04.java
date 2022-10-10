package java_capitulo_2;

public class Tema02Ej04 {
  public static void main(String[] args) {
    System.out.print("Introduce cuántos euros quieres convertir: ");
    double euro = Double.parseDouble(System.console().readLine());

    double conversion = euro*166.386;
    System.out.println(conversion);
  }
}
