import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import alumnos.Alumno;
import alumnos.AlumnosService;
import connection.ConnectionPool;
import grupos.GrupoService;
import grupos.Grupos; 
public class App {
    public static void listarGrupos(GrupoService service) {
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
            System.out.println("No se han encontrado grupos de alumnos");
        }
    }
    
    public static void listarAlumnos(AlumnosService service) {
        try {
            ArrayList<Alumno> alumnos = service.requestAll();
            if (alumnos.size()==0) {
                System.out.println("No hay alumnos");
            } else {
                for (Alumno a : alumnos) {
                    System.out.println(a);
                }
            }
        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println("No se han encontrado alumnos");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // Configuración de la conexión a la base de datos
        String url = "jdbc:mysql://localhost:3306/alumnos2";
        String usuario = "joseph";
        String clave = "2468";

        ConnectionPool pool = new ConnectionPool(url, usuario, clave);
        AlumnosService service = new AlumnosService(pool.getConnection());
        GrupoService gservice = new GrupoService(pool.getConnection());
        String nombre, profesor, apellidos;
        int id, idGrupo;
        boolean salir = false;
        boolean exit = false;
        
        while (!salir) {
            System.out.println("Elije una opción");
            System.out.println("1. Gestionar alumnos\n2. Gestionar grupos\n3. Gestionar matrículas\n4. Salir");
            int op = sc.nextInt();
            int opcion = 0;
            exit = false;
            switch (op) {
                case 1:
                    while (!exit) {
                        try {
                            System.out.println("1.1 Crear un alumno");
                            System.out.println("1.2 Modificar un alumno");
                            System.out.println("1.3 Borrar un alumno");
                            System.out.println("1.4 Volver");
                            opcion = sc.nextInt();
                            switch (opcion) {
                                case 1:
                                    System.out.print("Introduce su id");
                                    id = sc.nextInt();
                                    System.out.print("Introduce su nombre");
                                    nombre = sc.nextLine();
                                    System.out.print("Introduce sus apellidos");
                                    apellidos = sc.nextLine();
                                    try {
                                        id = service.create(nombre, apellidos);
                                        System.out.println("Nuevo alumno ha sido creado correctamente");
                                    } catch (Exception e) {
                                        System.out.println("No se ha podido crear un nuevo alumno");
                                    };
                                    break;
                                case 2:
                                    System.out.println("Introduce el id del alumno elegido");
                                    id = sc.nextInt();
                                    System.out.println(service.requestById(id));
                                    System.out.print("Introduce un nuevo ID: ");
                                    int newID = sc.nextInt();
                                    System.out.print("Introduce un nuevo nombre: ");
                                    nombre = sc.nextLine();
                                    System.out.print("Introduce los nuevos apellidos: ");
                                    apellidos = sc.nextLine();
                                    try {
                                        id = service.update(newID, nombre, apellidos);
                                        System.out.println("Alumno modificado.");
                                    } catch (Exception e) {
                                        System.out.println("No se ha podido modificar correctamente el alumno");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Introduce el ID del alumno que quieres borrar");
                                    id = sc.nextInt();
                                    service.delete(id);
                                    break;
                                case 4:
                                    exit = true;
                                    break;
                                default:
                                    break;
                            }
                        } catch (Exception e) {
                            // TODO: handle exception
                        }
                    }
                    break;
                case 2:
                    while (!exit) {
                        try {
                            // Conexión a la base de datos
                            System.out.println("2.1 Crear un grupo de alumnos");
                            System.out.println("2.2 Editar un grupo de alumnos");
                            System.out.println("2.3 Borrar un grupo de alumnos");
                            System.out.println("2.4 Visualizar un grupo de alumnos");
                            System.out.println("2.5 Volver");
                            opcion = sc.nextInt();
                            //TODO: Incluye llamadas para probar el servicio
                            switch (opcion) {
                                case 1:
                                    System.out.print("Introduzca el nombre del grupo");
                                    nombre = sc.nextLine();
                                    System.out.print("Introduzca el nombre del profesor");
                                    profesor = sc.nextLine();
                                    try {
                                        id = gservice.create(nombre, profesor);
                                        System.out.printf("Grupo creado correctamente (id: %d)", id);
                                    } catch (Exception e) {
                                        System.out.println("No ha sido posible crear la tabla");
                                    }
                                    break;
                                case 2:
                                    System.out.print("Elija el grupo a editar");
                                    listarGrupos(gservice);
                                    System.out.print("Modifica el ID: ");
                                    int newID = sc.nextInt();
                                    System.out.print("Introduce el nuevo nombre: ");
                                    nombre = sc.nextLine();
                                    System.out.print("Introduce el nuevo profesor del grupo: ");
                                    profesor = sc.nextLine();
                                    try {
                                        id = gservice.update(newID, nombre, profesor);
                                        System.out.println("Grupo modificado correctamente");
                                    } catch (Exception e) {
                                        // TODO: handle exception
                                        System.out.println("No se ha podido modificar el grupo correctamente.");
                                    }
                                    break;
                                case 3:
                                    System.out.print("Introduce el ID del grupo: ");
                                    id = sc.nextInt();
                                    gservice.delete(id);
                                    break;
                                case 4:
                                    listarGrupos(gservice);
                                    break;
                                case 5:
                                    exit = true;
                                    break;
                                default:
                                    break;
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        } finally {
                            pool.closeAll();
                        }
                    }
                    break;
                case 3:
                    while (!exit) {
                        try {
                            System.out.println("3.1 Matricular un alumno en grupo");
                            System.out.println("3.2 Desmatricular alumno");
                            System.out.println("3.3 Cambiar un alumno de grupo.");
                            System.out.println("3.4 Volver");
                            opcion = sc.nextInt();
                            switch (opcion) {
                                case 1:
                                    System.out.print("Introduce el ID del alumno: ");
                                    id = sc.nextInt();
                                    System.out.print("Introduce el grupo al cual le quieres matricular: ");
                                    idGrupo = sc.nextInt();
                                    try {
                                        service.matricular(id, idGrupo);
                                        System.out.println("El alumno ha sido matriculado correctamente.");
                                    } catch (Exception e) {
                                        System.out.println("No se ha podido matricular el alumno correctamente.");
                                    }
                                    break;
                                case 2:
                                    System.out.print("Introduce el ID del alumno: ");
                                    id = sc.nextInt();
                                    try {
                                        service.desmatricular(id);
                                        System.out.println("El alumno ha sido desmatriculado correctamente.");
                                    } catch (Exception e) {
                                        System.out.println("No se ha podido desmatricular el alumno correctamente");
                                    }
                                    break;
                                case 3:
                                    System.out.print("Introduce el ID del alumno: ");
                                    id = sc.nextInt();
                                    System.out.print("Introduce el grupo al cual le quieres matricular: ");
                                    idGrupo = sc.nextInt();
                                    System.out.print("Introduce el id del nuevo grupo: ");
                                    int nuevoGrupo = sc.nextInt();
                                    try {
                                        service.cambiarDeGrupo(id, nuevoGrupo);
                                        System.out.println("El alumno ha sido cambiado de grupo correctamente.");
                                    } catch (Exception e) {
                                        // TODO: handle exception
                                    }
                                    break;
                                case 4:
                                    exit = true;
                                    break;
                                default:
                                    break;
                            }
                        } catch (Exception e) {
                            // TODO: handle exception
                        }
                    }
                    break;
                case 4:
                    salir = true;;
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}
