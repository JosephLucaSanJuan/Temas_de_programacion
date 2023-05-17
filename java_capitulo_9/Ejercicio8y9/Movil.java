package Ejercicio8y9;

public class Movil extends Terminal{
    protected String tarifa;
    protected double dinero;

    Movil(String numero, String tarifa){
        super(numero);
        this.tarifa = tarifa;
    }

    public void llama(Movil m, int tiempo){
        this.tiempo += tiempo;
        m.tiempo += tiempo;
        if (this.tarifa.equals("rata")) {
            this.dinero += (double)(0.06*tiempo)/60;
        } else if (this.tarifa.equals("mono")){
            this.dinero += (double)(0.12*tiempo)/60;
        } else if (this.tarifa.equals("bisonte")) {
            this.dinero += (double)(0.30*tiempo)/60;
        }
    }

    @Override
    public String toString(){
        return String.format("Nº %s - %ds de conservación - tarificados %.2f euros", this.numero, this.tiempo, this.dinero);
    }
}
