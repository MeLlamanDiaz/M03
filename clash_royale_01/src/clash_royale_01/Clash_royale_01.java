/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clash_royale_01;
import java.util.Scanner;
/**
 *
 * @author addi4500
 */
public class Clash_royale_01 {
public static void main(String[] args) {
int carta, copes;
            
Scanner sc = new Scanner(System.in);
    
System.out.println("Quantes copes tens aconseguides?");
copes = sc.nextInt();    
    
if (copes<2000){   
        System.out.println("Quina carta vols Mago Electrico(0) o Mega Esbirro(1)");
        carta = sc.nextInt();
        
        if (carta==0 || carta==1){
                    if (carta==1){
                        System.out.println("Has escollit Mega Esbirro");
                    }
                    else if (carta==0){
                        System.out.println("Has escollit Mago Electrico");
                    }
        }
        else {
            System.out.println("carta no válida");
        }
    }
    else if (copes>=2000 && copes<3000){   
        System.out.println("Quina carta vols Cavallero(0) i Bandida(1)");
        carta = sc.nextInt();
        
        if (carta==0 || carta==1){
                    if (carta==1){
                        System.out.println("Has escollit Bandida");
                    }
                    else if (carta==0){
                        System.out.println("Has escollit Cavallero");
                    }
        }
        else {
            System.out.println("carta no válida");
        }
    }
    else if (copes>=3000){   
        System.out.println("Quina carta vols Ejercito de Esqueletos(0) o el Gigante(1)");
        carta = sc.nextInt();
        
        if (carta==0 || carta==1){
                    if (carta==1){
                        System.out.println("Has escollit Gigante");
                    }
                    else if (carta==0){
                        System.out.println("Has escollit Ejercitos de Esqueletos");
                    }
        }
        else {
            System.out.println("carta no válida");
        }
    }
}
}