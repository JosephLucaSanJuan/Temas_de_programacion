/**
 * Tema06Ej15
 * 
 * @autor Joseph Luca San Juan Thomspson
 */

package java_capitulo_6;

public class Tema06Ej15 {
  public static void main(String[] args) {
    String nota = "";
    int cuentaCompas = 0;
    int numCompas = (int)(Math.random()*6+1);
    
    while (cuentaCompas<numCompas) {
      int numNota = (int)(Math.random()*7+1);
      
      for (int i = 0; i < 4; i++) {
        numNota = (int)(Math.random()*7+1);
        switch (numNota) {
          case 1:
            nota = "do";
            break;
          case 2:
            nota = "re";
            break;
          case 3:
            nota = "mi";
            break;
          case 4:
            nota = "fa";
            break;
          case 5:
            nota = "sol";
            break;
          case 6:
            nota = "la";
            break;
          case 7:
            nota = "si";
            break;
          default:
            break;
        }
        
        System.out.print(nota+" ");
      }
      if (cuentaCompas<numCompas-1) {
        System.out.print("| ");
      }
      cuentaCompas++;
    }
    System.out.println("||");
    System.out.println(numCompas);
  }
}
