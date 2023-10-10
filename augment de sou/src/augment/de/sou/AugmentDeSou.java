/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package augment.de.sou;
import java.util.Scanner;
/**
 *
 * @author addi4500
 */
public class AugmentDeSou {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double sou_act, augment, sou_fin = 0, sou_fut = 0, augment2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quin sou tens actualment");
        sou_act = sc.nextDouble();
        if (sou_act < 18000){
            augment = sou_act * 12/100;
            sou_fin = sou_act + augment;
        }
        else if (sou_act >= 18000 && sou_act < 30000){
            augment = sou_act * 10/100;
            sou_fin = sou_act + augment;
        }
        else if (sou_act >= 30000 && sou_act < 45000){
            augment = sou_act * 8/100;
            sou_fin = sou_act + augment;
        }
        else if (sou_act > 45000){
            augment = sou_act * 6/100;
            sou_fin = sou_act + augment;
        }
        System.out.println("Tu sou augmentat es de " + sou_fin);
        
        if (sou_fin < 18000){
            augment2 = sou_fin * 12/100;
            sou_fut = sou_fin + augment2;
        }
        else if (sou_fin >= 18000 && sou_fin < 30000){
            augment2 = sou_fin * 10/100;
            sou_fut = sou_fin + augment2;
        }
        else if (sou_fin >= 30000 && sou_fin < 45000){
            augment2 = sou_fin * 8/100;
            sou_fut = sou_fin + augment2;
        }
        else if (sou_fin > 45000){
            augment2 = sou_fin * 6/100;
            sou_fut = sou_fin + augment2;
        }
        System.out.println("Tu sou augmentat l'any que ve serà de " + sou_fut);
    }
    
}
