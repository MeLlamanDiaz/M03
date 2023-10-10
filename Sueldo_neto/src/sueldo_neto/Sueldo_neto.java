/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sueldo_neto;
import java.util.Scanner;
/**
 *
 * @author addi4500
 */
public class Sueldo_neto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double hora, sueldo_bruto = 0, sueldo_neto, tarifa_normal = 20, impuesto, horas_normales = 35;
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Quantes hores has treballat?");
       hora = sc.nextDouble();
       
       if (hora <= horas_normales){
            sueldo_bruto = hora * tarifa_normal;
        }
       else if (hora>horas_normales){
           sueldo_bruto = horas_normales * tarifa_normal+(hora - horas_normales)*tarifa_normal*1.5;
            }
           
       if ((sueldo_bruto > 500) && (sueldo_bruto<=900)) { //sueldo neto si sueldo bruto > 500
               impuesto = sueldo_bruto * 25 / 100; //impuesto del 25%
               sueldo_neto = sueldo_bruto - impuesto;
               System.out.println("Tu sou brut es de " + sueldo_bruto);
               System.out.println("Impost = " + impuesto);
               System.out.println("Tu sou net es de " + sueldo_neto);
           } 
        else if (sueldo_bruto > 900) { //sueldo neto si sueldo bruto > 500
               impuesto = sueldo_bruto * 45 / 100; //impuesto del 45%
               sueldo_neto = sueldo_bruto - impuesto;
               System.out.println("Tu sou brut es de " + sueldo_bruto);
               System.out.println("Impost = " + impuesto);
               System.out.println("Tu sou net es de " + sueldo_neto);
           }
       }
    }
    
