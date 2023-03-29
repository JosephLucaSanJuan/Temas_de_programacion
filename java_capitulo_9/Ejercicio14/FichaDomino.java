package Ejercicio14;

public class FichaDomino {
    private int lado1;
    private int lado2;

    public FichaDomino(int lado1, int lado2){
        this.lado1=lado1;
        this.lado2=lado2;
    }

  public int getLado1() {
    return this.lado1;
  }

  public void setLado1(int lado1) {
    this.lado1 = lado1;
  }

  public int getLado2() {
    return this.lado2;
  }

  public void setLado2(int lado2) {
    this.lado2 = lado2;
  }

    @Override
    public String toString() {
        if (this.lado1==0) {
            return "[ |"+this.lado2+"]";
        } else if (this.lado2==0) {
            return "["+this.lado1+"| ]";
        } else {
            return "["+this.lado1+"|"+this.lado2+"]";
        }
    }

    public FichaDomino voltea() {
        int l1 = this.lado2;
        int l2 = this.lado1;
        return new FichaDomino(l1, l2);
    }

    public boolean encaja(FichaDomino f) {
        if (this.lado2==f.getLado1() || this.lado1==f.getLado2() || this.lado1==f.getLado1() || this.lado2==f.getLado2()) {
            return true;
        } else {
            return false;
        }
    }
}
