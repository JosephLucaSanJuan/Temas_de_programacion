/**
 * Tema 10
 * 21º Guarda información sobre tipos de anfibios para luego pedirla
 * 
 */
import java.util.HashMap;
import java.util.Scanner;

public class Tema10Ej21 {
  public static void main(String[] args) {
    HashMap<String, String> habitat = new HashMap<>();
    HashMap<String, String> alimento = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    
    habitat.put("rana", "En los trópicos y cerca de las zonas húmedas y acúaticas.");
    habitat.put("sapo", "En cualquier sitio salvo el desierto y la Antártida.");
    habitat.put("salamandra", "Ecosistemas húmedos.");
    habitat.put("triton", "América y África.");
    alimento.put("rana", "Larvas e insectos.");
    alimento.put("sapo", "Isectos, lombrices y pequeños roedores.");
    alimento.put("salamandra", "Pequeños crustáceos e insectos.");
    alimento.put("triton", "Insectos");

    System.out.print("Introduzca el tipo de anfibio: ");
    String anfibio = sc.nextLine();
    if (!habitat.containsKey(anfibio) || !alimento.containsKey(anfibio)) {
      System.out.println("Ese tipo de anfibio no existe.");
    } else {
      String lugar = habitat.get(anfibio);
      String comida = alimento.get(anfibio);
      System.out.format("Habitat: %s\n", lugar);
      System.out.format("Alimentación: %s\n", comida);
    }
    sc.close();
  }
}
