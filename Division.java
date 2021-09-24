/** 
 * Program that runs Divison. 
 * Activity that solves Division.
 * Activity_11
 * @author Sophie Harrison
 * @version April 13 2021
 */
public class Division {
   /**
    * Sets up static int.
    * @param num in Division
    * @param denom in Division
    * @return boolean value
    */
   public static int intDivide(int num, int denom) {
      try {
         return num / denom;
      }
      catch (ArithmeticException e) {
         return 0;
      }
   }
   
   /**
    * Sets up static float.
    * @param num in Division
    * @param denom in Division
    * @return float value
    * @throws IllegalArgumentException in decimalDivide.
    */
   public static float decimalDivide(int num, int denom) {
      if (denom == 0) {
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero.");
      }
      return (float) num / denom;
   }
}