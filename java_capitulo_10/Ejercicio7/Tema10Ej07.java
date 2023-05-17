package Ejercicio7;

import java.util.ArrayList;

public class Tema10Ej07 {
    public static void main(String[] args) {
        ArrayList<Moneda> monedas = new ArrayList<>();
        Moneda m = new Moneda();
        String v = m.getValor(), p = m.getPosicion();

        for (int i = 0; i < 6; i++) {
            do {
                m = new Moneda();
            } while (!m.getPosicion().equals(p) && !m.getValor().equals(v));
            monedas.add(m);
            v = m.getValor();
            p = m.getPosicion();
        }

        for (Moneda moneda : monedas) {
            System.out.println(moneda);
        }
    }
}
