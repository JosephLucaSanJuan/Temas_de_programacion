package archivos_java;

public class Primo extends Numero{
    public Primo(int n){
        super(n);
    }

    @Override
    public String toString(){
        return "<span>"+this.n+"</span>";
    }
}
