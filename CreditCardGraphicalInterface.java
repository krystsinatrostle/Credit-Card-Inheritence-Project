/*
 * Created by Krystsina Trostle
 *
 * Created on May 24, 2020
 *
 * The objective of the program is to define the GUI main class
 * that accepts the data from the user's screen, outputs it and 
 * interfaces with the credit card classes          
 * 
 */
package Java2;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import static javafx.scene.paint.Color.RED;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class CreditCardGraphicalInterface extends Application{

    //Get default information in the fields for ease of testing, 
    //should be deleted before implementation 
    final static BusinessCreditCard DEFAULT_CARD = new BusinessCreditCard();
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //Use GridPane layout
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        gridPane.setHgap(5.5);
        gridPane.setVgap(5.5);

        //Use buildComponents method to add nodes to the grid
        buildComponents(gridPane);

        // Create a scene and place it in the stage
        Scene scene = new Scene(gridPane);
        stage.setTitle("Credit Card Information System"); 
        stage.setScene(scene); 
        stage.show();
    }

    private void buildComponents(GridPane gridPane) {
        // Define the labels, textfields, and a combo box for the Credit 
        // Card Company information
        Label labelCreditCardCompanyData = new Label("Credit Card Company Data");
        labelCreditCardCompanyData.setFont(Font.font("Tahoma", FontWeight.BOLD, 15));
        
        Label labelRoutingNumber = new Label("Enter the Company Routing Number ");
        TextField textRoutingNumber = new TextField();
        textRoutingNumber.setText("" + DEFAULT_CARD.getRoutingNumber());
        
        Label labelBranchNumber = new Label("Enter the Company Branch Number ");
        TextField textBranchNumber = new TextField();
        textBranchNumber.setText("" + DEFAULT_CARD.getBranchNumber());
    
        Label labelCompanyName = new Label("Enter the Company Name ");
        TextField textCompanyName = new TextField();
        textCompanyName.setText("" + DEFAULT_CARD.getCompanyName());
    
        Label labelBranchAddress = new Label("Enter the Company Branch Address ");
        TextField textBranchAddress = new TextField();
        textBranchAddress.setText("" + DEFAULT_CARD.getBranchAddress());
    
        Label labelCity = new Label("Enter the Company City ");
        TextField textCity = new TextField();
        textCity.setText("" + DEFAULT_CARD.getCity());
    
        Label labelState = new Label("Enter the Company State ");
        
        String states[] = 
                   {"Alabama","Alaska","Arizona","Arkansas","California","Colorado",
                       "Connecticut","Delaware","Florida","Georgia","Hawaii",
                       "Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky",
                       "Louisiana", "Maine","Maryland","Massachusetts","Michigan",
                       "Minnesota","Mississippi","Missouri","Montana","Nebraska",
                       "Nevada","New Hampshire","New Jersey","New Mexico",
                       "New York","North Carolina","North Dakota","Ohio","Oklahoma",
                       "Oregon","Pennsylvania","Rhode Island","South Carolina",
                       "South Dakota","Tennessee","Texas","Utah","Vermont",
                       "Virginia","Washington","West Virginia","Wisconsin","Wyoming" }; 
  
        // Create a combo box to display states
        ComboBox combo_box1 = new ComboBox(FXCollections.observableArrayList(states)); 
        combo_box1.setValue("" + DEFAULT_CARD.getState());
  
        Label labelZip = new Label("Enter the Company Zip Code ");
        TextField textZip = new TextField();
        textZip.setText("" + DEFAULT_CARD.getZip());
    
        Label labelEmailAddress = new Label("Enter the Email Address ");
        TextField textEmailAddress = new TextField();
        textEmailAddress.setText("" + DEFAULT_CARD.getEmailAddress());
    
        Label labelPhone = new Label("Enter the Company Telephone ");
        TextField textPhone = new TextField();
        textPhone.setText("" + DEFAULT_CARD.getPhone());
        
        // Add the label, textfields, and a combo box for the Credit Card 
        //Company to the GridPane
        gridPane.add(labelCreditCardCompanyData, 0, 0);
        gridPane.add(labelRoutingNumber, 0, 1);
        gridPane.add(labelBranchNumber, 0, 2);
        gridPane.add(labelCompanyName, 0, 3);
        gridPane.add(labelBranchAddress, 0, 4);
        gridPane.add(labelCity, 0, 5);
        gridPane.add(labelState, 0, 6);
        gridPane.add(labelZip, 0, 7);
        gridPane.add(labelEmailAddress, 0, 8);
        gridPane.add(labelPhone, 0, 9);
        
        gridPane.add(textRoutingNumber, 2,1);
        gridPane.add(textBranchNumber, 2, 2);
        gridPane.add(textCompanyName, 2, 3);
        gridPane.add(textBranchAddress, 2, 4);
        gridPane.add(textCity, 2, 5);
        gridPane.add(combo_box1, 2, 6);
        gridPane.add(textZip, 2, 7);
        gridPane.add(textEmailAddress, 2, 8);
        gridPane.add(textPhone, 2, 9);

        //Define the labels, textfields, and a combo box for the Credit Card 
        //Holder information
        Label labelCreditCardAccountHolderData = 
                new Label("Credit Card Account Holder Data");
        labelCreditCardAccountHolderData.setFont
        (Font.font("Tahoma", FontWeight.BOLD, 15));
    
        Label labelAccountHolderNumber = 
                new Label("Enter the Account Holder Number ");
        TextField textAccountHolderNumber = new TextField();
        textAccountHolderNumber.setText("" + 
                DEFAULT_CARD.getAccountHolderNumber());
        
        Label labelAccountHolderName = new Label("Enter the Account Holder Name ");
        TextField textAccountHolderName = new TextField();
        textAccountHolderName.setText("" + DEFAULT_CARD.getAccountHolderName());
        
        Label labelAccountHolderAddress = 
                new Label("Enter the Account Holder Address ");
        TextField textAccountHolderAddress = new TextField();
        textAccountHolderAddress.setText("" + 
                DEFAULT_CARD.getAccountHolderAddress());
        
        Label labelAccountHolderCity = new Label("Enter the Account Holder City ");
        TextField textAccountHolderCity = new TextField();
        textAccountHolderCity.setText("" + DEFAULT_CARD.getAccountHolderCity());
        
        Label labelAccountHolderState = new Label("Enter the Account Holder State ");
  
        // Create a combo box to display states
        ComboBox combo_box = new ComboBox(FXCollections .observableArrayList(states)); 
        combo_box.setValue("" + DEFAULT_CARD.getAccountHolderState());
        
        Label labelAccountHolderZip = new Label("Enter the Account Holder Zip ");
        TextField textAccountHolderZip = new TextField();
        textAccountHolderZip.setText("" + DEFAULT_CARD.getAccountHolderZip());
        
        Label labelAccountHolderEmailAddress = 
                new Label("Enter the Account Holder Email Address");
        TextField textAccountHolderEmailAddress= new TextField();
        textAccountHolderEmailAddress.setText("" + 
                DEFAULT_CARD.getAccountHolderEmailAddress());
    
        Label labelAccountHolderPhone = 
                new Label("Enter the Account Holder Phone Number ");
        TextField textAccountHolderPhone = new TextField();
        textAccountHolderPhone.setText("" + DEFAULT_CARD.getAccountHolderPhone());
        
        // Add the labels, textfields, and a combo box for the Credit Card Holder 
        // To the GridPane
        gridPane.add(labelCreditCardAccountHolderData, 3, 0);
        gridPane.add(labelAccountHolderNumber, 3, 1);
        gridPane.add(labelAccountHolderName, 3, 2);
        gridPane.add(labelAccountHolderAddress, 3, 3);
        gridPane.add(labelAccountHolderCity, 3, 4);
        gridPane.add(labelAccountHolderState, 3, 5);
        gridPane.add(labelAccountHolderZip, 3, 6);
        gridPane.add(labelAccountHolderEmailAddress, 3, 7);
        gridPane.add(labelAccountHolderPhone, 3, 8);
        
        gridPane.add(textAccountHolderNumber, 4, 1);
        gridPane.add(textAccountHolderName, 4, 2);
        gridPane.add(textAccountHolderAddress, 4, 3);
        gridPane.add(textAccountHolderCity, 4, 4);
        gridPane.add(combo_box, 4, 5); 
        gridPane.add(textAccountHolderZip, 4, 6);
        gridPane.add(textAccountHolderEmailAddress, 4, 7);
        gridPane.add(textAccountHolderPhone, 4, 8);
        
        // Define the labels, textfields, and a slider for the Credit Card 
        //Holder Financial Data
        Label labelFinancialData = new Label("Account Holder Financial Data");
        labelFinancialData.setFont(Font.font("Tahoma", FontWeight.BOLD, 15));
    
        //Radio Button to pick the credit card account
        final ToggleGroup group = new ToggleGroup();
        RadioButton rbBusiness = new RadioButton();
        RadioButton rbPersonal = new RadioButton();        
        rbBusiness.setText("Business");
        rbPersonal.setText("Personal");
        rbBusiness.setSelected(true);
        rbBusiness.setToggleGroup(group);
        rbPersonal.setToggleGroup(group);
    
        //Label and textfield for the credit card limit
        Label labelCreditLimit = new Label("Enter the Credit Limit using slider");
        TextField textCreditLimit = new TextField();
        textCreditLimit.setEditable(false);
        textCreditLimit.setPromptText("Use the slider above");
        
        //Slider to define the credit card limit default 0, max $8,000
        Slider slider = new Slider(0, 8000, 0);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(2000);
        slider.setBlockIncrement(1);
        slider.setShowTickLabels(true);
        slider.setSnapToTicks(true);
        
        //Displays numbers while slider is moving and stops at a value divisable
        //by $500
        slider.valueProperty().addListener(new ChangeListener<Number>() 
        {
            @Override public void changed(ObservableValue<? extends Number> 
                              observableValue, Number oldValue, Number newValue) 
            {
                if (newValue == null) {
                    textCreditLimit.setText("");
                    return;
                }
                textCreditLimit.setText(Math.round(newValue.intValue()) + "");
            }
        });
        
        Label labelCreditLimitDisplay = new Label("Credit Limit Display");
        labelCreditLimitDisplay.setFont(Font.font("Verdana", FontPosture.ITALIC, 13));
        
        Label labelPreviousBalance = new Label("Enter the Previous Balance ");
        TextField textPreviousBalance = new TextField();
        textPreviousBalance.setText("" + DEFAULT_CARD.getPreviousBalance());
        
        Label labelNewPurchases = new Label("Enter the Purchases ");
        TextField textNewPurchases = new TextField();
        textNewPurchases.setText("" + DEFAULT_CARD.getNewPurchases());
        
        Label labelPayments = new Label("Enter the Payments ");
        TextField textPayments = new TextField();
        textPayments.setText("" + DEFAULT_CARD.getPayments());
    
        Label labelCreditsReturns = new Label("Enter the Credits/Returns ");
        TextField textCreditsReturns  = new TextField();
        textCreditsReturns.setText("" + DEFAULT_CARD.getCreditsReturns());
 
        // Add the labels, textfields, and a slider for the Credit Card Holder 
        // financial data to the GridPane
        gridPane.add(labelFinancialData, 5, 0);
        gridPane.add(rbBusiness, 5, 1);
        gridPane.add(labelCreditLimit, 5, 2);
        gridPane.add(labelCreditLimitDisplay, 5, 3);
        gridPane.add(labelPreviousBalance, 5, 4);
        gridPane.add(labelNewPurchases, 5, 5);
        gridPane.add(labelPayments, 5, 6);
        gridPane.add(labelCreditsReturns, 5, 7);
        
        gridPane.add(rbPersonal, 6, 1);
        gridPane.add(slider, 6, 2);
        gridPane.add(textCreditLimit, 6, 3);
        gridPane.add(textPreviousBalance, 6, 4);
        gridPane.add(textNewPurchases, 6, 5);
        gridPane.add(textPayments, 6, 6);
        gridPane.add(textCreditsReturns, 6, 7);
           
        // Define the labels for displaying output finance information
        Label labelFinanceCharges = new Label("Finance charges");
        labelFinanceCharges.setUnderline(true);
        labelFinanceCharges.setFont(Font.font("Verdana", FontWeight.BOLD, 13));
        
        Label labelFinanceCharge  = new Label("0.00");
        labelFinanceCharge.setVisible(false);
        
        Label labelNewBalance  = new Label("0.00");
        labelNewBalance.setVisible(false);
                
        Label labelNewPayment = new Label("0.00");
        labelNewPayment.setVisible(false);
                
        Label labelCreditLimitCheck = new Label("You are over credit limit");
        labelCreditLimitCheck.setVisible(false);

        // Add the finance output labels to the gridpane
        gridPane.add(labelFinanceCharges, 5, 11);
        gridPane.add(labelFinanceCharge, 5, 12);
        gridPane.add(labelNewBalance, 5, 13);
        gridPane.add(labelNewPayment, 5, 14);
        gridPane.add(labelCreditLimitCheck, 5, 15);
        
        //Define the label and textArea for account information output
        Label labelAccountInformation = new Label("Account Information");
        labelAccountInformation.setUnderline(true);
        labelAccountInformation.setFont(Font.font("Verdana", FontWeight.BOLD, 13));
        
        TextArea output = new TextArea();
        output.setPrefRowCount(10);
        output.setPrefColumnCount(23);
        
        // Add the account information label and textArea to the gridpane
        gridPane.add(labelAccountInformation, 3, 11);
        gridPane.add(output, 3, 12, 2, 8);
        
        //Define and add to the GridPane calculate button
        Button calculateButton = new Button("Calculate Credit card charges");
        gridPane.add(calculateButton, 6, 9, 2, 1);
        
        //Add color to the calculate button before and after the mouse 
        //hovers over it
        final String IDLE_BUTTON_STYLE = "-fx-background-color: LIGHTBLUE;";
        final String HOVERED_BUTTON_STYLE = "-fx-outer-border: LIGHTBLUE;";
        calculateButton.setStyle(IDLE_BUTTON_STYLE);
        calculateButton.setOnMouseEntered(e -> calculateButton.setStyle(HOVERED_BUTTON_STYLE));
        calculateButton.setOnMouseExited(e -> calculateButton.setStyle(IDLE_BUTTON_STYLE));

        //Set calculate button to perform the calculations
        calculateButton.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                int routingNumber = 
                        Integer.parseInt(textRoutingNumber.getText());
                
                int branchNumber = 
                        Integer.parseInt(textBranchNumber.getText());
                
                String companyName =
                       textCompanyName.getText();
                
                String branchAddress =
                       textBranchAddress.getText();               
                
                String city = 
                       textCity.getText();                
                
                String state = 
                       state = (String) combo_box1.getValue();   
                
                String zip = 
                       textZip.getText();                
                
                String emailAddress = 
                       textEmailAddress.getText();               
                
                String phone = 
                       textPhone.getText();               

                // Create an object of the CreditCardCompany Class
                CreditCardCompany creditCardCompanyObject = new
                                            CreditCardCompany(routingNumber, 
                                            branchNumber,
                                            companyName,
                                            branchAddress,
                                            city,
                                            state,
                                            zip,
                                            emailAddress,
                                            phone);
                
                int accountHolderNumber =
                        Integer.parseInt(textAccountHolderNumber.getText());
                
                String accountHolderName = 
                       textAccountHolderName.getText(); 
                
                String accountHolderAddress = 
                       textAccountHolderAddress.getText(); 
                
                String accountHolderCity = 
                       textAccountHolderCity.getText(); 
                
                String accountHolderState;
                       accountHolderState = (String) combo_box.getValue(); 
                
                String accountHolderZip = 
                       textAccountHolderZip.getText(); 
                
                String accountHolderEmailAddress =
                       textAccountHolderEmailAddress.getText();
                
                String accountHolderPhone =
                       textAccountHolderPhone.getText();
                
                // Create an object of the Credit Card Holder Class
                CreditCardHolder creditCardHolderObject = new
                                    CreditCardHolder(routingNumber,
                                    branchNumber,
                                    accountHolderNumber,
                                    accountHolderName,
                                    accountHolderAddress,
                                    accountHolderCity,
                                    accountHolderState,
                                    accountHolderZip,
                                    accountHolderEmailAddress,
                                    accountHolderPhone);
                
                double creditLimit;
                        creditLimit = slider.getValue();
                                             
                double previousBalance = 
                        Double.parseDouble(textPreviousBalance.getText());
                
                double newPurchases = 
                        Double.parseDouble(textNewPurchases.getText());
                
                double payments = 
                        Double.parseDouble(textPayments.getText());
                
                double creditsReturns = 
                        Double.parseDouble(textCreditsReturns.getText()); 
                
                CreditCardHolderFinancialData creditCardHolderFinancialData;
                
                if (rbBusiness.isSelected())
                {
                    creditCardHolderFinancialData 
                        = new  BusinessCreditCard
                               (creditCardCompanyObject,
                               creditCardHolderObject,
                               accountHolderNumber,
                               "B",
                               creditLimit,
                               previousBalance,
                               newPurchases,
                               payments,
                               creditsReturns
                               );
                }                
                else              
                {
                    creditCardHolderFinancialData 
                        = new  PersonalCreditCard
                               (creditCardCompanyObject,
                               creditCardHolderObject,
                               accountHolderNumber,
                               "P",
                               creditLimit,
                               previousBalance,
                               newPurchases,
                               payments,
                               creditsReturns);
                }
                
                output.setText("" + creditCardHolderFinancialData);
                
                // Output the finance informaton to the user
                labelFinanceCharge.setText(String.format
                        ("The Finance Charge is %,.2f",
                        creditCardHolderFinancialData.getFinanceCharge()));
                labelFinanceCharge.setVisible(true);

                double newBalance = creditCardHolderFinancialData.getNewBalance();
                labelNewBalance.setText(String.format
                        ("The New Balance is %,.2f", newBalance));
                labelNewBalance.setVisible(true);
                
                labelNewPayment.setText(String.format
                        ("The New payment is %,.2f",
                        creditCardHolderFinancialData.getNewPayment()));
                labelNewPayment.setVisible(true);

                if(creditCardHolderFinancialData.getCreditLimitCheck(newBalance)){
                    labelCreditLimitCheck.setText(String.format
                            ("You are over credit limit.",
                            creditCardHolderFinancialData.getCreditLimitCheck(newBalance))
                    );
                    labelCreditLimitCheck.setTextFill(RED);
                    labelCreditLimitCheck.setVisible(true);
                }
                else{
                    labelCreditLimitCheck.setVisible(false);
                }
            }
        });

        //Define and add to the gridpane exit button
        Button exitButton = new Button("Exit the Program");
        gridPane.add(exitButton, 6, 20);
        exitButton.setOnAction(new EventHandler<ActionEvent>()
        {    
            @Override
            public void handle(ActionEvent event)
            {
                System.exit(0);
            }  
        });
        
        //Define and add to the gridpane clear button to clear the default
        //information and add new credit card
        Button clearButton = new Button("Clear/New credit card inquiry");
        gridPane.add(clearButton, 6, 10);
        clearButton.setOnAction(event -> 
        {
            textRoutingNumber.clear();
            textBranchNumber.clear();
            textCompanyName.clear();
            textBranchAddress.clear();
            textCity.clear();
            textZip.clear();
            textEmailAddress.clear();
            textPhone.clear();
            textAccountHolderNumber.clear();
            textAccountHolderName.clear();
            textAccountHolderAddress.clear();
            textAccountHolderCity.clear();
            textAccountHolderZip.clear();
            textAccountHolderEmailAddress.clear();
            textAccountHolderPhone.clear();
            textPreviousBalance.clear();
            textNewPurchases.clear();
            textPayments.clear();
            textCreditsReturns.clear();
            textCreditLimit.clear();
            output.clear();
            labelFinanceCharge.setVisible(false);
            labelNewBalance.setVisible(false);
            labelNewPayment.setVisible(false);
            labelCreditLimitCheck.setVisible(false);
        });
    }// End of the method BuildComponents  
}// End of the class
