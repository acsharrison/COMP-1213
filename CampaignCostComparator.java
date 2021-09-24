import java.util.Comparator;
   /** 
 * Program that runs CampaignCostComparator. 
 * Describes marketing campaign data.
 * Project_10
 * @author Sophie Harrison
 * @version April 9 2021
 */
 
public class CampaignCostComparator implements Comparator<MarketingCampaign> {

   /**
    * Sets up compare.
    * @param c1 in compare.
    * @param c2 in compare.
    * @return boolean output.
    */
   public int compare(MarketingCampaign c1, MarketingCampaign c2) {
      if (c1.campaignCost() < c2.campaignCost()) {
         return -1;
      }
      else if (c1.campaignCost() > c2.campaignCost()) {
         return 1;
      }
      else {
         return 0;
      }
   }
}
