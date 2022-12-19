package java_capitulo_8.matematicas;

public class Varias {

  /**
   * 1º Devuelve si un número es capícua o no.
   * @param x
   * @return
   */
  public static boolean esCapicua(long x) {
    return x == voltea(x);
  }

  public static boolean esCapicua(int x) {
    return esCapicua((long)x);
  }

  public static long voltea(long x) {
    long volteado = 0;
    while (x>0) {
      volteado = (volteado*10) + (x%10);
      x/=10;
    }
    return volteado;
  }

  public static long voltea(int x) {
    return voltea((long)x);
  }


  /**
   *  2º Devuelve si un número es primo o no.
   *  @param x
   *  @return 
   */
  public static boolean esPrimo(long x) {
    if (x < 0) {
      x = -x;
    }
    if (x<2) {
      return false;
    }

    int divisor = 2;
    while (divisor++<=x/2) {
      if (x%divisor==0) {
        return false;
      }
    }
    return true;
  }

  public static boolean esPrimo(int x) {
    return esPrimo((long)x);
  }


  /**
   * 3º Devuelve el siguiente número primo
   */
  public static long siguientePrimo(long x) {
    while (!esPrimo(++x)) {}
    return x;
  }

  public static long siguientePrimo(int x) {
    return siguientePrimo((long)x);
  }


  /**
   * 4º Devuelve la potencia de un exponente
   */
  public static double potencia(long base, int exponente) {
    if (exponente==0) {
      return 1;
    }
    if (exponente<0) {
      return (double)1/potencia(base, -exponente);
    }
    double x = 1;
    while (exponente-->0) {
      x*=base;
    }
    return x;
  }


  /**
   * 5º Cuenta los dígitos de un número.
   */
  public static int digitos(long x) {
    if (x==0) {
      return 1;
    } else if (x < 0) {
      x = -x;
    }

    int numDig = 0;
    while (x>0) {
      x/=10;
      numDig++;
    }
    return numDig;
  }

  public static int digitos(int x) {
    return digitos((long)x);
  }


  /**
   * 7º Devuelve el dígito en la posición n
   */
  public static int digitoN(long x, int pos) {
    if (pos<0 || pos > digitos(x)-1) {
      return -1;
    }
    return (int)(voltea(x)/(long)potencia(10, pos))%10;
  }


  /**
   * 8º Posición del dígito.
   */
  public static int posicionDeDigito(long x, int d) {
    x = voltea(x);
    int pos = 0;
    while (x>0) {
      if (x%10==d) {
        return pos;
      }
      pos++;
      x/=10;
    }
    return -1;
  }
  public static int posicionDeDigito(int x, int d) {
    return posicionDeDigito((long)x, d);
  }

  /**
   * 9º
   */
  public static long quitaPorDetras(long x, int n) {
    return x/(long)potencia(10, n);
  }

  public static long quitaPorDetras(int x, int n) {
    return (int)quitaPorDetras((long)x, n);
  }

  public static long quitaPorDelante(long x, int n) {
    x = pegaPorDetras(x, 1);
    x = voltea(quitaPorDetras(voltea(x), n));
    x = quitaPorDetras(x, 1);
    return x;
  }

  public static long pegaPorDetras(long x, int d) {
    return juntaNumeros(x, d);
  }

  public static long pegaPorDelante(long x, int d) {
    return juntaNumeros(d, x);
  }


  /**
   * 10º
   */
  public static long juntaNumeros(long x, long y) {
    return x*(long)potencia(10, digitos(y))+y;
  }

  public static long juntaNumeros(int x, int y) {
    return juntaNumeros((long)x, (long)y);
  }

  public static long trozoDeNumero(long x, int ini, int fin) {
    int longitud = digitos(x);
    if (ini<0 || ini>fin || fin>=longitud) {
      return -1;
    }
    return quitaPorDetras(quitaPorDelante(x, ini), longitud-fin-1);
  }

  public static long trozoDeNumero(int x, int ini, int fin) {
    return (int)trozoDeNumero((long)x, ini, fin);
  }
}
