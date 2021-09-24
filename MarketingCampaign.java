import java.text.DecimalFormat;
/** 
 * Program that runs MarketingCampaign. 
 * Describes marketing campaign data.
 * Project_09
 * @author Sophie Harrison
 * @version April 4 2021
 */
 
public abstract class MarketingCampaign
   implements Comparable<MarketingCampaign> {
//variables

   protected String name;
   protected double revenue;
   protected static int count = 0;
   /**
    * Sets up the constructor.
    * @param nameIn in MarketingCampaign.
    * @param revenueIn in MarketingCampaign.
    */
   public MarketingCampaign(String nameIn, double revenueIn) {
      name = nameIn;
      revenue = revenueIn;
      count++;
   }
   
   /**
    * Sets up getName.
    * @return name in getName.
    */
   public String getName() {
      return name;
   }
   
    /**
    * Sets up setName.
    * @param nameIn in setName.
    */
   public void setName(String nameIn) {
      name = nameIn;
   }
   
   /**
   * Sets up getRevenue.
   * @return revenue in getRevenue.
   */
   public double getRevenue() {
      return revenue;
   }
   
   /**
   * Sets up setRevenue.
   * @param revenueIn in setRevenue.
   */
   public void setRevenue(double revenueIn) {
      revenue = revenueIn;
   }
   
   /**
   * Sets up resetCount.
   */
   public static void resetCount() {
      count = 0;
   }
   
   /**
   * Sets up calcROI.
   * @return equation in calcROI.
   */
   public double calcROI() {
      return (revenue - campaignCost()) / campaignCost();
   }
   
   /**
   * Sets up getCount.
   * @return count in getCount.
   */
   public static int getCount() {
      return count;
   }
   
   /**
   * Sets up toString.
   * @return output in toString
   */
   public String toString() { 
      DecimalFormat dmf = new DecimalFormat("$#,##0.00");
      DecimalFormat dmf2 = new DecimalFormat("0.##%");
      String output = name + " (" + getClass() + ")";
      output += "\nRevenue: " + dmf.format(revenue)
         + "   Campaign Cost: " + dmf.format(campaignCost()) + "   ROI: "
         + dmf2.format(calcROI());
      return output;
   }
   
      /**
       * Sets up compareTo.
       * @param object in compareTo
       * @return getName in compareTo
       */
   public int compareTo(MarketingCampaign object) {
      return this.getName().compareToIgnoreCase(object.getName());
   }
   /**
   * Sets up campaignCost.
   * @return abstract in campaignCost.
   */
   public abstract double campaignCost();
}