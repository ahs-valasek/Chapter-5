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
public class SquareDisplay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int repeat;
        do {
        System.out.println("Enter a positive integer no greater than 15.");
        repeat = keyboard.nextInt();
        } while(repeat > 15);
        
        for(int y = 1; y <= repeat; y++) {
            for (int x = 1; x <= repeat; x++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
    }
    
}
