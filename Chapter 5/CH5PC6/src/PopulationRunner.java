
/**
 * Isaac Valasek
 *Population
 * Programming III
 * Date
 */
import java.util.Scanner;
public class PopulationRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int daysInput, popInput;
        double growthInput;
        
        System.out.print("Enter the population size: ");
        popInput = keyboard.nextInt();
        
        while(popInput < 2) {
            System.out.println("Invalid value. Please enter a value greater"+
                    " than 2.");
            System.out.print("Enter the population size: ");
            popInput = keyboard.nextInt();
            
        }
        
        System.out.print("Enter the growth as a percentage: ");
        growthInput = keyboard.nextDouble();
        
        while(growthInput < 0){
            System.out.println("Invalid value. Please enter a non-negative"+
                    " value.");
            System.out.print("Enter the growth as a percentage: ");
            growthInput = keyboard.nextInt();
        }
        
        System.out.print("Enter the number of days: ");
        daysInput = keyboard.nextInt();
        
        while(daysInput < 1){
            System.out.println("Invalid value. Please enter a value greater"
                    + " than or equal to 1.");
            System.out.print("Enter the growth as a percentage: ");
            growthInput = keyboard.nextInt();
        }
        Population p = new Population(0, 0, 0);
        System.out.println("The new population is " +
                p.calcPopulation(popInput, popInput, growthInput) + " organisms.");
        
    }

}
