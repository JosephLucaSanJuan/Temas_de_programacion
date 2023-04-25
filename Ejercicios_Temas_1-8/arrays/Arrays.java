package arrays;

public class Arrays {
  /**
   * Muestra los elementos de una array
   * 
   * @param a  array unidimensional de numeros
   */
  public static void mostrarArray(int a[]){
    for (int i : a) {
      System.out.print(i+" ");
    }
    System.out.println();
  }

  /**
   * 20º Crea un array con valores aleatorios comprendidos entre dos números
   *  
   * @param t  tamaño del array
   * @param min  parámetro mínimo del array
   * @param max  parámetro máximo del array
   */
  public static int[] generaArrayInt(int t, int min, int max){
    int a[] = new int[t];
    for (int i = 0; i < a.length; i++) {
      a[i] = (int)(Math.random()*(max-min+1)+min);
    }
    return a;
  }

  /**
   * 21º Devuelve el valor mínimo del array
   *  
   * @param a  array del cuál se extrae el valor
   */
  public static int minimoArrayInt(int a[]){
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < a.length; i++) {
      if (a[i] < min) {
        min = a[i];
      };
    }
    return min;
  }

  /**
   * 22º Devuelve el valor máximo del array
   *  
   * @param a  array del cuál se extrae el valor
   */
  public static int maximoArrayInt(int a[]){
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < a.length; i++) {
      if (a[i] > max) {
        max = a[i];
      };
    }
    return max;
  }

  /**
   * 23º Devuelve la media del array
   *  
   * @param a  array del cuál se extrae el valor
   */
  public static int mediaArrayInt(int a[]){
    int suma = 0;
    int cantidad = 0;
    for (int i = 0; i < a.length; i++) {
      suma += a[i];
      cantidad++;
    }
    int media = suma/cantidad;
    return media;
  }

  /**
   * 24º Averigua si un array contiene un número
   *  
   * @param a  array que hay que leer
   * @param n  número que hay que averiguar si está en el array
   */
  public static boolean estaEnArrayInt(int a[], int n){
    boolean estaEnArray = false;
    for (int i = 0; i < a.length; i++) {
      if (a[i] == n) {
        estaEnArray = true;
      } else {
        estaEnArray = false;
      };
    }
    if (estaEnArray) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * 25º Devuelve la posicón de un número en un array
   *  
   * @param a  array
   * @param n  número cuya posicón devolvemos
   */
  public static int posicionEnArrayInt(int a[], int n){
    for (int i = 0; i < a.length; i++) {
      if (a[i] == n) {
        return i;
      }
    }
    return -1;
  }

  /**
   * 26º Voltea un array
   *  
   * @param a  array que se voltea
   */
  public static int[] volteaArrayInt(int a[]){
    int newArray[] = new int[a.length];
    int cantidad = a.length-1;
    for (int i = 0; i < a.length; i++) {
      newArray[cantidad] += a[i];
      cantidad--;
    }
    return newArray;
  }

  /**
   * 27º Rota los números de un array n posiciones hacia la derecha
   *  
   * @param a  array que se voltea
   * @param n  número de veces que se mueven los números del array
   */
  public static int[] rotaDerechaArrayInt(int a[], int n){
    int newArray[] = new int[a.length];
    int veces = 0;
    do {
      for (int i = 0; i < a.length; i++) {
        if (i==0) {
          newArray[0] = a[a.length-1];
        } else {
          newArray[i] = a[i+1];
        }
      }
      veces++;
    } while (veces < n);
    return newArray;
  }

  /**
   * 28º Rota los números de un array n posiciones hacia la izquierda
   *  
   * @param a  array que se voltea
   * @param n  número de veces que se mueven los números del array
   */
  public static int[] rotaIzquierdaArrayInt(int a[], int n){
    int newArray[] = new int[a.length];
    int veces = 0;
    do {
      for (int i = 0; i < a.length; i++) {
        if (i==0) {
          newArray[a.length-1] = a[i];
        } else {
          newArray[i] = a[i-1];
        }
      }
      veces++;
    } while (veces < n);
    return newArray;
  }
}
