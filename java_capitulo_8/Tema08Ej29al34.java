package java_capitulo_8;
import java_capitulo_8.arrays.ArrayBi;
import java_capitulo_8.matematicas.Varias;

public class Tema08Ej29al34 {
  public static void main(String[] args) {
    int[][] a = ArrayBi.generaArrayBiInt(5, 8, 1, 10000);
    ArrayBi.muestraMatriz(a);
    ArrayBi.muestraArray(ArrayBi.diagonal(a, 0, 0, "neso"));
    ArrayBi.diagonal(a, 0, 0, "nose");
  }
}
