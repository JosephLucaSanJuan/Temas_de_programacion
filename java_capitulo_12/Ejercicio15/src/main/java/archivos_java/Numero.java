package archivos_java;

public class Numero {
    public int n;
    public Numero(int n){
        this.n = n;
    }

    @Override
    public String toString() {
        return "<p>"+this.n+"</p>";
    }
}