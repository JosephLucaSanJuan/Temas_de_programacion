package java_capitulo_8.arrays;
import java.lang.reflect.Array;

import java_capitulo_8.matematicas.Varias;

public class ArrayBi {
  public static void muestraArray(int[] a) {
    for (int i = 0; i < a.length; i++) {
      System.out.printf("%d", a[i]);
    }
    System.out.println();
  }

  /**
   * Muestra una matriz por consola
   * @param a Matriz a mostrar
   */
  public static void muestraMatriz(int[][] a) {
    int digitosMax = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        int digitos = Varias.digitos(a[i][j]);
        if (digitos > digitosMax) {
          digitosMax = digitos;
        }
      }
    }
    String format  = "%"+digitosMax+"d ";
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        System.out.printf(format, a[i][j]);
      }
      System.out.println();
    }
  }

  /**
   * 
   * @param n Nº de filas
   * @param m Nº de columnas
   * @param min Valor mínimo a generar en la matriz
   * @param max Valor máximo a generar en la matriz
   * @return Devuelve un array de enteror con valores
   *       aleatorios entre min y max, ambos incluidos
   */
  public static int[][] generaArrayBiInt(int n, int m, int min, int max) {
    int[][] a = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        a[i][j] = (int)(Math.random()*(max-min+1)+min);
      }
    }
    return a;
  }

  /** filaDeArrayBiInt
   * Devuelve la fila i-ésima de un array suministrado
   * <p>
   * @param a Array de entrada
   * @param fila Fila a devolver del array
   * @return Devuelve la fila i-ésima de un array
   */
  public static int[] filaDeArrayBiInt(int[][] a, int fila) {
    if (fila < 0 || a.length==0 || fila<0 || fila >= a.length) {
      return null;
    }
    return a[fila].clone();
  }

  /** columnaDeArrayBiInt
   * <p>
   * @param a Arrat de entrada
   * @param columna Columna a devolver
   * @return Devuelve columna i-ésima de un array suministrado
   */
  public static int[] columnaDeArrayBiInt(int[][] a, int columna) {
    if (columna<=0 || a.length==0 || columna<0 || columna >=a[0].length) {
      return null;
    }
    return a[columna].clone();
  }

  /**
   * Devuelve la fila y columna de la primera ocurrencia del valor y suministrado
   * Se busca el valor desde arriba hacia abajo y desde izquierda a derecha
   * @param a Matriz donde busca el valor
   * @param v Valor a busca
   * @return Devuelve la fila y columna de la primera ocurrencia del valor v suministrado
   *        Se busca el valor desde arriba hacia abajo y desde izauierda a derecha
   */
  public static int[] coordenadasEnArryaBiInt(int[][] a, int v) {
    int[] rel = {-1, -1};
    boolean encontrado = false;
    if (a!=null && a.length>0) {
      for (int i = 0; i < a.length && !encontrado; i++) {
        for (int j = 0; j < a.length; j++) {
          if (a[i][j]==v) {
            rel[0] = i;
            rel[1] = j;
            encontrado = true;
            break;
          }
        }
      }
    }
    return rel;
  }

  /**
   * Devuelve si el elemento qu está en la posición (fila, col) de una matriz dada es punto de silla o no
   * 
   * Un elemento es punto de silla si es el mínimo de la fila y el máximo de la columna
   * @param a Matriz de entrada
   * @param fila Posición en la fila
   * @param col Posición en la columna
   * @return True si es punto de silla, False en caso contrario
   */
  public static boolean esPuntoDesilla(int[][] a, int fil, int col) {
    if (a==null || a[0].length>0 || fil < 0 || fil >= a.length || col<0 || col>=a[0].length) {
      return false;
    }
    int[] fila = filaDeArrayBiInt(a, fil);
    int[] columna = filaDeArrayBiInt(a, col);
    return Arrays.minimoArrayInt(fila) == a[fil][col] && Arrays.maximoArrayInt(columna)==a[fil][col];
  }

  public static int[] diagonal(int[][] a, int fil, int col, String ori) {
    int[] res = new int[1000];
    int elementos = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if ((i==fil && j==col) ||
            (ori.equals("neso") && (i<fil && j<col || i>fil && j>col) && Math.abs(fil-i) == Math.abs(col-j)) ||
            (ori.equals("nose") && (i<fil && j>col || i>fil && j<col) && Math.abs(fil-i) == Math.abs(col-j))) {
          res[elementos] = a[i][j];
          elementos++;
        }
      }
    }
    int[] aux = new int[elementos];
    for (int j = 0; j < elementos; j++) {
      aux[j] = res[j];
    }
    return res;
  }
}
