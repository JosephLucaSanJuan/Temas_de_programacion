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
      boolean diaOK = true;
      do {
        System.out.print("Introduce el primer día: ");
        diaInicio = sc.nextLine();
        switch (diaInicio) {
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
            diaOK=false;
            break;
        }
        if (!diaOK) {
          System.out.print("Respuesta incorrecto. Introduce otra.");
          diaOK = false;
        }
      } while (!diaOK);

      boolean horaOK;
      do {
        horaOK = true;
        System.out.print("Introduce la primera hora: ");
        hora1 = sc.nextInt();
        if ((hora1<0) || (hora1>23)) {
          System.out.println("No se introducido una hora correcta. Las horas válidas son de 0 a 23.");
          horaOK = false;
        }
      } while (!horaOK);

      do {
        correcto = true;
        diaOK = true;
        System.out.print("Introduce el segundo día: ");
        diaFin = sc.nextLine();
        switch (diaFin) {
          case "lunes":
          case "1":
            dia2=1;
            diaFin="lunes";
            break;
          case "martes":
          case "2":
            dia2=2;
            diaFin="martes";
            break;
          case "miercoles":
          case "3":
            dia2=3;
            diaFin="miércoles";
            break;
          case "jueves":
          case "4":
            dia2=4;
            diaFin="jueves";
            break;
          case "viernes":
          case "5":
            dia2=5;
            diaFin="viernes";
            break;
          case "sabado":
          case "6":
            dia2=6;
            diaFin="sabado";
            break;
          case "domingo":
          case "7":
            dia2=7;
            diaFin="domingo";
            break;
          default:
            diaOK=false;
            break;
        }
        if (!diaOK) {
          System.out.println("Respuesta incorrecto.\nLos días válidos son lunes, martes, miercoles, jueves viernes, sabado y domingo.");
          diaOK = false;
        }
      } while (!diaOK);

      if (dia2<=dia1) {
        System.out.println("Debes introducir el día posterior al primer día.");
        correcto = false;
      }

      if (correcto) {
        do {
          horaOK=true;
          System.out.print("Introduce la segunda hora: ");
          hora2 = sc.nextInt();
          if ((hora2<0) || (hora2>23)) {
            System.out.println("La hora introducida no es válida.");
            System.out.println("Las horas válidas son entre 0 y 23.");
            horaOK = false;
          }
        } while (!horaOK);
      }
    } while (!correcto);
    System.out.print("Entre las " + hora1 + ":00 del " + diaInicio);
    System.out.print(" y las "+hora2+":00 del "+diaFin);
    System.out.println(" hay "+(((dia2*24)+hora2)-((dia1*24)+hora1))+" horas.");
    sc.close();
  }
}
