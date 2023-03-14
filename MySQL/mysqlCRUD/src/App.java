import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

import alumnos.AlumnosService;
import connection.ConnectionPool;
import grupos.GrupoService;
import grupos.Grupos; 
public class App {
    public void listarGrupos(GrupoService service) {
        try {
            ArrayList<Grupos> grupos = service.requestAll();
            if (grupos.size()==0) {
                System.out.println("No hay grupos de alumnos");
            } else {
                for (Grupos g : grupos) {
                    System.out.println(g);
                }
            }
        } catch (SQLException e) {
            // TODO: handle exception
        }
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // Configuración de la conexión a la base de datos
        String url = "jdbc:mysql://localhost:3306/alumno";
        String usuario = "Joseph";
        String clave = "2468";

        ConnectionPool pool = new ConnectionPool(url, usuario, clave);
        GrupoService gservice = new GrupoService(pool.getConnection());
        String nombre, profesor;
        long id;
        boolean salir = false;
        
        while (!salir) {
            try {
                // Conexión a la base de datos
                //AlumnosService service = new AlumnosService(pool.getConnection());
                System.out.println("1. Crear un grupo de alumnos");
                System.out.println("2. Editar un grupo de alumnos");
                System.out.println("3. Borrar un grupo de alumnos");
                System.out.println("4. Visualizar un grupo de alumnos");
                int opcion = sc.nextInt();
                //TODO: Incluye llamadas para probar el servicio
                switch (opcion) {
                    case 1:
                        System.out.println("Introduzca el nombre del grupo");
                        nombre = sc.nextLine();
                        System.out.println("Introduzca el nombre del profesor");
                        profesor = sc.nextLine();
                        try {
                            id = gservice.create(nombre, profesor);
                            System.out.printf("Grupo creado correctamente (id: %d)", id);
                        } catch (Exception e) {
                            System.out.println("No ha sido posible crear la tabla");
                        }
                        break;
                    case 2:
                        System.out.println("Elija el grupo a editar");
                        listarGrupos(gservice);
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        listarGrupos(gservice);
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        break;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                pool.closeAll();
            }
        }
    }
}
