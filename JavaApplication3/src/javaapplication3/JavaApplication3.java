/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author addi4500
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double hora, sueldo, normal = 20, impuesto;
       Scanner sc = new Scanner(System.in);
       System.out.println("Quantes hores has treballat?");
       hora = sc.nextDouble();
       if (hora<=35){
            sueldo=hora*normal;
            if (sueldo>500){
                impuesto = 25/100;
                sueldo = sueldo - sueldo*impuesto;
                System.out.println("Tu sou es de " + sueldo);
                }
            else{
            System.out.println("Tu sou es de " + sueldo);
            }
        }
       else if (hora>35){
           sueldo=35*20+(hora-35)*30;
           if (sueldo>500){
                impuesto = 25/100;
                sueldo = sueldo - sueldo*impuesto;
                System.out.println("Tu sou es de " + sueldo);
             }
           else{
            System.out.println("Tu sou es de " + sueldo);
            }
       }
    }
    
}
