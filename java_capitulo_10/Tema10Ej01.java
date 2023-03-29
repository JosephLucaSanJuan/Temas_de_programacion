/**
 * Tema 10
 * 1º Crea un ArrayList, añade 6 nombrrs y muéstralos.
 * 
 * @author Joseph Luca San Juan Thompson
 */
import java.util.ArrayList;

public class Tema10Ej01 {
  public static void main(String[] args) {
    ArrayList<String> array = new ArrayList<String>();

    array.add("Juan");
    array.add("Nuria");
    array.add("Alonso");
    array.add("Javier");
    array.add("Denisa");
    array.add("Carlos");

    for (int i = 0; i < 6; i++) {
      System.out.println("Nombre: "+array.get(i));
    }
  }
}