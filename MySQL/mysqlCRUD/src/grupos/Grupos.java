package grupos;

public class Grupos {
    int id;
    String nombre;
    String profesor;

    Grupos(int id, String nombre, String profesor) {
        this.id = id;
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesor() {
        return this.profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
    
    @Override
    public String toString(){
        return "ID: "+this.id+", Nombre de alumno: "+this.nombre+", Profesor: "+this.profesor;
    }
}
