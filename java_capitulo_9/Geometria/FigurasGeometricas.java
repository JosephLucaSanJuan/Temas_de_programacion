package Geometria;

public class FigurasGeometricas {
  public static void main(String[] args) {
    Figura[] figuras = new Figura[20];

    for (int i = 0; i < 20; i++) {
      int figura = (int)(Math.random()*4);

      switch (figura) {
        case 0:
          figuras[i] = new Rectangulo((int)(Math.random()*100),(int)(Math.random()*100));
          break;
        case 1:
          figuras[i] = new Cuadrado((int)(Math.random()*100));
          break;
        case 2:
          figuras[i] = new TrianguloEquilatero((int)(Math.random()*100),(int)(Math.random()*100));
          break;
        case 3:
          figuras[i] = new TrianguloRectangulo((int)(Math.random()*100),(int)(Math.random()*100));
          break;
        default:
          break;
      }
    }
    
    for (Figura figura : figuras) {
      System.out.println(figura);
    }
  }
}
