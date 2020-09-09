/*
 * Created by Krystsina Trostle
 *
 * Created on May 24, 2020
 *
 * The objective of the program is to define the CreditCardCompany
 * superclass with the private data members, constants, constructors,    
 * as well as all of the methods needed for the class              
 * 
 */
package Java2;

public class CreditCardCompany {
    //Data fields
    private int routingNumber;
    private int branchNumber;
    private String companyName;
    private String branchAddress;
    private String city;
    private String state;
    private String zip;
    private String emailAddress;
    private String phone;

    // Default constructor
    public CreditCardCompany() {
        routingNumber = 11111;
        branchNumber = 11111;
        companyName = "Credit Card Company";
        branchAddress = "USA";
        city = "Pittsburgh";
        state = "Pennsylvania";
        zip ="15209";
        emailAddress = "info@creditcompany.com";
        phone = "412-799-card";
    }

    // Overloaded constructors (all variables) - defines what type of object it creates
    public CreditCardCompany (int routingNumber, int branchNumber, 
                            String companyName, String branchAddress, 
                            String city, String state, String zip, 
                            String emailAddress, String phone)
    {
        this.routingNumber = routingNumber;
        this.branchNumber = branchNumber;
        this.companyName = companyName;
        this.branchAddress = branchAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.emailAddress = emailAddress;
        this.phone = phone;
    }   
    
    //Constructor
    public CreditCardCompany (int routingNumber, int branchNumber){
        this();
        this.routingNumber = routingNumber;
        this.branchNumber = branchNumber;
    }   

    //Copy constructor
    public CreditCardCompany (CreditCardCompany creditCardCompanyObject){
        this.routingNumber = creditCardCompanyObject.routingNumber;
        this.branchNumber = creditCardCompanyObject.branchNumber;
        this.companyName = creditCardCompanyObject.companyName;
        this.branchAddress = creditCardCompanyObject.branchAddress;
        this.city = creditCardCompanyObject.city;
        this.state = creditCardCompanyObject.state;
        this.zip = creditCardCompanyObject.zip;
        this.emailAddress = creditCardCompanyObject.emailAddress;
        this.phone = creditCardCompanyObject.phone;
    }

    //Mutators and Accessors
    public int getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(int routingNumber) {
        this.routingNumber = routingNumber;
    }

    public int getBranchNumber() {
        return branchNumber;
    }

    public void setBranchNumber(int branchNumber) {
        this.branchNumber = branchNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
  
    // Method to show the credit card object
    @Override
    public String toString() 
    {
        //Resizable buffer
        StringBuilder str = new StringBuilder();
    
        str.append("Banking account routing number: ");
        str.append(getRoutingNumber());
        str.append("\n");
    
        str.append("Banking branch number: ");
        str.append(getBranchNumber());
        str.append("\n");
        
        str.append("Banking company name: ");
        str.append(getCompanyName());
        str.append("\n");
      
        str.append("-------------------------------------------\n");
        
        return str.toString();
    }     
}
