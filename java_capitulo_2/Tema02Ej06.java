package java_capitulo_2;

public class Tema02Ej06 {
  public static void main(String[] args) {
    System.out.print("Introduce una base imponible: ");
    double baseImp = Double.parseDouble(System.console().readLine());

    double IVA = 0.21;
    System.out.println("\nIVA " + IVA);
    double factura = baseImp*IVA;
    System.out.println(factura);
  }
}
