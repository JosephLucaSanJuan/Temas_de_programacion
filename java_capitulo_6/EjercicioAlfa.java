package java_capitulo_6;

public class EjercicioAlfa {
  public static void main(String[] args) {
    var v1 = (int)(Math.random()*11);
    var v2 = (int)(Math.random()*11);

    System.out.println("s:________________________________________");
    System.out.printf("*Valor:%32d*\n", (int)(Math.random()*100));
    System.out.printf("*Valor: %-31d*\n", (int)(Math.random()*100));
    System.out.printf("*%-19d%19d*\n", v1>=5?v1:-v1, v2>=5?v2:-v2);
    //System.out.printf("%-19.2f%19.f*\n", v1*0.05, v2*0.05);
    System.out.print("s:________________________________________");
  }
}
