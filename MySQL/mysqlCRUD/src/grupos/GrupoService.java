package grupos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GrupoService {
    Connection conn;
    public GrupoService(Connection conn){
        this.conn = conn;
    }

    public ArrayList<Grupos> requestAll() throws SQLException{
        Statement statement = null;
        ArrayList<Grupos> result = new ArrayList<Grupos>();
        statement = this.conn.createStatement();   
        String sql = "SELECT id, nombre, profesor FROM grupos";
        // Ejecución de la consulta
        ResultSet querySet = statement.executeQuery(sql);
        // Recorrido del resultado de la consulta
        while(querySet.next()) {
            int id = querySet.getInt("id");
            String nombre = querySet.getString("nombre");
            String profesor = querySet.getString("profesor");
            result.add(new Grupos(id, nombre, profesor));
        } 
        statement.close();    
        return result;
    }

    public Grupos requestById(int id) throws SQLException{
        Statement statement = null;
        Grupos result = null;
        statement = this.conn.createStatement();    
        String sql = String.format("SELECT id, nombre, profesor FROM grupos WHERE id=%d", id);
        // Ejecución de la consulta
        ResultSet querySet = statement.executeQuery(sql);
        // Recorrido del resultado de la consulta
        if(querySet.next()) {
            String nombre = querySet.getString("nombre");
            String profesor = querySet.getString("profesor");
            result = new Grupos(id, nombre, profesor);
        }
        statement.close();    
        return result;
    }

    public int create(String nombre, String profesor) throws SQLException{
        Statement statement = null;
        statement = this.conn.createStatement();    
        String sql = String.format("INSERT INTO alumnos (nombre, profesor) VALUES ('%s', '%s')", nombre, profesor);
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

    public int update(int id, String nombre, String profesor) throws SQLException{
        Statement statement = null;
        statement = this.conn.createStatement();    
        String sql = String.format("UPDATE alumnos SET nombre = '%s', profesor = '%s' WHERE id=%d", nombre, profesor, id);
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
}
