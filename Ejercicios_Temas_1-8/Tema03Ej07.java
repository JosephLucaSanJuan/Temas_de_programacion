import java.util.Scanner;

public class Tema03Ej07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce la base imponible: ");
    double baseImponible = sc.nextDouble();
    double IVA = 21;
    double precioIVA = (baseImponible*IVA)/100;

    System.out.printf("\nBase Imponible: %8.2f $", baseImponible);
    System.out.printf("\nIVA (21%%):     %9.2f $", precioIVA);
    System.out.printf("\nPrecio con IVA: %8.2f $", (baseImponible+precioIVA));
    sc.close();
  }
}
