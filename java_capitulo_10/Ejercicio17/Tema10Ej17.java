/**
 * Tema 10
 * 17º Crea un arrayList que muestra el contenido de una compra.
 * 
 * @author Joseph Luca San Juan Thompson
 */
package java_capitulo_10.Ejercicio17;

public class Tema10Ej17 {
  public static void main(String[] args) {
    Carrito miCarrito = new Carrito();

    miCarrito.agrega(new Elemento("Tarjeta SD 64Gb", 19.95, 2));
    miCarrito.agrega(new Elemento("Canon EOS 2000D", 449, 1));

    System.out.println(miCarrito);
    System.out.print("Hay " + miCarrito.numeroDeElementos());
    System.out.println(" productos en la cesta.");
    System.out.println("El total asciende a " + String.format("%.2f", miCarrito.importeTotal()) + " euros");
    System.out.println("\nContinúa la compra...\n");

    miCarrito.agrega(new Elemento("Samsung Galaxy Tab", 199, 3));
    miCarrito.agrega(new Elemento("Tarjeta SD 64Gb", 19.95, 1));

    System.out.println(miCarrito);
    System.out.print("Ahora hay " + miCarrito.numeroDeElementos());
    System.out.println(" productos en la cesta.");
    System.out.println("El total asciende a " + String.format("%.2f", miCarrito.importeTotal()) + " euros");
  }
}
