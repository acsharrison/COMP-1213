import java.io.FileNotFoundException;
/** 
 * Program that runs MarketingCampaignPart2. 
 * Describes marketing campaign data.
 * Project_10
 * @author Sophie Harrison
 * @version April 9 2021
 */
 
public class MarketingCampaignPart2 {
   
   /**
    * Sets uo main.
    * @param args in main.
    * @throws FileNotFoundException in main.
    */
   public static void main(String[] args) throws FileNotFoundException {
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
      }
   }
}