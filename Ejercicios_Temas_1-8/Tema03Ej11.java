import java.util.Scanner;

public class Tema03Ej11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce la cantidad de Kilobytes que quieres covertir: ");
    double kb = sc.nextInt();
    double conversion = kb*0.001;

    System.out.printf("%f Kilobytes son %.4f Megabytes", kb, conversion);
    sc.close();
  }
}
