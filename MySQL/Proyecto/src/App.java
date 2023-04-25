import java.util.Scanner;

public class App {
    static Scanner sc;
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int opcion = 0;
        try {
            int iva = 21;
            int descuento = 0;
            inicializar();
            opcion = mainMenu();
            switch (opcion) {
                case 1:
                    int op = menuAlimentacion();
                    switch (op) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            iva = 4;
                            break;
                    
                        default:
                            iva = 10;
                            break;
                    }
                    break;
                case 2:
                    descuento = 20;
                    break;
                case 3:
                    iva = 4;
                    break;
                case 4:
                    break;
                default:
                    break;
            }

            System.out.print("Introduce el nombre del producto: ");
            String nombre = sc.nextLine();
            System.out.print("Introduce la cantidad del producto: ");
            int cantidad = Integer.parseInt(sc.nextLine());
            System.out.print("Introduce el precio por unidad del producto: ");
            double precio = Double.parseDouble(sc.nextLine());
            printTicket(opcion, iva, descuento, nombre, cantidad, precio);
            System.out.println("\nGracias por usar la APP");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error");
        }
        finalizar();
    }

    protected static void inicializar() throws Exception{
        sc = new Scanner(System.in);
    }

    protected static void finalizar() throws Exception{
        if (sc != null) {
            sc.close();
        }
    }

    protected static int mainMenu() throws Exception{
        int ret = 0;
        System.out.println("Introduzca el tipo de producto.");
        System.out.println("1. Alimentación");
        System.out.println("2. Electrónica");
        System.out.println("3. Farmacia");
        System.out.println("4. Moda");
        System.out.print("Opción: ");
        ret = sc.nextInt();
        return ret;
    }

    protected static int menuAlimentacion() throws Exception{
        System.out.println("Introduzca el tipo de alimento");
        System.out.println("1. Huevo");
        System.out.println("2. Leche");
        System.out.println("3. Pan");
        System.out.println("4. Fruta");
        System.out.println("5. Verdura");
        System.out.println("6. Otros");
        System.out.print("Opción: ");
        int ret = sc.nextInt();
        return ret;
    }

    protected static void printTicket(
        int opcion, int iva, int descuento, String nombre, int cantidad, double precio
    ) throws Exception{
        double dto = 0;
        System.out.println("Factura");
        System.out.println("________________________________________");
        System.out.printf("Articulo %31s\n", nombre);
        System.out.printf("Precio %24.2f $/unidad\n", precio);
        System.out.printf("Cantidad %31d\n", cantidad);
        System.out.printf("Total %33.2f$\n", precio*cantidad);
        if (opcion == 2) {
            dto = (double)(descuento/100)*precio*cantidad;
            System.out.printf("Descuento (20%%) %24.2f\n", -dto);
        }
        if (opcion==4 && cantidad>=3) {
            dto = cantidad/3*precio;
            System.out.printf("Descuento (3x2) %24.2f\n", -dto);
        }
        if (-dto > 0) {
            System.out.printf("Total con descuento %.2f");
        }
        double total = precio * cantidad - descuento;
        double parteIVA = total * (double)(iva/100);
        total = total + parteIVA;
        if (iva > 4) {
            System.out.printf("IVA al %d%%%30.2f\n", iva, parteIVA);
        } else {
            System.out.printf("IVA al %d%%%31.2f\n", iva, parteIVA);
        }
        System.out.println("________________________________________");
        System.out.printf("Total con IVA %26.2f\n", total);
    }
}
