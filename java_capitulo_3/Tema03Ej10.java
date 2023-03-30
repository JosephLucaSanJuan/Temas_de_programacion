import java.util.Scanner;

public class Tema03Ej10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce la cantidad de Megabytes que quieres convertir: ");
    int mb = sc.nextInt();
    int conversion = mb*1000;

    System.out.printf("%d Megabytes son %d Kilobytes.", mb, conversion);
    sc.close();
  }
}
