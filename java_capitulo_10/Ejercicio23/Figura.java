package Ejercicio23;

public class Figura {
      private String figura;
      private int valor;
      private int cantidad;

      public Figura(String figura, int valor, int cantidad){
            this.figura = figura;
            this.valor = valor;
            this.cantidad = cantidad;
      }

      public int getValor() {
            return this.valor;
      }

      public boolean esCapturable() {
            return this.cantidad > 0;
      }

      public void captura() {
            this.cantidad--;
      }

      @Override
      public String toString() {
            return this.figura+" ("+this.valor+(this.valor == 1? " peón)":" peones)");
      }
}
