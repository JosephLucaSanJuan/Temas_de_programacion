package Array_de_objetos.Ejercicio5;

import java.util.Scanner;

public class GESTISIMAL {
    public static Scanner sc;
    public static void inicializar() {
        sc = new Scanner(System.in);
    }
    public static void cerrar() {
        sc.close();
    }

    public static void main(String[] args) {
        inicializar();
        Articulo[] almacen = new Articulo[200];
        int opcion = 0;
        for (int i = 0; i < almacen.length; i++) {
            almacen[i] = new Articulo();
        }

        do {
            imprimeMenu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                  listadoArticulos(almacen);
                  break;
              
                case 2:
                  alta(almacen);
                  break;
                
                case 3:
                  alta(almacen);
                  break;
                
                case 4:
                  modificacion(almacen);
                  break;
                
                case 5:
                  entradaMercancia(almacen);
                  break;
                
                case 6:
                  
                  break;

                default:
                  break;
            }
        } while (opcion != 7);
        cerrar();
    }

    public static void imprimeMenu(){
        System.out.println("\nG E S T I S I M A L");
        System.out.println("===================");
        System.out.println("1. Listado");
        System.out.println("2. Alta");
        System.out.println("3. Baja");
        System.out.println("4. Modificación");
        System.out.println("5. Entrada de mercancía");
        System.out.println("6. Salida de mercancía");
        System.out.println("7. Salir");
    }

    public static void listadoArticulos(Articulo[] array) {
        System.out.println("\nLISTADO");
        System.out.println("=======");
        for (int i = 0; i < array.length; i++) {
            if (!array[i].getCodigo().equals("EMPTY")) {
                System.out.println(array[i]);
            }
        }
    }

    public static Articulo alta(Articulo[] array) {
        System.out.println("\nALTA");
        System.out.println("====");
        int hueco = -1;
        do {
            hueco++;
        } while (!((array[hueco].getCodigo()).equals("EMPTY")));
        System.out.println("Introduce los datos del articulo.");

        System.out.print("Código: ");
        String codigo = sc.nextLine();
        array[hueco].setCodigo(codigo);

        System.out.print("Descripcion: ");
        String descripcion = sc.nextLine();
        array[hueco].setDescipcion(descripcion);

        System.out.print("Precio de Compra: ");
        double precioC = sc.nextDouble();
        array[hueco].setPrecioC(precioC);

        System.out.print("Precio de venta: ");
        double precioV = sc.nextDouble();
        array[hueco].setPrecioV(precioV);

        System.out.print("Unidades en stock: ");
        int stock = sc.nextInt();
        array[hueco].setStock(stock);
        return array[hueco];
    }

    public static Articulo baja(Articulo[] array) {
        System.out.println("BAJA");
        System.out.print("Introduce el código del articulo a quitar: ");
        String codigo = sc.nextLine();
        Articulo a = buscarArticulo(array, codigo);
        a.setCodigo("Empty");
        return a;
    }
    
    public static Articulo modificacion(Articulo[] array) {
        System.out.print("Introduce el código del articulo a modificar: ");
        String codigo = sc.nextLine();
        Articulo a = buscarArticulo(array, codigo);
        System.out.println("Modifica los datos del articulo o pulsa INTRO o 0 si quieres dejarlos igual.");

        System.out.println("Codigo: "+a.getCodigo());
        System.out.print("Nuevo código: ");
        codigo = sc.nextLine();
        if (!codigo.equals("")) {
            a.setCodigo(codigo);
        }

        System.out.println("Descripción: "+a.getDescripcion());
        System.out.print("Nueva descripcion: ");
        String descripcion = sc.nextLine();
        if (!descripcion.equals("")) {
            a.setDescipcion(descripcion);
        }

        System.out.println("Precio de compra: "+a.getPrecioC());
        System.out.print("Nuevo precio de compra: ");
        double precioC = sc.nextDouble();
        if (precioC != 0) {
            a.setPrecioC(precioC);
        }

        System.out.println("Precio de venta: "+a.getPrecioV());
        System.out.print("Nuevo precio de venta: ");
        double precioV = sc.nextDouble();
        if (precioV != 0) {
            a.setPrecioV(precioV);
        }

        System.out.println("Stock: "+a.getStock());
        System.out.print("Nuevas unidades en stock: ");
        int stock = sc.nextInt();
        if (stock != 0) {
            a.setStock(stock);
        }
        return a;
    }

    public static Articulo buscarArticulo(Articulo[] array, String codigo){
        int hueco = -1;
        do {
            hueco++;
        } while (!array[hueco].getCodigo().equals(codigo));
        return array[hueco];
    }

    public static Articulo entradaMercancia(Articulo[] array) {
        System.out.print("Introduce el código del articulo cuya cantidad quieres incrementar: ");
        String codigo = sc.nextLine();
        Articulo a = buscarArticulo(array, codigo);
        System.out.println(a);
        System.out.print("Introduce cuántas unidades quieres depositar: ");
        int unidades = sc.nextInt();
        int stock = a.getStock();
        a.setStock(unidades+stock);
        System.out.println("Se ha depositado la mercancía.");
        return a;
    }

    public static Articulo salidaMercancia(Articulo[] array) {
        System.out.print("Introduce el código del articulo cque quieres extraer: ");
        String codigo = sc.nextLine();
        Articulo a = buscarArticulo(array, codigo);
        System.out.println(a);
        System.out.print("Introduce cuántas unidades quieres extraer: ");
        int unidades = sc.nextInt();
        int stock = a.getStock();
        if (unidades-stock > 0) {
            a.setStock(unidades+stock);
            System.out.println("Se ha extraído la mercancía.");
        } else {
            System.out.println("Lo siento. No se puede extraer tanta mercancía.");
        }
        return a;
    }
}
