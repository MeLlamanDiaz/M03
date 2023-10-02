/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author addi4500
 */
public class JavaApplication2 {

   public static void main(String[] args) {
        // TODO code application logic here 
            
Scanner sc = new Scanner(System.in);
    
System.out.println("Dame una letra de la 'A' a la 'D'");
char mes = sc.next().charAt(0);    
    
switch (mes){ 
            case 'a','A' -> System.out.println("Enero");
            case 'b','B' -> System.out.println("Febrero");
            case 'c','C' -> System.out.println("Marzo");
            case 'd','D' -> System.out.println("Abril");
        default -> System.out.println("Valor no válida");
        }
}   
}
//siuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu