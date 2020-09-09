/*
 * Created by Krystsina Trostle
 *
 * Created on May 24, 2020
 *
 * The objective of the program is to define the CreditCardHolder 
 * subclass that inherits from the Credit Card Company superclass 
 * with the private data members, constants, constructors, as well as    
 * all of the methods needed for the class              
 * 
 */
package Java2;

public class CreditCardHolder extends CreditCardCompany
    {
    //Data fields
    private int accountHolderNumber;
    private String accountHolderName;
    private String accountHolderAddress;
    private String accountHolderCity;
    private String accountHolderState;
    private String accountHolderZip;
    private String accountHolderEmailAddress;
    private String accountHolderPhone;
    
    //Default constructor
    public CreditCardHolder()
    {
       super();
       accountHolderNumber = 12345;
       accountHolderName = "No name yet";
       accountHolderAddress = "No address yet";
       accountHolderCity = "Montgomery";
       accountHolderState = "Alabama";
       accountHolderZip = "36043";
       accountHolderEmailAddress = "myaccount.com";
       accountHolderPhone = "334-acc-ount"; 
    }
    
    //Overloaded constructor
    public CreditCardHolder(int routingNumber, int branchNumber, 
                            int accountHolderNumber, String accountHolderName, 
                            String accountHolderAddress, 
                            String accountHolderCity, String accountHolderState,
                            String accountHolderZip, 
                            String accountHolderEmailAddress, 
                            String accountHolderPhone)
    {        
        super(routingNumber, branchNumber);
        this.accountHolderNumber = accountHolderNumber;
        this.accountHolderName = accountHolderName;
        this.accountHolderAddress = accountHolderAddress;
        this.accountHolderCity = accountHolderCity;
        this.accountHolderState = accountHolderState;
        this.accountHolderZip = accountHolderZip;
        this.accountHolderEmailAddress = accountHolderEmailAddress;
        this.accountHolderPhone = accountHolderPhone; 
    }
    
    //Overloaded constructor
    public CreditCardHolder(int routingNumber, int branchNumber, 
                            String companyName, String branchAddress, 
                            String city, String state, String zip, 
                            String emailAddress, String phone, 
                            int accountHolderNumber, String accountHolderName, 
                            String accountHolderAddress, 
                            String accountHolderCity, String accountHolderState, 
                            String accountHolderZip, 
                            String accountHolderEmailAddress, 
                            String accountHolderPhone)
    {        
       super(routingNumber, branchNumber, companyName,branchAddress, city, 
               state, zip, emailAddress, phone);
       this.accountHolderNumber = accountHolderNumber;
       this.accountHolderName = accountHolderName;
       this.accountHolderAddress = accountHolderAddress;
       this.accountHolderCity = accountHolderCity;
       this.accountHolderState = accountHolderState;
       this.accountHolderZip = accountHolderZip;
       this.accountHolderEmailAddress = accountHolderEmailAddress;
       this.accountHolderPhone = accountHolderPhone; 
    }
    
    //Constructor
    public CreditCardHolder(CreditCardCompany creditCardCompanyObject, 
                                    CreditCardHolder creditCardHolderObject){
        super(creditCardCompanyObject);
        this.accountHolderNumber = creditCardHolderObject.accountHolderNumber;
        this.accountHolderName = creditCardHolderObject.accountHolderName;
        this.accountHolderAddress = creditCardHolderObject.accountHolderAddress;
        this.accountHolderCity = creditCardHolderObject.accountHolderCity;
        this.accountHolderState = creditCardHolderObject.accountHolderState;
        this.accountHolderZip = creditCardHolderObject.accountHolderZip;
        this.accountHolderEmailAddress = creditCardHolderObject.accountHolderEmailAddress;
        this.accountHolderPhone = creditCardHolderObject.accountHolderPhone; 
    }

    //Mutators and Accessors
    public int getAccountHolderNumber() {
        return accountHolderNumber;
    }

    public void setAccountHolderNumber(int accountHolderNumber) {
        this.accountHolderNumber = accountHolderNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountHolderAddress() {
        return accountHolderAddress;
    }

    public void setAccountHolderAddress(String accountHolderAddress) {
        this.accountHolderAddress = accountHolderAddress;
    }

    public String getAccountHolderCity() {
        return accountHolderCity;
    }

    public void setAccountHolderCity(String accountHolderCity) {
        this.accountHolderCity = accountHolderCity;
    }

    public String getAccountHolderState() {
        return accountHolderState;
    }

    public void setAccountHolderState(String accountHolderState) {
        this.accountHolderState = accountHolderState;
    }

    public String getAccountHolderZip() {
        return accountHolderZip;
    }

    public void setAccountHolderZip(String accountHolderZip) {
        this.accountHolderZip = accountHolderZip;
    }

    public String getAccountHolderEmailAddress() {
        return accountHolderEmailAddress;
    }

    public void setAccountHolderEmailAddress(String accountHolderEmailAddress) {
        this.accountHolderEmailAddress = accountHolderEmailAddress;
    }

    public String getAccountHolderPhone() {
        return accountHolderPhone;
    }

    public void setAccountHolderPhone(String accountHolderPhone) {
        this.accountHolderPhone = accountHolderPhone;
    }

    //Method to show the credit card object
    @Override
    public String toString() 
    {
        StringBuilder str = new StringBuilder();
    
        str.append(super.toString());
        
        str.append("Account holder's account number: ");
        str.append(getAccountHolderNumber());
        str.append("\n");
        
        str.append("Account holder account name: ");
        str.append(getAccountHolderName());
        str.append("\n");
        
        str.append("Account holder address: ");
        str.append(getAccountHolderAddress());
        str.append("\n");
        
        str.append("Account holder city: ");
        str.append(getAccountHolderCity());
        str.append("\n");
        
        str.append("Account holder state: ");
        str.append(getAccountHolderState());
        str.append("\n");
        
        str.append("Account holder zip code: ");
        str.append(getAccountHolderZip());
        str.append("\n");
        
        str.append("-------------------------------------------\n");
        
        return str.toString();
    } 
}  
    
