/*
 * Created by Krystsina Trostle
 *
 * Created on May 24, 2020
 *
 * The objective of the program is to define the abstract subclass
 * CreditCardHolderFinancialData that inherets from the CreditCardHolder class
 * definition with the private data members, constants, constructors,    
 * as well as all of the methods needed for the class              
 * 
 */
package Java2;

public abstract class CreditCardHolderFinancialData extends CreditCardHolder{ 
    //Data fields
    private String creditCardType;
    private double creditLimit;
    private double previousBalance;
    private double newPurchases;
    private double payments;
    private double creditsReturns;

    //Default constructor
    public CreditCardHolderFinancialData() {
        String creditCardType;
        double creditLimit = 0;
        double previousBalance = 0;
        double newPurchases = 0;
        double payments = 0;
        double creditsReturns = 0;
    }
    
    //Constructor
    public CreditCardHolderFinancialData(int routingNumber, int branchNumber,
                                        String companyName, String branchAddress,
                                        String city, String state, String zip, 
                                        String emailAddress, String phone, 
                                        int accountHolderNumber, 
                                        String accountHolderName, 
                                        String accountHolderAddress, 
                                        String accountHolderCity, 
                                        String accountHolderState, 
                                        String accountHolderZip, 
                                        String accountHolderEmailAddress, 
                                        String accountHolderPhone, 
                                        String creditCardType, double creditLimit,
                                        double previousBalance, double newPurchases,
                                        double payments, double creditsReturns)
    {
        super(routingNumber, branchNumber, companyName,
              branchAddress,city, state, zip, 
              emailAddress, phone, accountHolderNumber,
              accountHolderName, accountHolderAddress,
              accountHolderCity, accountHolderState,
              accountHolderZip, accountHolderEmailAddress,
              accountHolderPhone);
        this.creditCardType = creditCardType;
        this.creditLimit = creditLimit;
        this.previousBalance = previousBalance;
        this.newPurchases = newPurchases;
        this.payments = payments;
        this.creditsReturns = creditsReturns;
    }
    
    //Constructor
    public CreditCardHolderFinancialData(CreditCardCompany creditCardCompanyObject, 
                                         CreditCardHolder creditCardHolderObject,
                                         int accountHolderNumber, 
                                         String creditCardType, 
                                         double creditLimit, 
                                         double previousBalance, 
                                         double newPurchases, double payments, 
                                         double creditsReturns)
    {        
        super(creditCardCompanyObject, creditCardHolderObject);
        this.creditCardType = creditCardType;
        this.creditLimit = creditLimit;
        this.previousBalance = previousBalance;
        this.newPurchases = newPurchases;
        this.payments = payments;
        this.creditsReturns = creditsReturns;
 
    }

    public String getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(String creditCardType) {
        this.creditCardType = creditCardType;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getPreviousBalance() {
        return previousBalance;
    }
    
    public void setPreviousBalance(double previousBalance) {
        this.previousBalance = previousBalance;
    }

    public double getNewPurchases() {
        return newPurchases;
    }
    
    public void setNewPurchases(double newPurchases) {
        this.newPurchases = newPurchases;
    }

    public double getPayments() {
        return payments;
    }
    
    public void setPayments(double payments) {
        this.payments = payments;
    }

    public double getCreditsReturns() {
        return creditsReturns;
    }

    public void setCreditsReturns(double creditsReturns) {
        this.creditsReturns = creditsReturns;
    }
    
    //Abstract classes to calculate credit card charges
    public abstract double getFinanceCharge();
    public abstract double getNewBalance();
    public abstract double getNewPayment();
    public abstract boolean getCreditLimitCheck(double newBalance);
    
    //Method to show the credit card object
    @Override
    public String toString() 
    {
        StringBuilder str = new StringBuilder();
    
        str.append(super.toString());
    
        str.append("Type of credit card: ");
        str.append(getCreditCardType());
        str.append("\n");
        
        str.append("Account holder's credit limit: ");
        str.append(getCreditLimit());
        str.append("\n");
        
        str.append("Account holder's previous balance: ");
        str.append(getPreviousBalance());
        str.append("\n");
          
        str.append("Account holder's new purchases: ");
        str.append(getNewPurchases());
        str.append("\n");
    
        str.append("Account holder's payments: ");
        str.append(getPayments());
        str.append("\n");
        
        str.append("Account holder's credits/return: ");
        str.append(getCreditsReturns());
        str.append("\n");
        
        str.append("----------------------------------------\n");
        
        return str.toString();
    }
}    
