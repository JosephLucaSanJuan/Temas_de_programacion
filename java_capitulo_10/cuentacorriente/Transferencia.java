package java_capitulo_10.cuentacorriente;

public class Transferencia extends Movimiento {

  protected Transferencia(float importe, String cuenta, float saldo){
    super(importe, cuenta, saldo);
  }
}
