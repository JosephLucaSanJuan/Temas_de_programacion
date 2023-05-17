package Ejercicio8y9;

public class Terminal {
    protected String numero;
    protected int tiempo;

    Terminal(String n){
        this.numero = n;
    }

    Terminal(String n, int t){
        this.numero = n;
        this.tiempo = t;
    }

    public String getNumero(){
        return this.numero;
    }

    public int getTiempo(){
        return this.tiempo;
    }

    @Override
    public String toString(){
        return "Nº "+this.numero+" - "+this.tiempo+"s de conversación";
    }

    public void llama(Terminal t, int tiempo){
        this.tiempo += tiempo;
        t.tiempo += tiempo;
    }
}
