package Ejercicio2;

public class Bicicleta extends Vehiculo {
  private int pinones;
  Bicicleta(){
    this.pinones = 0;
  }

  Bicicleta(int pinones){
    super();
    this.pinones = pinones;
  }

  public int getPinones() {
    return this.pinones;
  }

  public void caballito() {
    System.out.println("Estoy haciendo el caballito");
  }

  @Override
  public void recorre(int kms) {
    super.recorre(kms);
    System.out.println("Pedaleando durante "+kms);
    //this.setKilometrosRevcorridos(this.getKilometrosRecorridos()+kms);
  }
}
