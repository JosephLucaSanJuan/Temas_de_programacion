/**
 * Tema04
 * 24º Genera la nómina de un empleado
 * 
 * @author Joseph Luca San Juan Thompson
 */

import java.util.Scanner;

public class Tema04Ej24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("1 - Programador junior\n2 - Prog. senior\n3 - Jefe de proyecto");
    System.out.print("Introduzca el cargo del empleado (1-3): ");
    int cargo = sc.nextInt();
    System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
    int dias = sc.nextInt();
    System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
    int estadoCiv = sc.nextInt();
    int dietas = dias*30;
    int salario = 0;
    int IRPF = 0;

    switch (cargo) {
      case 1:
        salario = 950;
        break;
    
      case 2:
        salario = 1200;
        break;
        
      case 3:
        salario = 1600;
        break;

      default:
        break;
    }

    switch (estadoCiv) {
      case 1:
        IRPF = 25;
        break;
      case 2:
        IRPF = 20;
        break;
      default:
        break;
    }

    int sueldoBruto = salario+dietas;
    int retencionIRPF = (sueldoBruto*IRPF)/100;

    System.out.println("----------------------------------");
    System.out.printf("| Sueldo base %d |", salario);
    System.out.printf("\n| Dietas (%d viajes) %d |", dias, dietas);
    System.out.println("\n|--------------------------------|");
    System.out.printf("| Sueldo bruto %d |", sueldoBruto);
    System.out.printf("\n| Retención IRPF (%d%%) %d |", IRPF, retencionIRPF);
    System.out.println("\n|--------------------------------|");
    System.out.printf("| Sueldo neto %d |", sueldoBruto-retencionIRPF);
    System.out.println("\n----------------------------------");
    sc.close();
  }
}
