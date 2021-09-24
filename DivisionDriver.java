import javax.swing.JOptionPane;
/** 
 * Program that runs DivisonDriver. 
 * Activity that solves Division.
 * Activity_11
 * @author Sophie Harrison
 * @version April 13 2021
 */
public class DivisionDriver {
   /**
    * Sets up static main.
    * @param args in DivisionDriver
    */
   public static void main(String[] args) {
      String numInput
         = JOptionPane.showInputDialog("Enter the numerator:");
      String denomInput
         = JOptionPane.showInputDialog("Enter the denominator:");
      try {
         int num = Integer.parseInt(numInput);
         int denom = Integer.parseInt(denomInput);
         String result = "Integer division: \n"
            + Division.intDivide(num, denom)
            + "\n\nFloating point division: \n"
            + Division.decimalDivide(num, denom);
         JOptionPane.showMessageDialog(null, result,
            "Result", JOptionPane.PLAIN_MESSAGE);
      }
      catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(null,
               "Invaild input: enter numerical integer values only.",
               "Error", JOptionPane.ERROR_MESSAGE);
      }
      catch (ArithmeticException e) {
         JOptionPane.showMessageDialog(null,
                  e, "Error", JOptionPane.ERROR_MESSAGE);
      }
   }
}