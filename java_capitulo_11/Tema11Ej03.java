/**
 * Tema 11
 * 3º Crea un fichero y escribe en el los numero primos del 1 al 500.
 * 
 * @author Joseph Luca San Juan Thompson
 */
package java_capitulo_11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Tema11Ej03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String arg1 = "";
    String arg2 = "";
    String argFinal = "";
    ArrayList<String> mezcla = new ArrayList<String>();

    try {
      BufferedReader br = new BufferedReader(new FileReader(arg1));
      BufferedReader bf = new BufferedReader(new FileReader(arg2));

      System.out.println("Introduce el primer archivo: ");
      arg1 = sc.nextLine();
      System.out.println("Introduce el segundo archivo: ");
      arg2 = sc.nextLine();

      String l1 = br.readLine();
      String l2 = bf.readLine();

      while ((l1!=null) || (l2!=null)) {
        if (l1!=null) {
          mezcla.add(l1);
          //System.out.println(l1+" ");
          l1 = br.readLine();
        }

        if (l2!=null) {
          mezcla.add(l2);
          //System.out.println(l2+" ");
          l2 = bf.readLine();
        }
      }

      br.close();
      bf.close();
    } catch (Exception e) {
      // TODO: handle exception
    }

    try {
      argFinal = "fichero3.txt";

      //BufferedWriter bw = new BufferedWriter(new FileWriter(argFinal));
      File file = new File(argFinal);
      
      for (String l : mezcla) {
        System.out.println(l);
      }
      //bw.close();
    } catch (Exception e) {
      // TODO: handle exception
    }
  }
}
