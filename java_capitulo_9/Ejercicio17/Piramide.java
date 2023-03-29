package Ejercicio17;

public class Piramide {
    private int altura;
    private static int piramides;

    public Piramide(int altura) {
        this.altura = altura;
        piramides++;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        String cadena="";
        int planta=0;
        int contAriscos=0;
        int espacios = altura;
        do {
            for (int i = 0; i < espacios; i++) {
                cadena += " ";
            }
            for (int i = 0; i < 2*contAriscos-1; i++) {
                cadena += "*";
            }
            cadena += "\n";
            planta++;
            espacios--;
            contAriscos++;
        } while (planta<=altura);
        return cadena;
    }

    public static int getPiramidesCreadas() {
        return piramides;
    }
}
