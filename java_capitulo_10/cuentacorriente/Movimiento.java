package java_capitulo_10.cuentacorriente;

import java.util.Date;

public class Movimiento {
  protected Date fecha;
  protected float importe;
  protected String cuenta;
  protected float saldo;

  protected Movimiento(float importe, String cuenta, float saldo){
    this.importe = importe;
    this.cuenta = cuenta;
    this.saldo = saldo;
    this.fecha = new Date();
  }

  public Date getFecha() {
    return this.fecha;
  }
  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  public double getImporte() {
    return this.importe;
  }

  public void setImporte(float importe) {
    this.importe = importe;
  }

  public String getCuenta() {
    return this.cuenta;
  }

  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  public float getSaldo() {
    return this.saldo;
  }

  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }
}
