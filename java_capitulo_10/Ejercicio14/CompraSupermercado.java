package java_capitulo_10.Ejercicio14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CompraSupermercado {
  public static void main(String[] args) {
    HashMap<String, Double> supermercado = new HashMap<String, Double>();
    supermercado.put("avena", 2.21);
    supermercado.put("garbanzos", 2.39);
    supermercado.put("tomate", 1.59);
    supermercado.put("jengibre", 3.13);
    supermercado.put("quinoa", 4.50);
    supermercado.put("guisantes", 1.60);

    Scanner sc = new Scanner(System.in);
    String producto = "";
    int cantidad = 0;
    double sumaPrecio = 0;
    double total = 0;

    ArrayList<String> listaDeCompra = new ArrayList<>();
    ArrayList<Integer> cantidades = new ArrayList<>();

    do {
      System.out.print("Producto: ");
      producto = sc.nextLine();
      if (!producto.equals("fin")) {
        System.out.print("Cantidad: ");
        cantidad = Integer.parseInt(sc.nextLine());
        listaDeCompra.add(producto);
        cantidades.add(cantidad);
      }
    } while (!producto.equals("fin"));

    System.out.println("\nProducto | Precio | Cantidad | Subtotal");
    System.out.println("---------------------------------------");
    for (int i = 0; i < listaDeCompra.size(); i++) {
      String alimento = listaDeCompra.get(i);
      double precio = supermercado.get(alimento);
      int numeroDeProductos = cantidades.get(i);
      sumaPrecio = precio * cantidad;
      total += sumaPrecio;
      System.out.format("%-8s | %7.2f | %6d | %7.2f\n", alimento, precio, numeroDeProductos, sumaPrecio);
    }
    System.out.println("---------------------------------------");
    System.out.format("TOTAL: %.2f", total);
    sc.close();
  }
}
