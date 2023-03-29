package Ejercicio4;

public class PruebaFraccion {
  public static void main(String[] args) {
    Fraccion fraccion1 = new Fraccion(6, 16);
    Fraccion fraccion2 = new Fraccion(15, 45);
    Fraccion fraccion3 = new Fraccion(120, 60);
    System.out.println(fraccion1+" x "+fraccion2+" = "+fraccion1.multiplica(fraccion2));
    System.out.println(fraccion1+" x "+fraccion3+" = "+fraccion1.divide(fraccion3));
    System.out.println(fraccion2.simplifica());
  }
}
