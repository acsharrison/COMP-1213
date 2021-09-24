import java.util.ArrayList;
import java.util.Scanner;

/** 
 * Program that sets up TemperatureInfo. 
 * Solves an expression.
 * Activity_06
 * @author Sophie Harrison
 * @version February 23 2021
 */
public class TemperatureInfo {
/**
   * Prints TemperatureInfo.
   *
   * @param args Command line arguments (not used).
   */
   
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      ArrayList<Integer> tempsList = new ArrayList<Integer>();
      String tempInput = "";
      do {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals("")) {
            tempsList.add(Integer.parseInt(tempInput));
         }
      } while (!tempInput.equals(""));
      Temperatures temps = new Temperatures(tempsList);
         
   
      char choice = 'E';
      do {
         System.out.print("Enter choice - [L]ow temp, [H]igh temp, "
            + "[P]rint, [E]nd: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
            
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
            
            case 'P':
               System.out.println(temps);
               break;
            
            case 'E':
               System.out.println("\tDone");
               break;
            
            default:
               System.out.println("\tInvaild choice!");
         
         }
      } while (choice != 'E');
   }  

} 
