package EjercicioPrueba_clases_genéricas;

public class ClaseGenerica {
  public static void main(String[] args) {
    TheThing<Integer> t1 = new TheThing<>(6, 10);
    TheThing<Double> t2 = new TheThing<Double>(1.4, 6); 
    TheThing<String> t3 = new TheThing<String>("Dragon Ball", 6);

    System.out.println("Grab all the things: "+t1);
    System.out.println("Grab all the things: "+t2);
    System.out.println("Grab all the things: "+t3);
  }
}
