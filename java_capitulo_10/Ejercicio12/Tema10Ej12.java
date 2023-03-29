package Ejercicio12;

import java.util.ArrayList;
import java.util.HashMap;

public class Tema10Ej12 {
  public static void main(String[] args) {
    ArrayList<Carta> tirada = new ArrayList<Carta>();
    HashMap<String, Integer> cartas = new HashMap<String, Integer>();
    int puntos = 0;
    
    cartas.put("AS", 11);
    cartas.put("2", 0);
    cartas.put("3", 10);
    cartas.put("4", 0);
    cartas.put("5", 0);
    cartas.put("6", 0);
    cartas.put("7", 0);
    cartas.put("soldado", 2);
    cartas.put("caballo", 3);
    cartas.put("rey", 4);

    Carta eleccion = new Carta();
    tirada.add(eleccion);

    for (int i = 0; i < 5; i++) {
      do {
        eleccion = new Carta();
      } while (tirada.contains(eleccion));
      tirada.add(eleccion);
    }

    for (Carta carta : tirada) {
      System.out.println(carta);
      puntos += cartas.get(carta.getFigura());
    }

    System.out.println("Tienes "+puntos+" puntos.");
  }
}
