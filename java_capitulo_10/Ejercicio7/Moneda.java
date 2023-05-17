package Ejercicio7;

public class Moneda {
    private static String valores[] = {"1 centimo", "2 centimos", "5 centimos", "10 centimos", "25 centimos", "50 centimos", "1 euro", "2 euros"};
    private static String posiciones[] = {"cara", "cruz"};
    private String valor;
    private String posicion;

    Moneda(){
        this.valor = valores[(int)(Math.random()*8)];
        this.posicion = posiciones[(int)(Math.random()*2)];
    }

    public String getValor(){
        return this.valor;
    }

    public String getPosicion(){
        return this.posicion;
    }

    @Override
    public String toString(){
        return this.valor+" - "+this.posicion;
    }
}
