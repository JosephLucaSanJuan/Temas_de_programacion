package Ejercicio5;

public class Pizza {
  private String tamanyo;
  private String tipo;
  private String estado;

  private static int pizzasPedidas;
  private static int pizzasServidas;

  public Pizza(String tamanyo, String tipo) {
    this.tamanyo = tamanyo;
    this.tipo = tipo;
    this.estado = "pedida";
    pizzasPedidas++;
  }

  public String getTipo() {
    return this.tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getTamanyo() {
    return this.tamanyo;
  }

  public void setTamanyo(String tamanyo) {
    this.tamanyo = tamanyo;
  }

  public String getEstado() {
    return this.estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  @Override
  public String toString() {
    return "pizza " + this.tipo + " " + this.tamanyo + ", " + this.estado;
  }

  public void sirve(){
    if (this.estado=="pedida") {
      this.estado="servida";
      pizzasServidas++;
    } else {
      System.out.println("Esa pizza ya ha sido servida.");
    } 
  }

  public static int getTotalPedidas() {
    return pizzasPedidas;
  }

  public static int getTotalServidas() {
    return pizzasServidas;
  }
}
