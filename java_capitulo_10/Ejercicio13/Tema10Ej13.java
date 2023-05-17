package Ejercicio13;

import java.util.ArrayList;
import java.util.Scanner;

public class Tema10Ej13 {
    public static Scanner sc;
    public static void inicializar(){
        sc = new Scanner(System.in);
    }
    public static void cerrar() {
        sc.close();
    }
    public static void main(String[] args) {
        inicializar();
        ArrayList<Articulo> almacen = new ArrayList<>();
        int opcion = 0;
        do {
            imprimirMenu();
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    listadoArticulos(almacen);
                    break;
            
                case 2:
                    alta(almacen);
                    break;
            
                case 3:
                    baja(almacen);
                    break;
            
                case 4:
                    modificarArticulo(almacen);
                    break;
            
                case 5:
                    entradaMercancia(almacen);
                    break;
            
                case 6:
                    venta(almacen);
                    break;
            
                default:
                    break;
            }
        } while (opcion != 7);
        cerrar();
    }

    public static void imprimirMenu() {
        System.out.println("\nG E S T I S I M A L");
        System.out.println("===================");
        System.out.println("1. Listado");
        System.out.println("2. Alta");
        System.out.println("3. Baja");
        System.out.println("4. Modificación");
        System.out.println("5. Entrada de mercancía");
        System.out.println("6. Venta de mercancía");
        System.out.println("7. Salir");
    }

    public static Articulo buscarArticulo(ArrayList<Articulo> lista, String codigo) {
        boolean existe = false;
        Articulo articulo = new Articulo(); 
        for (Articulo object : lista) {
            if (object.getCodigo().equals(codigo)) {
                object.equals(articulo);
                existe = true;
                break;
            }
        }
        if (existe) {
            return articulo;
        } else {
            return null;
        }
    }

    public static void listadoArticulos(ArrayList<Articulo> lista) {
        System.out.println("\nLISTADO");
        System.out.println("=======");
        for (Articulo articulo : lista) {
            System.out.println(articulo);
        }
    }

    public static void alta(ArrayList<Articulo> lista) {
        System.out.println("\nALTA");
        System.out.println("====");
        System.out.println("Introduce los datos del artículo.");
        System.out.print("Código: ");
        String codigo = sc.nextLine();
        if (!buscarArticulo(lista, codigo).equals(null)) {
            System.out.println("Ese código ya existe en la lista");
        } else {
            System.out.print("Descripción: ");
            String descripcion = sc.nextLine();
            System.out.print("Precio de Compra: ");
            double precioC = Double.parseDouble(sc.nextLine());
            System.out.print("Precio de Venta: ");
            double precioV = Double.parseDouble(sc.nextLine());
            System.out.print("Precio de Compra: ");
            int stock = Integer.parseInt(sc.nextLine());

            lista.add(new Articulo(codigo, descripcion, precioC, precioV, stock));
        }
    }

    public static void baja(ArrayList<Articulo> lista) {
        System.out.println("\nBaja");
        System.out.print("Introduce el código del artículo a quitar: ");
        String codigo = sc.nextLine();
        if (buscarArticulo(lista, codigo).equals(null)) {
            System.out.println("Lo siento. Ese articulo no esta almacenado aquí.");
        } else {
            lista.remove(buscarArticulo(lista, codigo));
        }
    }

    public static void modificarArticulo(ArrayList<Articulo> lista) {
        System.out.println("\nMODIFICACIÓN");
        System.out.print("Introduce el código del artículo a modificar: ");
        String codigo = sc.nextLine();
        if (buscarArticulo(lista, codigo).equals(null)) {
            System.out.println("Lo siento. Ese código no es válido.");
        } else {
            System.out.println("Modifica los datos del artículo o pulsa INTRO/0 si quiere dejarlos igual.");

            System.out.println("Codigo: "+buscarArticulo(lista, codigo).getCodigo());
            System.out.print("Nuevo código: ");
            codigo = sc.nextLine();
            if (!codigo.equals("")) {
                buscarArticulo(lista, codigo).setCodigo(codigo);
            }
    
            System.out.println("Descripción: "+buscarArticulo(lista, codigo).getDescripcion());
            System.out.print("Nueva descripcion: ");
            String descripcion = sc.nextLine();
            if (!descripcion.equals("")) {
                buscarArticulo(lista, codigo).setDescipcion(descripcion);
            }
    
            System.out.println("Precio de compra: "+buscarArticulo(lista, codigo).getPrecioC());
            System.out.print("Nuevo precio de compra: ");
            double precioC = sc.nextDouble();
            if (precioC != 0) {
                buscarArticulo(lista, codigo).setPrecioC(precioC);
            }
    
            System.out.println("Precio de venta: "+buscarArticulo(lista, codigo).getPrecioV());
            System.out.print("Nuevo precio de venta: ");
            double precioV = sc.nextDouble();
            if (precioV != 0) {
                buscarArticulo(lista, codigo).setPrecioV(precioV);
            }
    
            System.out.println("Stock: "+buscarArticulo(lista, codigo).getStock());
            System.out.print("Nuevas unidades en stock: ");
            int stock = sc.nextInt();
            if (stock != 0) {
                buscarArticulo(lista, codigo).setStock(stock);
            }
        }
    }

    public static void entradaMercancia(ArrayList<Articulo> lista) {
        System.out.print("Introduce el código del articulo que quieres incrementar: ");
        String codigo = sc.nextLine();
        if (buscarArticulo(lista, codigo).equals(null)) {
            System.out.println("Lo siento, ese artículo no existe");
        } else {
            System.out.println(buscarArticulo(lista, codigo));
            System.out.print("¿Cuántas unidades quieres depositar? ");
            int u = Integer.parseInt(sc.nextLine());
            int stock = buscarArticulo(lista, codigo).getStock();
            buscarArticulo(lista, codigo).setStock(u+stock);
        }
    }

    public static void venta(ArrayList<Articulo> lista) {
        System.out.print("Introduce el código del articulo que quieres comprar: ");
        String codigo = sc.nextLine();
        if (buscarArticulo(lista, codigo).equals(null)) {
            System.out.println("Lo siento, ese artículo no existe");
        } else {
            System.out.println(buscarArticulo(lista, codigo));
            System.out.print("¿Cuánas unidades quiere comprar?");
            int u = Integer.parseInt(sc.nextLine());
            System.out.println("==============================");
            System.out.printf("Codigo %33s\n", buscarArticulo(lista, codigo).getCodigo());
            System.out.printf("Precio %33.2f\n", buscarArticulo(lista, codigo).getPrecioV());
            System.out.printf("Precio Total %17.2f\n", buscarArticulo(lista, codigo).getPrecioV() * (double)u);
            System.out.println("==============================");
        }
    }
}
