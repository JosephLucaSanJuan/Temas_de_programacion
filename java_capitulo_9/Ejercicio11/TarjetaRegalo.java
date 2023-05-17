package Ejercicio11;

public class TarjetaRegalo {
    private double saldo;

    TarjetaRegalo(double saldo){
        this.saldo = saldo;
    }

    public void gasta(double dinero){
        if (dinero <= this.saldo) {
            this.saldo -= dinero;
        } else {
            System.out.printf("No tiene suficiente saldo para gastar %.2f$\n", dinero);
        }
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo t){
        TarjetaRegalo tr = new TarjetaRegalo(this.saldo+t.saldo);
        this.saldo = 0;
        t.saldo = 0;
        return tr;
    }

    @Override
    public String toString(){
        return String.format("Tarjeta nº - Saldo %.2f$", this.saldo);
    }
}
