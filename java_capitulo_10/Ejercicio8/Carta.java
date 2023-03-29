package Ejercicio8;

import java.util.Objects;

public class Carta {
  private String[] palos = {"bastos", "copas", "oros", "espadas"};
  private String[] numeros = {"AS", "2", "3", "4", "5", "6", "7", "8", "9", "soldado", "caballo", "rey"};

  private String palo;
  private String numero;

  public Carta() {
    this.palo = palos[(int)(Math.random()*4)];
    this.numero = numeros[(int)(Math.random()*12)];
  }

  public String getPalo() {
    return this.palo;
  }

  public void setPalo(String palo) {
    this.palo = palo;
  }

  public String getNumero() {
    return this.numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  @Override
  public String toString(){
    return "El "+this.numero+" de "+this.palo;
  }

  @Override
  public boolean equals(Object o){
    if (o==null) {
      return false;
    }
    if (getClass()!=o.getClass()) {
      return false;
    }
    final Carta c = (Carta) o;
    if (!Objects.equals(this.numero, c.numero)) {
      return false;
    }
    if (!Objects.equals(this.palo, c.palo)) {
      return false;
    }
    return true;
  }
}
