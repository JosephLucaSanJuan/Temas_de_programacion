package Array_de_objetos.ArraysEjercicio1;

import java.util.Scanner;

public class ArrayDeGatos {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        Gato[] gatos = new Gato[4];
        String nombre = "", color = "", raza = "";

        for (int i = 0; i < gatos.length; i++) {
            System.out.printf("Gato %d\n", i+1);
            System.out.print("Introduce el nombre: ");
            nombre = sc.nextLine();
            System.out.print("Introduce el color: ");
            color = sc.nextLine();
            System.out.print("Introduce la raza: ");
            raza = sc.nextLine();
            gatos[i] = new Gato(nombre, raza, color);
        }

        for (int i = 0; i < gatos.length; i++) {
            System.out.printf("\nGato nº%d", i+1);
            System.out.println(gatos[i]);
        }
        sc.close();
    }
}
