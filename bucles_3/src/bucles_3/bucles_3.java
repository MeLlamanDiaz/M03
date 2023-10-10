/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles_3;
/**
 *
 * @author addi4500
 */
public class bucles_3 {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        int suma = 0, prod = 1, cont = 1;
        for (cont = 1; cont<=10; cont++){
        suma = cont + suma;
        prod = prod * cont;
        System.out.println("La suma da " + suma);
        System.out.println("El producto da " + prod);
        Thread.sleep(1000);
        }
    }
    
}
