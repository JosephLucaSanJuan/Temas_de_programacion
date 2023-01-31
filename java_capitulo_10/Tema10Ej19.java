package java_capitulo_10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tema10Ej19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<String, String> diccionario = new HashMap<String, String>();
    boolean salir = false;

    diccionario.put("caliente", "hot");
    diccionario.put("rojo", "red");
    diccionario.put("ardiente", "hot");
    diccionario.put("verde", "green");
    diccionario.put("agujetas", "stiff");
    diccionario.put("abrasador", "hot");
    diccionario.put("hierro", "iron");
    diccionario.put("grande", "big");

    do {
      System.out.print("Introduzca una palabra y le dare los sinónimos: ");
      String palabra = sc.nextLine();
      if (palabra.equals("salir")) {
        salir = true;
      } else {
        if (diccionario.containsKey(palabra)) {
          ArrayList<String> sinonimos = obtenerSinonimos(palabra, diccionario);
          if (sinonimos.size()>1) {
            String cadena = String.format("Sinónimos de %s: ", palabra);
            for (int i = 0; i < sinonimos.size()-1; i++) {
              cadena+=String.format("%s ", sinonimos.get(i));
            }
            cadena+=sinonimos.get(sinonimos.size()-1);
            System.out.println(cadena);
          } else {
            System.out.println("No conozco sinónimos d esa palabra.");
          }
        } else {
          System.out.println("No conozco esa palabra");
        }
      }
    } while (!salir);
    sc.close();
  }

  private static ArrayList<String> obtenerSinonimos(String palabra, HashMap<String, String> diccionario) {
    String traduccion = diccionario.get(palabra);
    ArrayList<String> sinonimos = new ArrayList<String>();
    for (Map.Entry entrada : diccionario.entrySet()) {
      if (entrada.getValue().equals(traduccion)) {
        sinonimos.add((String)entrada.getKey());
      }
    }
    return null;
  }
}
