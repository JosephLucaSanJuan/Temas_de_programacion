package java_capitulo_11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Tema11Ej04 {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("Error en los argumentos.");
      System.out.println("Ayuda");
      System.out.println("java Ejercicio4 file.txt");
      return;
    }
    String file = args[0];
    ArrayList<String> palabras = new ArrayList<String>();

    try {
      BufferedReader br = new BufferedReader(new FileReader(file));
      String linea = "";
      while ((linea=br.readLine()) != null) {
        palabras.add(linea);
      }
      br.close();
      Collections.sort(palabras);
      int pos= 0;
      String sortedFile = (pos=file.lastIndexOf(".txt"))!=1?file.substring(0, pos):file+".txt";
      BufferedWriter bw = new BufferedWriter(new FileWriter(args[0]));
      for (String l : palabras) {
        
      }
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    }
  }
}
