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

        switch (carta) {
            case 'e', 'E' -> System.out.println("Has escollit Esbirro Mega");
            case 'm', 'M' -> System.out.println("Has escollit Mago Electrico");
            default -> System.out.println("carta no válida");
        }
        }
    else if (copes>=2000 && copes<3000){   
            System.out.println("Quina carta vols Cavallero(c) i Bandida(b)");
            carta = sc.next().charAt(0);

        switch (carta) {
            case 'c', 'C' -> System.out.println("Has escollit Cavallero");
            case 'b', 'B' -> System.out.println("Has escollit Bandida");
            default -> System.out.println("carta no válida");
        }
        }
    else if (copes>=3000){   
            System.out.println("Quina carta vols Ejercito de Esqueletos(e) o el Gigante(g)");
            carta = sc.next().charAt(0);

        switch (carta) {
            case 'e', 'E' -> System.out.println("Has Ejercito de Esqueletos");
            case 'g', 'G' -> System.out.println("Has escollit Gigante");
            default -> System.out.println("carta no válida");
        }
    }
}
}