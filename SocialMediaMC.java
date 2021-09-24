/** 
 * Program that runs SocialMediaMC. 
 * Derives SocialMediaMC from IndirectMC..
 * Project_09
 * @author Sophie Harrison
 * @version April 4 2021
 */
public class SocialMediaMC extends IndirectMC {

   /**
    * Sets up static final.
    */
   public static final double BASE_COST = 3000.0;

   /**
   * Sets up SocialMediaMC.
   * @param nameIn in SocialMediaMC.
   * @param revenueIn in SocialMediaMC.
   * @param costPerAdIn in SocialMediaMC.
   * @param numberOfAdsIn in SocialMediaMC.
   */
   public SocialMediaMC(String nameIn, double revenueIn,
            double costPerAdIn, int numberOfAdsIn) {
      super(nameIn, revenueIn, costPerAdIn, numberOfAdsIn);
   }
   
   /**
    * Sets up getBaseCost.
    * @return BASE_COST in getBaseCost.
    */
   public double getBaseCost() {
      return BASE_COST;
   }
}