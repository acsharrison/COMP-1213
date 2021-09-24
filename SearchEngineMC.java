/** 
 * Program that runs SearchEngineMC. 
 * Derives SearchEngineMC from IndirectMC..
 * Project_09
 * @author Sophie Harrison
 * @version April 4 2021
 */
public class SearchEngineMC extends IndirectMC {

   /**
    * Sets up static final.
    */
   public static final double BASE_COST = 2000.0;

   /**
   * Sets up SearchEngineMc.
   * @param nameIn in SearchEngineMC.
   * @param revenueIn in SearchEngineMC.
   * @param costPerAdIn in SearchEngineMC.
   * @param numberOfAdsIn in SearchEngineMC.
   */
   public SearchEngineMC(String nameIn, double revenueIn,
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