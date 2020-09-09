/*
 * Created by Krystsina Trostle
 *
 * Created on May 24, 2020
 *
 * The objective of the program is to define the BusinessCreditCard 
 * Financial Data subclass that defines the abstract methods and uses
 * the private data members, constants, constructors, as well as   
 * all of the methods needed for the class              
 * 
 */
package Java2;

public class BusinessCreditCard extends CreditCardHolderFinancialData{
    final double BUSINESS_ANNUAL_RATE = 0.16;
    final double BUSINESS_PAYMENT_RATE = 0.03;

    //Default constructor for easy of debugging and testing
    public BusinessCreditCard(){
        super();
    }
    
    //Constructor
    public BusinessCreditCard(CreditCardCompany creditCardCompanyObject, 
                              CreditCardHolder creditCardHolderObject, 
                              int accountHolderNumber, String creditCardType, 
                              double creditLimit, double previousBalance, 
                              double newPurchases, double payments, 
                              double creditsReturns)
    {
        super(creditCardCompanyObject, creditCardHolderObject,
                    accountHolderNumber, creditCardType, creditLimit, 
                    previousBalance, newPurchases, payments, creditsReturns);
    }
    
    //Method to get interest charged of the current balance at 16%
    @Override
    public double getFinanceCharge() {
        double currentBalance = getCurrentBalance();
        double financeCharge;
        
        if(currentBalance <= 0){
            financeCharge = 0;
        }
        else{
            financeCharge = currentBalance * (BUSINESS_ANNUAL_RATE);
        }
        return financeCharge;
    }

    //Method to get new balance if customer is over credit limit
    @Override
    public double getNewBalance() {
        double currentBalance = getCurrentBalance();
        double newBalance = currentBalance + getFinanceCharge();
        
        if (getCreditLimitCheck(newBalance)){
            newBalance = newBalance + 20.00;
        }
        return newBalance;
    }

    //Method to get new payment which is 3% of the new balance
    @Override
    public double getNewPayment() {
        double newPayment;
        
        if(getNewBalance() <= 0){
            newPayment = 0;
        }
        else{
            newPayment = getNewBalance() * BUSINESS_PAYMENT_RATE;
        }
        return newPayment;
    }

    //Method to check if balance is over credit limit
    @Override
    public boolean getCreditLimitCheck(double newBalance) {
        return newBalance > getCreditLimit();
    }
    
    //Method to get current balance
    public double getCurrentBalance() {
        double currentBalance = getPreviousBalance() + getNewPurchases() - 
                getPayments() - getCreditsReturns();
        return currentBalance;
    }
 
}
