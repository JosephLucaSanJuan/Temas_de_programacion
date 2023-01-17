package Geometria;

public abstract class Figura implements Geometria {
  private int lados;

  protected Figura (int lados) {
    this.lados = lados;
  }

  public int getLados() {
    return this.lados;
  }
}
