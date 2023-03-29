package alumnos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AlumnosService {
    Connection conn;
    public AlumnosService(Connection conn){
        this.conn = conn;
    }

    public ArrayList<Alumno> requestAll() throws SQLException{
        Statement statement = null;
        ArrayList<Alumno> result = new ArrayList<Alumno>();
        statement = this.conn.createStatement();   
        String sql = "SELECT id, nombre, apellidos FROM alumnos";
        // Ejecución de la consulta
        ResultSet querySet = statement.executeQuery(sql);
        // Recorrido del resultado de la consulta
        while(querySet.next()) {
            int id = querySet.getInt("id");
            String nombre = querySet.getString("nombre");
            String apellidos = querySet.getString("apellidos");
            int idGrupo = querySet.getInt("idGrupo");
            result.add(new Alumno(id, nombre, apellidos, idGrupo));
        } 
        statement.close();    
        return result;
    }

    public Alumno requestById(int id) throws SQLException{
        Statement statement = null;
        Alumno result = null;
        statement = this.conn.createStatement();    
        String sql = String.format("SELECT id, nombre, apellidos FROM alumnos WHERE id=%d", id);
        // Ejecución de la consulta
        ResultSet querySet = statement.executeQuery(sql);
        // Recorrido del resultado de la consulta
        if(querySet.next()) {
            String nombre = querySet.getString("nombre");
            String apellidos = querySet.getString("apellidos");
            int idGrupo = querySet.getInt("idGrupo");
            result = new Alumno(id, nombre, apellidos, idGrupo);
        }
        statement.close();    
        return result;
    }

    public int create(String nombre, String apellidos) throws SQLException{
        Statement statement = null;
        statement = this.conn.createStatement();    
        String sql = String.format("INSERT INTO alumnos (nombre, apellidos, idGrupo) VALUES ('%s', '%s')", nombre, apellidos);
        // Ejecución de la consulta
        int affectedRows = statement.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);
        if (affectedRows == 0) {
            throw new SQLException("Creating user failed, no rows affected.");
        }
        try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                int id = generatedKeys.getInt(1);
                statement.close();
                return id;
            }
            else {
                statement.close();
                throw new SQLException("Creating user failed, no ID obtained.");
            }
        }
    }

    public int update(int id, String nombre, String apellidos) throws SQLException{
        Statement statement = null;
        statement = this.conn.createStatement();    
        String sql = String.format("UPDATE alumnos SET nombre = '%s', apellidos = '%s', idGrupo = %d WHERE id=%d", nombre, apellidos, id);
        // Ejecución de la consulta
        int affectedRows = statement.executeUpdate(sql);
        statement.close();
        if (affectedRows == 0)
            throw new SQLException("Creating user failed, no rows affected.");
        else
            return affectedRows;
    }

    public boolean delete(int id) throws SQLException{
        Statement statement = null;
        statement = this.conn.createStatement();    
        String sql = String.format("DELETE FROM alumnos WHERE id=%d", id);
        // Ejecución de la consulta
        int result = statement.executeUpdate(sql);
        statement.close();
        return result==1;
    }

    public int matricular(int id, int idGrupo) throws SQLException{
        Statement statement = null;
        statement = this.conn.createStatement();
        String sql = String.format("UPDATE alumnos WHERE id=%d ADD FOREIGN KEY GroupID=%d", idGrupo, id);
        int result = statement.executeUpdate(sql);
        statement.close();
        return result;
    }

    public int cambiarDeGrupo(int id, int grupoNuevo) throws SQLException{
        Statement statement = null;
        statement = this.conn.createStatement();
        String sql = String.format("UPDATE alumnos WHERE id=%d SET FOREIGN KEY GrupoID=%d", id, grupoNuevo);
        int result = statement.executeUpdate(sql);
        statement.close();
        return result;
    }

    public int desmatricular(int id) throws SQLException{
        Statement statement = null;
        statement = this.conn.createStatement();
        String sql = String.format("UPDATE alumnos WHERE id=%d REMOVE FOREIGN KEY GroupID=%d", id);
        int result = statement.executeUpdate(sql);
        statement.close();
        return result;
    }
}
