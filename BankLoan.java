 /** 
 * Program that runs BankLoan. 
 * Solves an the BankLoan.
 * Activity_07
 * @author Sophie Harrison
 * @version March 8 2021
 */
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   private static int loansCreated = 0;
   /**
    * Prints information about the loan.
    * @param customerNameIn in loan.
    * @param interestRateIn in loan.
    */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
   /**
    * Prints information about the loan.
    * @param amount in loan.
    * @return borrowFromBank in program.
    */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
   /**
    * Prints information about the loan.
    * @param amountPaid in loan.
    * @return borrowFromBank in program.
    */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   /**
    * Prints information about the loan.
    * @return getBalance in program.
    */
   public double getBalance() {
      return balance;
   }
   
   /**
    * Prints information about the loan.
    * @param interestRateIn in loan.
    * @return boolean in program.
    */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
    * Prints information about the loan.
    * @return interestRate in program.
    */
   public double getInterestRate() {
      return interestRate;
   }
   /**
    * Prints information about the loan.
    */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   /**
    * Prints toString in the program.
    * @return output in program.
    */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }
   /**
    * Prints isAmountValid in the program.
    * @param amount sets up amount.
    * @return amount in program.
    */
   public static boolean isAmountValid(double amount) {
      return amount >= 0;
   }
   /**
    * Prints isInDebt in the program.
    * @param loan sets up program.
    * @return boolean in program.
    */
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }
   /**
    * Prints getLoansCreated in the program.
    * @return loansCreated in program.
    */
   public static int getLoansCreated() {
      return loansCreated;
   }
   /**
    * Prints resetLoansCreated in the program.
    */
   public static void resetLoansCreated() {
      loansCreated = 0;
   }
}
