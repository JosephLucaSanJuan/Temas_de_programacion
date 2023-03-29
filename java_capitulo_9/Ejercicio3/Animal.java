package Ejercicio3;

public class Animal {
  private String especie;
  private String dieta;
  private String habitat;

  public Animal(String especie, String dieta, String habitat) {
    this.especie = especie;
    this.dieta = dieta;
    this.habitat = habitat;
  }

  public Animal() {
    this.especie = especie;
    this.dieta = dieta;
    this.habitat = habitat;
  }

  public String getEspecie() {
    return this.especie;
  }

  public void setEspecie(String especie) {
    this.especie = especie;
  }

  public String getDieta() {
    return this.dieta;
  }

  public void setDieta(String dieta) {
    this.dieta = dieta;
  }

  public String getHabitat() {
    return this.habitat;
  }

  public void setHabitat(String habitat) {
    this.habitat = habitat;
  }
}
