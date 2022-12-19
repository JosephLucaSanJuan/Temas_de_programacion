package java_capitulo_8;

import java_capitulo_8.matematicas.Varias;

public class Tema08Ej16 {
  public static void main(String[] args) {
    for (int i = 0; i < 100000; i++) {
      if (Varias.esCapicua(i)) {
        System.out.print(i+" ");
      }
    }
  }
}
