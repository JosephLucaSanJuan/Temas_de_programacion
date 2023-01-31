package java_capitulo_10.Ejercicio12;

import java.util.Objects;

public class Carta implements Comparable<Carta>{
  private static String [] numeros = {"AS", "2", "3", "4", "5", "6","7", "soldado", "caballos", "rey"};/**/
  private static String [] simbolos = {"oros", "bastones", "espadas", "copas"};

  private Integer numero;
  private String simbolo; 

  public Carta () {
    this.numero = (int)(Math.random()*10);
    this.simbolo = simbolos[(int)(Math.random()*4)];
  }

  public Integer getNumero() {
    return this.numero;
  }

  public String getFigura() {
    return numeros[this.numero];
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public String getSimbolo() {
    return this.simbolo;
  }

  public void setSimbolo(String simbolo) {
    this.simbolo = simbolo;
  }

  @Override
  public String toString() {
    return "El " + numeros[this.numero] + " de " + this.simbolo + ".";
  }

  @Override
  public boolean equals(Object o) {
    if (o == null) {
      return false;
    }
    if (getClass() != o.getClass()) {
      return false;
    }
    final Carta otra = (Carta) o;
    if (!Objects.equals(this.numero, otra.numero)) {
      return false;
    }
    if (!Objects.equals(this.simbolo, otra.simbolo)) {
      return false;
    }
    return true;
  }

  @Override
  public int compareTo(Carta carta) {
    if (simbolo.equals(carta.getSimbolo())) {
      return numero.compareTo(carta.getNumero());
    } else {
      return simbolo.compareTo(carta.getSimbolo());
    }
  }
  /**/
}