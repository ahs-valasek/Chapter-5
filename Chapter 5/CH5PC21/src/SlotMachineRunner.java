/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 992005923
 */
import java.util.Scanner;
public class SlotMachineRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        SlotMachine s1 = new SlotMachine();
        SlotMachine s2 = new SlotMachine();
        SlotMachine s3 = new SlotMachine();
        String slot1, slot2, slot3;
        int money;
        String choice;
        
        do {
            System.out.println("How much money do you want to bet?");
            money = keyboard.nextInt();
            
            slot1 = s1.random();
            slot2 = s2.random();
            slot3 = s3.random();
        
            System.out.println(slot1);
            System.out.println(slot2);
            System.out.println(slot3);
        
                if (slot1.equals(slot2)) {
            
                    if (slot2.equals(slot3)) {
                       money *= 3;
                    } else {
                       money *= 2;
                    }
                } else if (slot2.equals(slot3)) {
                    money *= 2;
                } else if (slot3.equals(slot1)) {
                    money *= 2;
                } else {
                    money = 0;
                }
            System.out.println("You won $" + money + ".");
            System.out.println("Would you like to play again?: (Y)es or (N)o");
            choice = keyboard.next();
        } while (choice.equalsIgnoreCase("y")); 
    } 
}
