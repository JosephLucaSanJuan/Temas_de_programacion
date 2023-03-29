package Ejercicio1;

public class Tema09Ej01 {
  public static void main(String[] args) {
    Caballo relampago = new Caballo("Relámpago", 2.0, "macho", 13);
    Caballo furia = new Caballo("Furia", 3.6, "hembra", 20);

    System.out.println("HOla me llamo "+relampago.getNombre());
    System.out.println("Tengo "+relampago.getEdad());
    relampago.come();

    System.out.println("HOla me llamo "+furia.getNombre());
    System.out.println("Tengo "+furia.getEdad());
    furia.come();
  }
}
