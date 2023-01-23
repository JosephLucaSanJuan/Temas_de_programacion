package EjercicioPrueba_clases_genéricas;

public class TheThing<T> {
  private T valor;
  private int posicion;

  TheThing(){
    this.valor = null;
  }

  TheThing(T v, int pos){
    this.valor = v;
    this.posicion = pos;
  }

  public int get(int pos){
    return this.posicion;
  }

  public void set(T v, int pos){
    this.valor = v;
    this.posicion = pos;
  }
}
