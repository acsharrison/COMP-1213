import java.text.DecimalFormat;
/** 
 * Program that runs DirectMC. 
 * Derives DirectMC from MarketingCampaign..
 * Project_09
 * @author Sophie Harrison
 * @version April 4 20eb Ads 3 (class SocialMediaMC) 21
 */
 
public class DirectMC extends MarketingCampaign {

   private double costPerMailPiece;
   private int numberOfMailPieces;
   
   /**
    * Sets up static final.
    */
   public static final double BASE_COST = 1000;
   
   /**
    * Sets up DirectMC.
    * @param nameIn in DirectMC.
    * @param revenueIn in DirectMC.
    * @param costPerMailPieceIn in DirectMC.
    * @param numberOfMailPiecesIn in DirectMC.
    */
   public DirectMC(String nameIn, double revenueIn,
       double costPerMailPieceIn, int numberOfMailPiecesIn) {
      super(nameIn, revenueIn);
      costPerMailPiece = costPerMailPieceIn;
      numberOfMailPieces = numberOfMailPiecesIn;
   }
   
   /**
    * Sets up getCostPerMailPiece.
    * @return costPerMailPiece in getCostPerMailPiece.
    */
   public double getCostPerMailPiece() {
      return costPerMailPiece;
   }
   
   /**
    * Sets up setCostPerMailPiece.
    * @param costPerMailPieceIn setCostPerMailPiece.
    */
   public void setCostPerMailPiece(double costPerMailPieceIn) {
      costPerMailPiece = costPerMailPieceIn;
   }
   
   /**
    * Sets up getNumberOfMailPieces.
    * @return numberOfMailPieces.
    */
   public int getNumberOfMailPieces() {
      return numberOfMailPieces;
   }
   
   /**
    * Sets up setNumberOfMailPieces.
    * @param numberOfMailPiecesIn setNumberOfMailPieces.
    */
   public void setNumberOfMailPieces(int numberOfMailPiecesIn) {
      numberOfMailPieces = numberOfMailPiecesIn;
   }
   
   /**
    * Sets up campaignCost.
    * @return BASE_COST.
    */
   public double campaignCost() {
      return BASE_COST + (costPerMailPiece * numberOfMailPieces);
   } 
    
    /**
    * Sets up toString.
    * @return toString.
    */  
   public String toString() {
      DecimalFormat fmt3 = new DecimalFormat("$#,##0.00");
      return super.toString()
         + "\n   Base Cost: " + fmt3.format(BASE_COST)
         + "\n   Mail Cost: " + fmt3.format(costPerMailPiece 
                              * numberOfMailPieces)
         + " = " + fmt3.format(costPerMailPiece) + " per mail piece * "
         + getNumberOfMailPieces() + " mail pieces";
   }
}