package Ejercicio8;

import java.util.ArrayList;

public class Tema10Ej08 {
  public static void main(String[] args) {
    ArrayList<Carta> cartasAlAzar = new ArrayList<Carta>();
    Carta carta = new Carta();

    for (int i = 0; i < 10; i++) {
      do {
        carta = new Carta();
      } while (cartasAlAzar.contains(carta));
      cartasAlAzar.add(carta);
    }

    for (Carta c : cartasAlAzar) {
      System.out.println(c);
    }
  }
}
