package Array_de_objetos.ArraysEjercicio1;

public class Gato {
    private String nombre;
    private String raza;
    private String color;

    Gato(String n, String r, String c){
        this.nombre = n;
        this.raza = r;
        this.color = c;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getRaza(){
        return this.raza;
    }

    public String getColor(){
        return this.color;
    }

    public void setNombre(String n){
        this.nombre = n;
    }

    public void setColor(String c){
        this.color = c;
    }

    public void setRaza(String r){
        this.raza = r;
    }

    public String toString(){
        return "\nNombre: "+this.nombre+"\nColor: "+this.color+"\nRaza: "+this.raza;
    }
}
