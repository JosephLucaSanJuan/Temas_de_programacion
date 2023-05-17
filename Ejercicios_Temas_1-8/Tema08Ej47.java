/**
 * Tema08
 * 
 * 47º Crea una función que cree un número formado por todos los números de un array
 * 
 * @author Joseph Luca San Juan Thompson
 */

import java.util.Scanner;

public class Tema08Ej47 {
    public static void main(String[] args) {
        inicializar();
        int[] array1 = creArray();
        for (int i = 0; i < array1.length; i++) {
            System.out.printf("%d, ", array1[i]);
        }
        System.out.println();
        System.out.println(convierteArrayEnString(array1));
        cerrar();
    }

    public static String convierteArrayEnString(int[] a){
        String numero = "";
        for (int i = 0; i < a.length; i++) {
            numero += a[i];
        }
        return numero;
    }

    public static int[] creArray() {
        System.out.print("¿Cuántos números quieres en tu array?: ");
        int cantidad = Integer.parseInt(sc.nextLine());
        int a[] = new int[cantidad];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*10);
        }
        return a;
    }
    
    public static Scanner sc;
    public static void inicializar() {
        sc = new Scanner(System.in);
    }
    public static void cerrar() {
        sc.close();
    }
}
