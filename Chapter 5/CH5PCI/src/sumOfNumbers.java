
/**
 * Isaac Valasek
 * Sum of Numbers
 * Programming III
 * Date
 */
import java.util.Scanner;
public class sumOfNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int addNum = 0;
        int selectedNum = 0;
        int whileSum = 0, doSum = 0;
        
        System.out.print("Enter a number: ");
        selectedNum = keyboard.nextInt();
        
        while(addNum < selectedNum) {
            addNum++;
            whileSum += addNum;
        }
        
        addNum = 1;
        do {
            doSum += addNum;
            addNum++;
        }while (addNum <= selectedNum);
        
        System.out.println("Answer with while loop: " + whileSum);
        System.out.println("Answer with do loop: " + doSum);
    }

}
