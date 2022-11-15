package java_capitulo_6;

public class Tema06Ej11 {
  public static void main(String[] args) {
    int nota = 0;
    int cuentaSobresalientes = 0;
    int cuentaNotables = 0;
    int cuentaBienes = 0;
    int cuentaSuficientes=0;
    int cuentaSuspensos = 0;
    
    for (int i = 0; i < 20; i++) {
      nota = (int)(Math.random()*5)+1;
      switch (nota) {
        case 1:
          System.out.println("Sobresaliente");
          break;
        case 2:
          System.out.println("Notable");
          break;
        case 3:
          System.out.println("Bien");
          break;
        case 4:
          System.out.println("Suficiente");
          break;
        case 5:
          System.out.println("Suspenso");
          break;
        default:
          break;
      }

      if (nota == 1) {
        cuentaSobresalientes++;
      } else if (nota==2) {
        cuentaNotables++;
      } else if (nota==3) {
        cuentaBienes++;
      } else if (nota==4) {
        cuentaSuficientes++;
      } else if (nota==5) {
        cuentaSuspensos++;
      }
    }
    System.out.println("\nNº de sobresalientes: "+cuentaSobresalientes);
    System.out.println("Nº de notables: "+cuentaNotables);
    System.out.println("Nº de bienes: "+cuentaBienes);
    System.out.println("Nº de suficientes: "+cuentaSuficientes);
    System.out.println("Nº de suspensos: "+cuentaSuspensos);
  }
}
