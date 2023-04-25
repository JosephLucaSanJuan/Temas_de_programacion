/**
 * Tema 4
 * 22º Calcula cuantos minutos faltan para el fin de semana.
 * 
 * @author Joseph Luca San Juan Thompson
 */

import java.util.Scanner;

public class Tema04Ej22 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un día de la semana: ");
    String dia = sc.nextLine();
    System.out.print("Introduce una hora: ");
    int hora = sc.nextInt();
    System.out.print("Introduce un minuto: ");
    int min = sc.nextInt();
    int minTotales = 0;
    int minDia = 60*24;
    int minDiaV = 60*15;
    int tiempoRestante = 0;

    if (hora>23 || min >59) {
      System.out.println("Hora o minutos no válidos");
    } else {
      minTotales = (hora*60)+min;

      if (dia.equals("lunes")) {
        tiempoRestante = (minDia*4)+minDiaV-minTotales;
      } else if (dia.equals("martes")) {
        tiempoRestante = (minDia*3)+minDiaV-minTotales;
      } else if (dia.equals("miercoles")) {
        tiempoRestante = (minDia*2)+minDiaV-minTotales;
      } else if (dia.equals("jueves")){
        tiempoRestante = minDia+minDiaV-minTotales;
      } else if (dia.equals("viernes")){
        if (hora>=15) {
          System.out.println("Si eliges el viernes, la hora debe ser menor que 15.");
        } else {
          tiempoRestante = minDiaV - minTotales;
        }
      }
    }
    System.out.printf("Quedan %d minutos hasta el fin de semana.", tiempoRestante);
    sc.close();
  }
}
