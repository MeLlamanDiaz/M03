/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package daw.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author addi4500
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        double nota;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que nota tiene? (0-10)");
        nota = sc.nextDouble();
        if (nota>=0 && nota<=10){
            if (nota>=0 && nota<3){
                System.out.println("muy deficiente");
            }
            else if (nota>=3 && nota<5){
                System.out.println("insuficiete");
            }
            else if (nota>= 5 && nota < 6) {
                System.out.println("bien");
            }
            else if (nota>= 6 && nota <9) {
                System.out.println("notable");
            }
            else if (nota>=9 && nota<=10) {
                System.out.println("excelente");
            }
        }
        else {
        System.out.println("nota no valida");
        }
    }
}