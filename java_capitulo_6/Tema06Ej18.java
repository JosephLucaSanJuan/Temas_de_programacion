/**
 * Tema06Ej18
 */
package java_capitulo_6;

public class Tema06Ej18 {
  public static void main(String[] args) {
    int numColor = 0;
    int color1 = 0;
    int color2 = 0;
    int color3 = 0;
    boolean diferentes = false;

    while (!diferentes) {
      diferentes=false;

      for (int i = 1; i <= 3; i++) {
        numColor = (int)(Math.random()*6+1);
        switch (numColor) {
          case 1:
            System.out.print("\033[0;91m rojo");
            break;
          case 2:
            System.out.print("\033[0;34m azul");
            break;
          case 3:
            System.out.print("\033[0;32m amarillo");
            break;
          case 4:
            System.out.print("\033[0;36m verde");
            break;
          case 5:
            System.out.print("\033[0;33m naranja");
            break;
          case 6:
            System.out.print("\033[0;95m violeta");
            break;
          default:
            break;
        }

        switch (i) {
          case 1:
            color1 = numColor;
            break;
          case 2:
            color2 = numColor;
            break;
          case 3:
            color3 = numColor;
            break;
          default:
            break;
        }
        System.out.print(" ");
      }
      System.out.println();

      if (color1!=color2 && color2!=color3 && color1!=color3) {
        diferentes=true;
      } else {
        diferentes=false;
      }
    }
  }
}
