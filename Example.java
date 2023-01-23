public class Example {
  public static void main(String[] args) {
    MyObject<Integer> o1 = new MyObject<>(10);
    MyObject<String> o2 = new MyObject<String>("Hola");
    System.out.println("Objeto 1: "+o1.get());
    System.out.println("Objeto 2: "+o2.get());

    Pair<String, MyObject<Integer>> p1 = new Pair<String,MyObject<Integer>>("Clave 1", new MyObject<>(10));
    Pair<Integer, MyObject<Double>> p2 = new Pair<Integer,MyObject<Double>>(100, new MyObject<>(10.5));
    System.out.println("Pair 1 = "+"Key: "+p1.getKey()+", Value: "+p1.getValue().get());
    System.out.println("Pair 2 = "+"Key: "+p2.getKey()+", Value: "+p2.getValue().get());
  }
}
