package java_capitulo_7;

public class EjArrayBi04 {
  public static void main(String[] args) {
    int array[][] = new int[6][6];
    int ancho = 6;

    for (int i = 0; i < ancho; i++) {
      for (int j = 0; j < ancho; j++) {
        array[i][j] = (int)(Math.random()*10);
        if (((i<ancho-1) && (i>0)) && ((j<ancho-1) && (j>0))) {
          System.out.print("  ");
        } else {
          System.out.printf("%d ", array[i][j]);
        }
      }
      System.out.println();
    }
    System.out.println();

    int y, x;
    for (int i = 0; i < 4; i++) {
      x = array[i][ancho-i-1];
      y = array[ancho-i-1][i];
      for (int j = 0; j < ancho; j++) {
        /*array[i][j] = array[j][i];
        array[i][j] = y;
        array[j][i] = x;*/
        if (((i==ancho-1) || (i==0)) || ((j==ancho-1) || (j==0))) {
          array[i][j] = array[ancho-i-1][i];
          array[ancho-i-1][i] = array[i][ancho-i-1];
          array[i][ancho-i-1] = array[i][j];
        }
      }
    }

    for (int i = 0; i < ancho; i++) {
      for (int j = 0; j < ancho; j++) {
        if (((i<ancho-1) && (i>0)) && ((j<ancho-1) && (j>0))) {
          System.out.print("  ");
        } else {
          System.out.printf("%d ", array[i][j]);
        }
      }
      System.out.println();
    } 
  }
}
