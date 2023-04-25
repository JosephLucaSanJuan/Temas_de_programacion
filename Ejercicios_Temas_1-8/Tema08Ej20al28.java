import java.util.Scanner;

public class Tema08Ej20al28 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce el tamaño del array: ");
    int t = sc.nextInt();
    System.out.print("Introduce el valor mínimo del array: ");
    int min = sc.nextInt();
    System.out.print("Introduce el valor máximo del array: ");
    int max = sc.nextInt();
    int array[] = arrays.Arrays.generaArrayInt(t, min, max);

    arrays.Arrays.mostrarArray(array);
    System.out.println("El valor mínimo del array es "+arrays.Arrays.minimoArrayInt(array));
    System.out.println("El valor máximo del array es "+arrays.Arrays.maximoArrayInt(array));
    System.out.print("La media del array es "+arrays.Arrays.mediaArrayInt(array));

    System.out.print("\n\nIntroduce un número: ");
    int n = sc.nextInt();
    if (arrays.Arrays.estaEnArrayInt(array, n)) {
      System.out.println("El "+n+" está en el array.");
    } else {
      System.out.println("El "+n+" no está en el array.");
    }

    System.out.print("\nIntroduce un número que está en el array y te devolveremos su posición: ");
    n = sc.nextInt();
    System.out.println("El "+n+" está en la posición "+arrays.Arrays.posicionEnArrayInt(array, n));

    System.out.println("\nEl array volteado es:");
    arrays.Arrays.mostrarArray(arrays.Arrays.volteaArrayInt(array));

    System.out.print("\nIntroduce el número de veces que quieres rotar el array: ");
    int num = sc.nextInt();
    System.out.println("\nArray rotado hacia la derecha:");
    //System.out.println(arrays.Arrays.rotaDerechaArrayInt(array, num));

    System.out.println("\n\nArray rotado hacia la izquierda:");
    System.out.println(arrays.Arrays.rotaIzquierdaArrayInt(array, num));

    sc.close();
  }
}
