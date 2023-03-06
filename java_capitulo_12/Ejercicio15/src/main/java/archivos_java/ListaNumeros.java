package archivos_java;

import java.util.ArrayList;

public class ListaNumeros {

    public ListaNumeros() {

    }

    public static ArrayList<Numero> entre(int min, int max) {
        ArrayList<Numero> numeros = new ArrayList<>();
        for (int i = min; i < max; i++) {
            if (esPrimo(i)) {
                numeros.add(new Primo(i));
            } else {
                numeros.add(new Numero(i));
            }
        }
        return numeros;
    }

    public static boolean esPrimo(int n){
        for (int i = 2; i < n/2; i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
}
