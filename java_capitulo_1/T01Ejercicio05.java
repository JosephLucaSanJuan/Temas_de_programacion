package java_capitulo_1;

public class T01Ejercicio05 {
  public static void main(String[] args) {
    String rojo = "\033[0;31m";
    String azul = "\033[0;34m";
    String verde = "\033[0;32m";
    String amarillo = "\033[0;33m";
    String naranja = "\033[0;36m";
    String morado = "\033[0;35m";

    System.out.printf("| %-11s| %-11s| %-11s| %-11s| %-11s|\n", "Lunes","Martes","Miercoles","Jueves","Viernes");
    System.out.println("------------------------------------------------------------------");
    System.out.printf("|"+morado+" %-11s|"+azul+" %-11s|"+amarillo+" %-11s|"+morado+" %-11s|"+verde+" %-11s|\n", "PROG","SInf","ED","PROG","FOL");
    System.out.printf("|"+morado+" %-11s|"+azul+" %-11s|"+amarillo+" %-11s|"+morado+" %-11s|"+verde+" %-11s|\n", "PROG","SInf","ED","PROG","FOL");
    System.out.printf("|"+rojo+" %-11s|"+azul+" %-11s|"+morado+" %-11s|"+rojo+" %-11s|"+verde+" %-11s|\n", "LM","SInf","PROG","LM","FOL");
    System.out.printf("\n");
    System.out.printf("|"+rojo+" %-11s|"+morado+" %-11s|"+morado+" %-11s|"+rojo+" %-11s|"+azul+" %-11s|\n", "LM","PROG","PROG","LM","SINF");
    System.out.printf("|"+naranja+" %-11s|"+morado+" %-11s|"+naranja+" %-11s|"+naranja+" %-11s|"+azul+" %-11s|\n", "BD","PROG","BD","BD","SInf");
    System.out.printf("|"+naranja+" %-11s|"+amarillo+" %-11s|"+naranja+" %-11s|"+naranja+" %-11s|"+azul+" %-11s|\n", "BD","ED","BD","BD","SInf");
  }
}
