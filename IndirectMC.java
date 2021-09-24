import java.text.DecimalFormat;
/** 
 * Program that runs DirectMC. 
 * Derives DirectMC from MarketingCampaign..
 * Project_09
 * @author Sophie Harrison
 * @version April 4 2021
 */
public class IndirectMC extends MarketingCampaign {
   protected double adCost;
   protected int adCount;
   
   /**
    * Sets up static final double.
    */
   public static final double BASE_COST = 1500.0;

   /**
    * Sets up IndirectMC within program.
    * @param nameIn in IndirectMc.
    * @param revenueIn in IndirectMc.
    * @param adCostIn in IndirectMc.
    * @param adCountIn in IndirectMc.
    */
   public IndirectMC(String nameIn, double revenueIn,
                     double adCostIn, int adCountIn) {
      super(nameIn, revenueIn);
      adCost = adCostIn;
      adCount = adCountIn;
   }
   
   /**
    * sets up double getCostPerAd.
    * @return adCost in getCostPerAd
    */
   public double getCostPerAd() {
      return adCost;
   }
   
    /**
    * sets up void setCostPerAd.
    * @param adCostIn in setCostPerAd
    */
   public void setCostPerAd(double adCostIn) {
      adCost = adCostIn;
   }
   
   /**
    * sets up int getNumberOfAds.
    * @return adCount in getNumberOfAds
    */
   public int getNumberOfAds() {
      return adCount;
   }
   
   /**
    * sets up int setNumberOfAds.
    * @param adCountIn in setNumberOfAds
    */
   public void setNumberOfAds(int adCountIn) {
      adCount = adCountIn;
   }
   
   /**
    * sets up double getBaseCost.
    * @return BASE_COST in getBaseCost
    */
   public double getBaseCost() {
      return BASE_COST;
   }
   
   /**
    * sets up double campaignCost.
    * @return getBaseCost in campaignCost
    */
   public double campaignCost() {
      return getBaseCost() + (adCost * adCount);
   }
   
   /**
    * sets up String toString.
    * @return toString in toString
    */
   public String toString() {
      DecimalFormat dmf = new DecimalFormat("$#,##0.00");
      return super.toString()
         + "\n   Base Cost: " + dmf.format(getBaseCost())
         + "\n   Ad Cost: " + dmf.format(adCost * adCount)
         + " = " + dmf.format(adCost) + " per ad * "
         + getNumberOfAds() + " ads";
   }
}