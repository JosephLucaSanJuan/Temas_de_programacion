package Ejercicio23;

import java.util.ArrayList;

public class Tema10Ej23 {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<Figura>();
        int puntos = 0;
        boolean salir = false;

        figuras.add(new Figura("Dama", 9, 1));
        figuras.add(new Figura("Torre", 5, 2));
        figuras.add(new Figura("Alfil", 3, 2));
        figuras.add(new Figura("Caballo", 2, 2));
        figuras.add(new Figura("Peón", 1, 8));

        System.out.println("Fichas capturadas por el jugador:");

        do {
            int index = (int)(Math.random()*5);
            if (figuras.get(index).esCapturable()) {
                System.out.println(figuras.get(index));
                figuras.get(index).captura();
                puntos += figuras.get(index).getValor();
            } else {
                salir = true;
            }
        } while (!salir);

        System.out.println("Puntos totáles: "+puntos+" peones.");
    }
}
