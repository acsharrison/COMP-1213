import java.io.FileNotFoundException;
/** 
 * Program that runs MarketingCampaignPart3. 
 * Derives MarketingCampaignPart3 from MarketingCampaign.
 * Project_11
 * @author Sophie Harrison
 * @version April 19 2021
 */
public class MarketingCampaignPart3 {

      /**
    * Sets uo main.
    * @param args in main.
    * @throws FileNotFoundException in main.
    */
   public static void main(String[] args) {
      try {
         if (args.length == 0)
         {
            System.out.println("File name expected as command line argument.\n"
               + "Program ending.");
         }
         else {
            MarketingCampaignList dog = new MarketingCampaignList();
            dog.readFile(args[0]);
            System.out.println(dog.generateReport());
            System.out.println(dog.generateReportByName());
            System.out.println(dog.generateReportByCampaignCost());
            System.out.println(dog.generateReportByROI());
            System.out.println(dog.generateInvalidRecordsReport());
         }
      }
      catch (FileNotFoundException w) {
         System.out.println("*** Attempted to read file: " + w.getMessage());
      }
   }
}