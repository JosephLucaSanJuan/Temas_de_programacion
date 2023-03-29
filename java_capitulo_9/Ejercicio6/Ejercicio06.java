package Ejercicio6;

public class Ejercicio06 {
    public static void main(String[] args) {
        Tiempo t = new Tiempo(1, 20, 30);
        Tiempo t2 = new Tiempo(10, 35, 5);
        Tiempo t3 = new Tiempo(0, 30, 40);
        Tiempo t4 = new Tiempo(0, 35, 20);
        System.out.println(t);
        System.out.println(t2);
        System.out.println("("+t3+") + ("+t4+") = ("+t3.suma(t4)+")");
    }
}
