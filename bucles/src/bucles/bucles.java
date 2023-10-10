/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;
import java.util.Scanner;
/**
 *
 * @author addi4500
 */
public class  bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean negatiu = false;
        int num, cont = 0;
        Scanner sc = new Scanner(System.in);
        for (cont=1; cont<=5; cont++){
            System.out.println("Pon un numero");
            num = sc.nextInt();
            if (num < 0){
            negatiu = true;
            System.out.println("Negativo");
            }
        }
        if (negatiu == true){
        System.out.println("Hay un negativo");
        }
        else {
        System.out.println("No has puesto negativos");
        }
    }  
}
