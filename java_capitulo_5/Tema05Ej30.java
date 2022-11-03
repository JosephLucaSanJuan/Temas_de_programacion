/**
 * Tema 5
 * 30º Calcula las horas transcurridas entres 2 días.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej30 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean correcto = true;
    String diaInicio = "";
    int dia1 = 0;
    int hora1 = 0;
    String diaFin = "";
    int dia2 = 0;
    int hora2 = 0;
    do {
      boolean diaOk = true;
      do {
        System.out.print("Introduce el primer día: ");
        diaInicio = sc.nextLine();
        switch (diaFin) {
          case "lunes":
          case "1":
            dia1=1;
            diaInicio="lunes";
            break;
          case "martes":
          case "2":
            dia1=2;
            diaInicio="martes";
            break;
          case "miercoles":
          case "3":
            dia1=3;
            diaInicio="miércoles";
            break;
          case "jueves":
          case "4":
            dia1=4;
            diaInicio="jueves";
            break;
          case "viernes":
          case "5":
            dia1=5;
            diaInicio="viernes";
            break;
          case "sabado":
          case "6":
            dia1=6;
            diaInicio="sabado";
            break;
          case "domingo":
          case "7":
            dia1=7;
            diaInicio="domingo";
            break;
          default:
            diaOk=false;
            break;
        }
        if (diaOk) {
          System.out.print("Introduce la hora: ");
        } else {
          
        }
      } while (!diaOk);
      if (!diaOk) {
        
      }
    } while (!correcto);
    System.out.print("Entre las " + hora1 + ":00 del " + diaInicio);
    System.out.print(" y las "+hora2+":00 del "+diaFin);
    System.out.println(" hay "+" horas.");
  }
}
