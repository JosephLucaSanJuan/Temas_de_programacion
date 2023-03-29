package Ejercicio17;

public class Rectangulo {
    private int altura;
    private int base;
    private static int rectangulos;

    public Rectangulo(int base, int altura) {
        this.altura = altura;
        this.base = base;
        rectangulos++;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return this.base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public String toString() {
        int nivel = 0;
        String cadena = "";
        do {
            for (int i = 0; i < base; i++) {
                cadena += "*";
            }
            nivel++;
            cadena += "\n";
        } while (nivel<altura);
        return cadena;
    }

    public static int getRectangulosCreados() {
        return rectangulos;
    }
}
