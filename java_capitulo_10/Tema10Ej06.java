/**
 * Tema 10
 * 6º Crea un HashMap que guarde los usuarios y contraseñas
 *    para acceder a un área restringida.
 * 
 * 
 * @author Joseph Luca San Juan Thompson
 */
package java_capitulo_10;

import java.util.HashMap;
import java.util.Scanner;

public class Tema10Ej06 {
  public static void main(String[] args) {
    HashMap<String, String> nombre = new HashMap <String, String>();

    nombre.put("JurassicJoe03", "Thundercracker36");
    nombre.put("TyrannoJoe", "Mapusaurus36");
    nombre.put("Tarn06", "Hyaenodon36");

    Scanner sc = new Scanner(System.in);

    System.out.println("\nImplementa el control de acceso al área restringida de un programa.");

    //int cuentaInt = 0;
    String usu;
    String pwd;
    int intentos = 3;
    boolean conexExit=false;

    do {
      System.out.print("\nIntroduce un nombre de usuario: ");
      usu = sc.nextLine();

      System.out.print("\nIntroduce una contraseña: ");
      pwd = sc.nextLine();

      if (nombre.containsKey(usu) && pwd.equals(nombre.get(usu))) {
        System.out.println("\nHas accedido al area restringida.");
        intentos=0;
        conexExit = true;
      } else {
        System.out.println("\nUsuario o contraseña incorrecta");
        intentos--;
      }
    
    } while (intentos>=1 && !conexExit);

    if (intentos==0 && (!nombre.containsKey(usu) || !pwd.equals(nombre.get(usu)))) {
      System.out.println("\nLo siento, no tiene acceso al area restringida");
    }
    sc.close();
  }
}
