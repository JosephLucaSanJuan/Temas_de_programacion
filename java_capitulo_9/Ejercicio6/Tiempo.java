package Ejercicio6;

public class Tiempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tiempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return this.hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return this.segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    @Override
    public String toString(){
        if (this.hora==0) {
            return this.minuto+"m "+this.segundo+"s";
        } else if (this.minuto==0) {
            return this.hora+"h "+this.segundo+"s";
        } else if (this.segundo==0) {
            return this.hora+"h "+this.minuto+"m";
        } else {
            return this.hora+"h "+this.minuto+"m "+this.segundo+"s";
        }
    }

    public Tiempo suma(Tiempo t) {
        int horaFinal = this.hora+t.getHora();
        int minutoFinal = this.minuto+t.getMinuto();
        int segundoFinal = this.segundo+t.getSegundo();
        int minExtra=0;
        int horaExtra=0;
        if (minutoFinal>=60) {
            do {
                minutoFinal-=60;
                minExtra++;
            } while (minutoFinal>=60);
        }
        if (segundoFinal>=60) {
            do {
                segundoFinal-=60;
                horaExtra++;
            } while (segundoFinal>=60);
        }
        return new Tiempo(horaFinal+horaExtra, minutoFinal+minExtra, segundoFinal);
    }

    public Tiempo suma(int h, int m, int s) {
        int horaFinal = this.hora+h;
        int minutoFinal = this.minuto+m;
        int segundoFinal = this.segundo+s;
        Tiempo Tiempo = new Tiempo(horaFinal, minutoFinal, segundoFinal);
        return Tiempo;
    }
}
