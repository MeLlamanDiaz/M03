/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles_2;
import java.util.Scanner;
/**
 *
 * @author addi4500
 */
public class bucles_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 0, suma = 0;
        Scanner sc = new Scanner(System.in);
        while (num != -1){
        System.out.println("Inserte un valor");
        num = sc.nextInt();
        suma = num + suma;
        }
        System.out.println("La suma da " + suma);
    }
    
}
