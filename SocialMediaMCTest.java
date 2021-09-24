import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/** 
 * Program that runs SocialMediaMCTest. 
 * Derives SocialMediaMCTest
 * Project_09
 * @author Sophie Harrison
 * @version April 4 2021
 */


public class SocialMediaMCTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void getBaseCostTest() {
      SocialMediaMC mc4 = new SocialMediaMC("Web Ads 3",
                                         3000.0, 1.00, 0000);
      Assert.assertEquals(mc4.getBaseCost(), 3000.0, 0);
   }
}
