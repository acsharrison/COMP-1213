/** 
 * Program that runs InvalidCategoryException. 
 * Activity that solves Division.
 * Project_11
 * @author Sophie Harrison
 * @version April 16 2021
 */
public class InvalidCategoryException extends Exception {
  /**
   * Sets up InvalidCategoryException.
   * @param parameter in InvalidCategoryException
   */
   public InvalidCategoryException(String parameter) {
      super("For category: " + parameter);
   }
}