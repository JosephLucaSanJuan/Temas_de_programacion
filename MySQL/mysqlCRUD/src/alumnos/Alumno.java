package alumnos;
public class Alumno {
    int id;
    String nombre;
    String apellidos;
    int idGrupo;
 
    public Alumno(){
        this(0,"","",0);
    }

    public Alumno(int id, String nombre, String apellidos, int idGrupo){
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.idGrupo = idGrupo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getIdGrupo() {
        return this.idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Nombre: %s, Apellidos: %s, ID del Grupo: %d", this.id, this.nombre, this.apellidos, this.idGrupo);
    }
}
