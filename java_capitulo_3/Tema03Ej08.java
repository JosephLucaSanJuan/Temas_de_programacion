package java_capitulo_3;

public class Tema03Ej08 {
  public static void main(String[] args) {
    System.out.print("Introduce cuantas horas se han trabajado durante la semana: ");
    int horTrab  = Integer.parseInt(System.console().readLine());

    System.out.println("El salario semanal es " + horTrab * 12);
  }
}
