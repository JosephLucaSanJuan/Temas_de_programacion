package Ejercicio2;

public class Vehiculo {
  private static int vehiculosCreados = 0;
  private static int kilometrosTotales = 0;
  private int kilometrosRecorridos = 0;

  Vehiculo() {
    vehiculosCreados = 0;
    kilometrosTotales = 0;
    this.kilometrosRecorridos = 0;
  }

  public static int getVehiculosCreados() {
    return vehiculosCreados;
  }

  public static int getKilometrosTotales() {
    return kilometrosTotales;
  }

  public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }

  //protected void setKilometrosRevcorridos(int kms){}

  @Override
  public String toString() {
    return "KilometrosRecorridos = " + getKilometrosRecorridos() + " (Vehiculos creados = " + getVehiculosCreados() + ", Kilometros totales: "+ getKilometrosTotales() + ")";
  }

  public void recorre(int kms) {
    //this.setKilometrosRevcorridos(kms);
    this.kilometrosRecorridos+=kms;
    kilometrosTotales+=kms;
  }
}
