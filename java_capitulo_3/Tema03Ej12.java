package java_capitulo_3;

public class Tema03Ej12 {
  public static void main(String[] args) {
    System.out.print("Introduce la nota del primer examen: ");
    double nota1 = Double.parseDouble(System.console().readLine());

    System.out.print("¿Qué nota quieres sacar en el trimentre? ");
    double notaTrim = Double.parseDouble(System.console().readLine());

    double nota2 = notaTrim - (nota1*0.4);
    System.out.println("Para tener un " + notaTrim + " en el trimestre necesitas sacar un " + nota2/0.6 + " en el segundo examen.");
  }
}
