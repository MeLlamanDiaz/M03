/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;


/**
 *
 * @author addi4500
 */
public class JavaApplication1 {

    public static void main(String[] args) {
        // TODO code application logic here
    char carta; 
            
Scanner sc = new Scanner(System.in);
    
System.out.println("Quantes copes tens aconseguides?");
int copes = sc.nextInt();    
    
    if (copes<2000){   
            System.out.println("Quina carta vols Mago Electrico(m) o Esbirro Mega(e)");
            carta = sc.next().charAt(0);

            if (carta=='e' || carta=='E'){
                System.out.println("Has escollit Esbirro Mega");
            }
            else if (carta=='m' || carta=='M'){
                System.out.println("Has escollit Mago Electrico");
                        }
            else {
                System.out.println("carta no válida");
            }
        }
    else if (copes>=2000 && copes<3000){   
            System.out.println("Quina carta vols Cavallero(c) i Bandida(b)");
            carta = sc.next().charAt(0);

            if (carta=='c' || carta=='C'){
                System.out.println("Has escollit Cavallero");
            }
            else if (carta=='b' || carta=='B'){
                System.out.println("Has escollit Bandida");
                        }
            else {
                System.out.println("carta no válida");
            }
        }
    else if (copes>=3000){   
            System.out.println("Quina carta vols Ejercito de Esqueletos(e) o el Gigante(g)");
            carta = sc.next().charAt(0);

            if (carta=='e' || carta=='E'){
                System.out.println("Has Ejercito de Esqueletos");
            }
            else if (carta=='g' || carta=='G'){
                System.out.println("Has escollit Gigante");
                        }
            else {
                System.out.println("carta no válida");
        }
    }
}
}