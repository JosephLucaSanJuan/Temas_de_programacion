package java_capitulo_8;

import java_capitulo_8.matematicas.Varias;

public class Tema08Ej15 {
  public static void main(String[] args) {
    for (int i = 0; i < 1001; i++) {
      if (Varias.esPrimo(i)) {
        System.out.print(i+" ");
      }
    }
  }
}
