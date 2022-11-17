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

      for (int i = 0; i < 3; i++) {
        numColor = (int)(Math.random()*6+1);
        switch (numColor) {
          case 1:
            System.out.println("rojo");
            break;
          case 2:
            System.out.println("azul");
            break;
          case 3:
            System.out.print("amarillo");
            break;
          case 4:
            System.out.print("verde");
            break;
          case 5:
            System.out.print("naranja");
            break;
          case 6:
            System.out.print("violeta");
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

      if (color1!=color2 || color2!=color3 || color1!=color3) {
        diferentes=true;
      } else {
        diferentes=false;
      }
    }
  }
}
