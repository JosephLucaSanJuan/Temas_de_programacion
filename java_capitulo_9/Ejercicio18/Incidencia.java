package Ejercicio18;

public class Incidencia {
    private int codigo;
    private int numPuesto;
    private String incidencia;
    private String estado;
    private static int cuentaCodigos=1;
    private static int incidenciasPendientes;

    public Incidencia(int numPuesto, String incidencia) {
        this.codigo = cuentaCodigos++;
        this.numPuesto = numPuesto;
        this.incidencia = incidencia;
        this.estado = "Pendiente";
        incidenciasPendientes++;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumPuesto() {
        return this.numPuesto;
    }

    public void setNumPuesto(int numPuesto) {
        this.numPuesto = numPuesto;
    }

    public String getIncidencia() {
        return this.incidencia;
    }

    public void setIncidencia(String incidencia) {
        this.incidencia = incidencia;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
      return "Incidencia "+this.codigo+" - Puesto: "+this.numPuesto+" - "+incidencia+" - "+this.estado;
    }

    public void resuelve(String info) {
        this.estado = "Resuelta - "+info;
        incidenciasPendientes--;
    }

    public static int getPendientes() {
        return incidenciasPendientes;
    }
}
