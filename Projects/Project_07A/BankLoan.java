/**
 * Program to make bank loans.
 *
 * @author Austin Hall
 * @version 3/20/17
 */
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   private static int loansCreated = 0;
   /**
    * Constructor for the BankLoan class.
    * @param customerNameIn used for customer name.
    * @param interestRateIn used for interest rate.
    */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
   /**
    * This method borrows money from the bank.
    * @param amount used for amount borrowed.
    * @return wasLoanMade.
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
    * This method pays the bank.
    * @param amountPaid used for payed amount.
    * @return newBalance.
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
    * This method returns the balance.
    * @return balance.
    */
   public double getBalance() {
      return balance;
   }
   /**
    * This method sets interest rate.
    * @param interestRateIn used as interest rate.
    * @return true or false.
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
    * this method returns interest rate.
    * @return interestRate.
    */
   public double getInterestRate() {
      return interestRate;
   }
   /**
    * This method charges interest.
    */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   /**
    * This method creates a string of output.
    * @return output.
    */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }
   /**
    * this method verifies if the amount is valid.
    * @param amount used for the amount of money.
    * @return amount >= 0.
    */
   public static boolean isAmountValid(double amount) {
      return amount >= 0;
   }
   /**
    * This method verifies if the account is in debt.
    * @param loan used for the BankLoan object used.
    * @return true if in debt and false if not in debt.
    */
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }
   /** 
    * This method returns how many loans have been created.
    * @return loansCreated.
    */
   public static int getLoansCreated() {
      return loansCreated;
   }
   /**
    * This method resets the number of loans created.
    */
   public static void resetLoansCreated() {
      loansCreated = 0;
   }

}
