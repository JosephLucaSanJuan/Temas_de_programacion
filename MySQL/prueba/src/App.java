

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class App {
    public static void main(String[] args) throws Exception {
        // Configuración de la conexión a la base de datos
        String url = "jdbc:mysql://localhost:3306/alumno";
        String usuario = "root";
        String clave = "";
        
        // Declaración de variables
        Connection conexion = null;
        Statement sentencia = null;
        ResultSet resultado = null;
        
        try {
            // Conexión a la base de datos
            conexion = DriverManager.getConnection(url, usuario, clave);
            
            // Creación de la sentencia SQL
            String sql = "SELECT id, nombre, apellidos FROM alumnos";
            sentencia = conexion.createStatement();
            
            // Ejecución de la consulta
            resultado = sentencia.executeQuery(sql);
            
            // Recorrido del resultado de la consulta
            while(resultado.next()) {
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                String apellidos = resultado.getString("apellidos");
                
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Apellidos: " + apellidos);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Cierre de la conexión
                if (conexion != null) conexion.close();
                if (sentencia != null) sentencia.close();
                if (resultado != null) resultado.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

