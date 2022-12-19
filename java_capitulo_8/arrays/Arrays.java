package java_capitulo_8.arrays;

public class Arrays {
  public static int[] generarArrayInt(int tamano, int min, int max) {
    int[] a = new int[tamano];
    for (int i = 0; i < a.length; i++) {
      a[i] = (int)(Math.random()*(max-min+1)+min);
    }
    return a;
  }

  public static int minimoArrayInt(int[] a) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < a.length; i++) {
      if (a[i]<=min) {
        min = a[i];
      }
    }
    return min;
  }

  public static int maximoArrayInt(int[] a) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < a.length; i++) {
      if (a[i]>max) {
        max = a[i];
      }
    }
    return max;
  }

  public static double mediaArrayInt(int[] a) {
    int suma = 0;
    for (int i = 0; i < a.length; i++) {
      suma+=a[i];
    }
    return (double)(suma/a.length);
  }

  public static boolean estaEnArray(int[] a, int v) {
    for (int i = 0; i < a.length; i++) {
      if (a[i]==v) {
        return true;
      }
    }
    return false;
  }

  public static int posicionEnArray(int[] a, int v) {
    for (int i = 0; i < a.length; i++) {
      if (a[i]==v) {
        return i;
      }
    }
    return -1;
  }

  public static int[] volteaArrayInt(int[] a) {
    int[] aux = new int[a.length];
    for (int i = 0; i < a.length; i++)
      aux[i] = a[a.length-i-1];
    return aux;
  }

  public static int[] rotaDerechaArrayInt(int[] a, int n) {
    int[] aux = a.clone();
    for (int i = 0; i < n; i++) {
      for (int j = a.length-1; j>0;) {
        aux[i] = a[i-1];
      }
      aux[0] = a[a.length-1];
    }
    return aux;
  }

  public static int[] rotaIzquierdaArrayInt(int[] a, int n) {
    int[] aux = a.clone();
    if (a.length>0) {
      for (int i = 0; i < n; i++) {
        for (int j = 0; j<a.length-1; j++) {
          aux[i] = a[i+1];
        }
        aux[a.length-1] = a[0];
      }
    }
    return aux;
  }
}
