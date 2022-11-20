/**
 * Tema06
 * 29º Muestra la previsión del tiempo para mañana en Málaga.
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_6;

import java.util.Scanner;

public class Tema06Ej29 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("1.Primavera\n2. Verano\n3. Otoño\n4. Invierno");
    System.out.print("Selecciona una estación del año (1-4): ");
    int estacion = sc.nextInt();
    int tempMin = 0;
    int tempMax = 0;
    String NubSol = "";

    switch (estacion) {
      case 1:
        tempMin = (int)(Math.random()*16)+15;
        tempMax = (int)(Math.random()*16)+15;
        NubSol = Math.random() <= 0.6? "soleado" : "nublado";
        break;
      case 2:
        tempMin = (int)(Math.random()*21)+25;
        tempMax = (int)(Math.random()*21)+25;
        NubSol = Math.random() <= 0.8? "soleado" : "nublado";
        break;
      case 3:
        tempMin = (int)(Math.random()*11)+20;
        tempMax = (int)(Math.random()*11)+20;
        NubSol = Math.random() <= 0.6? "nublado" : "soleado";
        break;
      case 4:
        tempMin = (int)(Math.random()*26);
        tempMax = (int)(Math.random()*26);
        NubSol = Math.random() <= 0.8? "nublado" : "soleado";
        break;
      default:
        break;
    }
    
    if (tempMin>tempMax) {
      int temp = tempMin;
      tempMin = tempMax;
      tempMax = temp;
    }

    System.out.println("\nPrevisión del tiempo para mañana");
    System.out.println("--------------------------------");
    System.out.printf("Temperatura máxima: %d\n",tempMax);
    System.out.printf("Temperatura mínima: %d\n",tempMin);
    System.out.println(NubSol);
    sc.close();
  }
}
