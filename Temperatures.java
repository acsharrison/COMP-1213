import java.util.ArrayList;
/** 
 * Program that sets the temperature. 
 * Solves an expression.
 * Activity_06
 * @author Sophie Harrison
 * @version February 23 2021
 */
public class Temperatures {
 /**
   * Prints Temperatures.
   *
   * @param args Command line arguments (not used).
   */
  
   private ArrayList<Integer> temperatures;
 /**
   * prints Temperatures.
   * @param temperaturesIn makes Temperatures
   */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }
 /**
   * prints getLowtemp.
   * @return getLowtemp inside of getLowtemp.
   */
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   }

   
 /**
   * prints getHightemp.
   * @return getHightemp inside of getHightemp.
   */
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) > high) {
            high = temperatures.get(i);
         }
      }
      return high;
   }
   
 /**
   * prints lowerMinimum.
   * @param lowIn inside of lowerMinimum.
   * @return lowIn inside of lowerMinimum.
   */
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
 /**
   * prints higherMaximum.
   * @return higherMaximum inside of higherMaximum.
   * @param highIn returns higherMaximum.
   */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
 /**
   * prints toString.
   * @return output during toString
   */  
   public String toString() {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }
}