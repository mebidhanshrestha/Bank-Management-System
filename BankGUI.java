import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author (22067584 Bidhan Shrestha)
 * @version (1.0.0.0)
 */
public class BankGUI implements ActionListener {
    // declare all the components here
    private ArrayList<BankCard> cardList;

    private JLabel label, DebitCard, CreditCard, DCardID, DClientname, DBankAccount, DIssuerBank, DBalanceAmount,
            DPinNumber, CCardID, CCVC, CBankAccount, CIssuerBank, CBalanceAmount, CClientName, CInterestRate,
            CExpirationDate, DebitCardID, DebitWithdrawalAmount, DebitWithdrawalDate, DebitPinNumber, CreditCardID,
            CreditCreditLimit, CreditGracePeriod;
    private JTextField DCardIDtextfield, Dcientnametextfield, DBankAccounttextfield, DIssuerBanktextfield,
            DBalanceAmounttextfield, DPinNumbertextfield, CCardIDTextfield, CCVCTextField, CBankAccounttextfield,
            CIssuerBanktextfield, CBalanceAmounttextfield, CClientNametextfield, CInterestRatetextfield,
            DebitCardIDtextfield, debitWithdrawalAmount, DebitPinNumbertextfield, CreditCardIDtextfield,
            CreditCreditLimittextfield, CreditGracePeriodtextfield;
    private JButton AddToDebit, AddtoCreditCard, DebitWithdrawal, SetCreditLimit, CancelCreditCard, DebitDisplay,
            ClearButton, CreditDisplay;
    private JComboBox Credityear, Creditmonth, Creditday, Debityear, Debitmonth, Debitday;

    public BankGUI() {
        cardList = new ArrayList<BankCard>(); // Initialize the ArrayList

        // Jframe
        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(new Color(244, 165, 89));

        // main Heading
        label = new JLabel("Bank Card");
        label.setBounds(450, 9, 190, 42);
        label.setFont(new Font("Helvetica", Font.PLAIN, 30));

        // Debit card heading
        DebitCard = new JLabel("Debit Card");
        DebitCard.setBounds(185, 79, 137, 28);
        DebitCard.setFont(new Font("Helvetica", Font.PLAIN, 20));

        // CreditCard Heading
        CreditCard = new JLabel("Credit Card");
        CreditCard.setBounds(737, 73, 134, 28);
        CreditCard.setFont(new Font("Helvetica", Font.PLAIN, 20));

        // DebitCardid
        DCardID = new JLabel("Card Id: ");
        DCardID.setBounds(113, 150, 104, 19);

        // Debit Client name
        DClientname = new JLabel("Client Name: ");
        DClientname.setBounds(113, 187, 104, 19);

        // Debit Bank Account
        DBankAccount = new JLabel("Bank Account: ");
        DBankAccount.setBounds(113, 225, 104, 19);

        // Debit Issuer Bank
        DIssuerBank = new JLabel("Issuer Bank: ");
        DIssuerBank.setBounds(113, 262, 104, 19);

        // Debit Balance Amount
        DBalanceAmount = new JLabel("Balance Amount: ");
        DBalanceAmount.setBounds(113, 300, 121, 19);

        // Debit Pin Number
        DPinNumber = new JLabel("Pin Number: ");
        DPinNumber.setBounds(113, 337, 90, 19);

        // debit cardid textfield
        DCardIDtextfield = new JTextField();
        DCardIDtextfield.setBounds(253, 145, 138, 24);

        // debit client name textfield
        Dcientnametextfield = new JTextField();
        Dcientnametextfield.setBounds(253, 183, 138, 24);

        // debit bank account textfield
        DBankAccounttextfield = new JTextField();
        DBankAccounttextfield.setBounds(253, 221, 138, 24);

        // debit IssuerBank textfield
        DIssuerBanktextfield = new JTextField();
        DIssuerBanktextfield.setBounds(253, 259, 138, 24);

        // debit Balance Amount textfield
        DBalanceAmounttextfield = new JTextField();
        DBalanceAmounttextfield.setBounds(253, 297, 138, 24);

        // debit Pin Number textfield
        DPinNumbertextfield = new JTextField();
        DPinNumbertextfield.setBounds(253, 335, 138, 24);

        // debit Button
        AddToDebit = new JButton("Add to Debit");
        AddToDebit.setBounds(113, 402, 134, 28);

        // credit cardID
        CCardID = new JLabel("Card ID: ");
        CCardID.setBounds(633, 140, 88, 16);

        // credit cvc
        CCVC = new JLabel("CVC Number: ");
        CCVC.setBounds(633, 175, 88, 16);

        // credit bank Account
        CBankAccount = new JLabel("Bank Account: ");
        CBankAccount.setBounds(633, 215, 104, 19);

        // credit issuer bank
        CIssuerBank = new JLabel("Issuer Bank: ");
        CIssuerBank.setBounds(633, 254, 98, 19);

        // credit balance amount
        CBalanceAmount = new JLabel("Balance Amount: ");
        CBalanceAmount.setBounds(633, 293, 124, 19);

        // credit client name
        CClientName = new JLabel("Client Name: ");
        CClientName.setBounds(633, 334, 106, 19);

        // credit interest rate
        CInterestRate = new JLabel("Interest Rate: ");
        CInterestRate.setBounds(633, 371, 107, 19);

        // credit expirationdate
        CExpirationDate = new JLabel("Expiration Date: ");
        CExpirationDate.setBounds(633, 416, 114, 19);

        // Credit cardid textfield
        CCardIDTextfield = new JTextField();
        CCardIDTextfield.setBounds(790, 132, 138, 24);

        // Credit CVC textfield
        CCVCTextField = new JTextField();
        CCVCTextField.setBounds(790, 172, 138, 24);

        // Credit bank account textfield
        CBankAccounttextfield = new JTextField();
        CBankAccounttextfield.setBounds(790, 211, 138, 24);

        // Credit IssuerBank textfield
        CIssuerBanktextfield = new JTextField();
        CIssuerBanktextfield.setBounds(790, 251, 138, 24);

        // credit Balance Amount textfield
        CBalanceAmounttextfield = new JTextField();
        CBalanceAmounttextfield.setBounds(790, 291, 138, 24);

        // Credit Client Name textfield
        CClientNametextfield = new JTextField();
        CClientNametextfield.setBounds(790, 331, 138, 24);

        // Credit Interest Rate
        CInterestRatetextfield = new JTextField();
        CInterestRatetextfield.setBounds(790, 371, 138, 24);

        // Credit ComboBox
        String year[] = { "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009",
                "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022",
                "2023", "2024" };
        Credityear = new JComboBox(year);
        Credityear.setBounds(790, 416, 85, 23);

        String month[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        Creditmonth = new JComboBox(month);
        Creditmonth.setBounds(870, 416, 75, 23);

        String day[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
                "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" };
        Creditday = new JComboBox(day);
        Creditday.setBounds(940, 416, 60, 23);

        // credit button
        AddtoCreditCard = new JButton("Add to Credit Card");
        AddtoCreditCard.setBounds(636, 480, 167, 28);

        // debit cardid
        DebitCardID = new JLabel("Card ID: ");
        DebitCardID.setBounds(113, 532, 60, 19);

        // debit Withdrawal Amount
        DebitWithdrawalAmount = new JLabel("Withdrawal Amount: ");
        DebitWithdrawalAmount.setBounds(113, 578, 134, 19);

        // debit Withdrawal Date
        DebitWithdrawalDate = new JLabel("Withdrawal Date: ");
        DebitWithdrawalDate.setBounds(113, 624, 121, 19);

        // debit pin number
        DebitPinNumber = new JLabel("Pin Number:  ");
        DebitPinNumber.setBounds(113, 670, 104, 19);

        // debit CardID textfield
        DebitCardIDtextfield = new JTextField();
        DebitCardIDtextfield.setBounds(253, 527, 138, 24);

        // debit WithdrawalAmount textfield
        debitWithdrawalAmount = new JTextField();
        debitWithdrawalAmount.setBounds(253, 576, 138, 24);

        // debit pin number
        DebitPinNumbertextfield = new JTextField();
        DebitPinNumbertextfield.setBounds(253, 665, 138, 24);

        // debit button
        DebitWithdrawal = new JButton("Debit Withdrawal");
        DebitWithdrawal.setBounds(113, 733, 141, 28);

        // debit ComboBox
        Debityear = new JComboBox(year);
        Debityear.setBounds(253, 620, 85, 23);

        Debitmonth = new JComboBox(month);
        Debitmonth.setBounds(333, 620, 75, 23);

        Debitday = new JComboBox(day);
        Debitday.setBounds(405, 620, 60, 23);

        // credit cardid
        CreditCardID = new JLabel("Card ID: ");
        CreditCardID.setBounds(663, 577, 109, 19);

        // credit credit limit
        CreditCreditLimit = new JLabel("Credit Limit: ");
        CreditCreditLimit.setBounds(663, 622, 109, 19);

        // credit grace period
        CreditGracePeriod = new JLabel("Grace Period: ");
        CreditGracePeriod.setBounds(663, 666, 109, 19);

        // credit cardid textfield
        CreditCardIDtextfield = new JTextField();
        CreditCardIDtextfield.setBounds(765, 575, 138, 24);

        // credit creditlimit textfield
        CreditCreditLimittextfield = new JTextField();
        CreditCreditLimittextfield.setBounds(765, 620, 138, 24);

        // credit graceperiod textfield
        CreditGracePeriodtextfield = new JTextField();
        CreditGracePeriodtextfield.setBounds(765, 664, 138, 24);

        // credit buttons
        SetCreditLimit = new JButton("Set Credit Limit");
        SetCreditLimit.setBounds(638, 733, 134, 28);

        CancelCreditCard = new JButton("Cancel Credit Card");
        CancelCreditCard.setBounds(793, 733, 146, 28);

        // main button
        DebitDisplay = new JButton("Display");
        DebitDisplay.setBounds(113, 800, 84, 28);

        ClearButton = new JButton("Clear");
        ClearButton.setBounds(483, 800, 78, 28);

        CreditDisplay = new JButton("Display");
        CreditDisplay.setBounds(810, 800, 84, 28);

        // adding items to frame
        frame.add(label);
        frame.add(DebitCard);
        frame.add(CreditCard);
        frame.add(DCardID);
        frame.add(DClientname);
        frame.add(DBankAccount);
        frame.add(DIssuerBank);
        frame.add(DBalanceAmount);
        frame.add(DPinNumber);
        frame.add(DCardIDtextfield);
        frame.add(Dcientnametextfield);
        frame.add(DBankAccounttextfield);
        frame.add(DIssuerBanktextfield);
        frame.add(DBalanceAmounttextfield);
        frame.add(DPinNumbertextfield);
        frame.add(AddToDebit);

        // CreditCArd
        frame.add(CCardID);
        frame.add(CBankAccount);
        frame.add(CCVC);
        frame.add(CBalanceAmount);
        frame.add(CIssuerBank);
        frame.add(CClientName);
        frame.add(CInterestRate);
        frame.add(CExpirationDate);
        frame.add(CCardIDTextfield);
        frame.add(CCVCTextField);
        frame.add(CBankAccounttextfield);
        frame.add(CIssuerBanktextfield);
        frame.add(CBalanceAmounttextfield);
        frame.add(CClientNametextfield);
        frame.add(CInterestRatetextfield);
        frame.add(AddtoCreditCard);
        frame.add(Credityear);
        frame.add(Creditmonth);
        frame.add(Creditday);

        // Debit
        frame.add(DebitCardID);
        frame.add(DebitWithdrawalAmount);
        frame.add(DebitWithdrawalDate);
        frame.add(DebitPinNumber);
        frame.add(DebitCardIDtextfield);
        frame.add(debitWithdrawalAmount);
        frame.add(DebitPinNumbertextfield);
        frame.add(DebitWithdrawal);
        frame.add(Debityear);
        frame.add(Debitmonth);
        frame.add(Debitday);

        // CreditLimit
        frame.add(CreditCardID);
        frame.add(CreditCreditLimit);
        frame.add(CreditGracePeriod);
        frame.add(CreditCardIDtextfield);
        frame.add(CreditCreditLimittextfield);
        frame.add(CreditGracePeriodtextfield);
        frame.add(SetCreditLimit);
        frame.add(CancelCreditCard);

        // main button
        frame.add(DebitDisplay);

        frame.add(ClearButton);
        frame.add(CreditDisplay);

        ClearButton.addActionListener(this);
        AddToDebit.addActionListener(this);
        AddtoCreditCard.addActionListener(this);
        DebitWithdrawal.addActionListener(this);
        DebitDisplay.addActionListener(this);
        CreditDisplay.addActionListener(this);
        SetCreditLimit.addActionListener(this);
        CancelCreditCard.addActionListener(this);

        frame.setSize(1100, 900);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);

        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(AddToDebit)) {
            if (DBalanceAmounttextfield.getText().isEmpty() || DCardIDtextfield.getText().isEmpty()
                    || DBankAccounttextfield.getText().isEmpty() ||
                    DIssuerBanktextfield.getText().isEmpty() || Dcientnametextfield.getText().isEmpty()
                    || DPinNumbertextfield.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "THE FIELDS ARE EMPTY");
            } else {
                try {
                    // Get the input values
                    int balance = Integer.parseInt(DBalanceAmounttextfield.getText());
                    int cardId = Integer.parseInt(DCardIDtextfield.getText());
                    String bankAccount = DBankAccounttextfield.getText();
                    String issuerBank = DIssuerBanktextfield.getText();
                    String clientName = Dcientnametextfield.getText();
                    int pin = Integer.parseInt(DPinNumbertextfield.getText());

                    // Create a new DebitCard object and add it to the ArrayList
                    DebitCard newCard = new DebitCard(balance, cardId, bankAccount, issuerBank, clientName, pin);
                    cardList.add(newCard);
                    JOptionPane.showMessageDialog(null, "Debit Card added");
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "PLEASE ENTER CORRECT VALUES");
                }
            }
        }
        
        if (e.getSource().equals(AddtoCreditCard)) {
            if (CCardIDTextfield.getText().isEmpty() || CCVCTextField.getText().isEmpty()
                    || CIssuerBanktextfield.getText().isEmpty() ||
                    CBankAccounttextfield.getText().isEmpty() || CBalanceAmounttextfield.getText().isEmpty()
                    || CBalanceAmounttextfield.getText().isEmpty() ||
                    CClientNametextfield.getText().isEmpty() || CExpirationDate.getText().isEmpty()
                    || CInterestRatetextfield.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "THE FIELDS ARE EMPTY");
            } else {
                try {
                    // Get the input values
                    int cardId = Integer.parseInt(CCardIDTextfield.getText());
                    int cvc = Integer.parseInt(CCVCTextField.getText());
                    String issuerBank = CIssuerBanktextfield.getText();
                    String bankAccount = CBankAccounttextfield.getText();
                    int balance = Integer.parseInt(CBalanceAmounttextfield.getText());
                    String clientName = CClientNametextfield.getText();
                    String expirationDate = CExpirationDate.getText();
                    double interestRate = Double.parseDouble(CInterestRatetextfield.getText());

                    // Create a new CreditCard object and add it to the ArrayList
                    CreditCard newCard = new CreditCard(cardId, clientName, issuerBank, bankAccount, balance, cvc,
                            interestRate, expirationDate);
                    cardList.add(newCard);
                    JOptionPane.showMessageDialog(null, "Credit Card added!");
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "PLEASE ENTER CORRECT VALUES");
                }
            }
        }

        if (e.getSource().equals(DebitWithdrawal)) {
            if (DCardIDtextfield.getText().isEmpty() || debitWithdrawalAmount.getText().isEmpty()
                    || DebitWithdrawalDate.getText().isEmpty() || DebitPinNumbertextfield.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "THE FIELDS ARE EMPTY");
            } else {
                try {
                    int cardId = Integer.parseInt(DCardIDtextfield.getText());
                    int withdrawalAmount = Integer.parseInt(debitWithdrawalAmount.getText());
                    String dateOfWithdrawal = DebitWithdrawalDate.getText();
                    int pinNumber = Integer.parseInt(DebitPinNumbertextfield.getText());

                    // Find the DebitCard object in the ArrayList and withdraw the amount

                    for (BankCard card : cardList) {
                        DebitCard debitCard = (DebitCard) card;
                        if (card.getCardId() == (cardId)) {
                            // Cast the BankCard object to a DebitCard object and withdraw the specified
                            // amount
                            if (debitCard.withdraw(withdrawalAmount, dateOfWithdrawal, pinNumber)) {
                                // If the withdrawal is successful, update the card balance and display a
                                // success message
                                // double newBalance = debitCard.getBalance();
                                JOptionPane.showMessageDialog(null, "Withdrawal of " + withdrawalAmount
                                        + " from debit card " + cardId + " successful.");
                            } else {
                                // If the withdrawal fails, display an error message
                                JOptionPane.showMessageDialog(null,
                                        "Withdrawal failed. Please check your PIN number and account balance.");
                            }
                        }
                    }
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "PLEASE ENTER CORRECT VALUES");
                }
            }
        }

        if (e.getSource() == DebitDisplay) {
            try {
                String clientName = Dcientnametextfield.getText();
                String issuerBank = DIssuerBanktextfield.getText();
                String bankAccount = DBankAccounttextfield.getText();
                String dateOfWithdrawal = DebitWithdrawalDate.getText();

                int cardId = Integer.parseInt(DCardIDtextfield.getText());
                int balanceAmount = Integer.parseInt(DBalanceAmounttextfield.getText());
                int pinNumber = Integer.parseInt(DPinNumbertextfield.getText());
                int cardID = Integer.parseInt(DebitCardIDtextfield.getText());
                int pinNUMBER = Integer.parseInt(DebitPinNumbertextfield.getText());
                int withdrawalAmount = Integer.parseInt(debitWithdrawalAmount.getText());

                String DEBIT_Values = "Card Id:" + cardId + "\nClient Name:" + clientName;
                for (BankCard debcard : cardList) {
                    if (debcard instanceof DebitCard) {
                        DebitCard DebitCard_Object = (DebitCard) debcard;
                        DebitCard_Object.display();
                        JOptionPane.showMessageDialog(null,
                                "Debit Card information's for setting the Debit Limit are displayed. Please check the display tab!!!"
                                        + DEBIT_Values);
                    }
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Please provide required information's only!!!");
            }
        }

        if (e.getSource() == SetCreditLimit) {
            if (CCardIDTextfield.getText().isEmpty() || CreditCreditLimittextfield.getText().isEmpty()
                    || CreditGracePeriodtextfield.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "THE FIELDS ARE EMPTY");
            } else {
                try {
                    int cardId = Integer.parseInt(CCardIDTextfield.getText());
                    int newCreditLimit = Integer.parseInt((CreditCreditLimittextfield.getText()));
                    int newGracePeriod = Integer.parseInt(CreditGracePeriodtextfield.getText());

                    // Search for the BankCard object with the matching card ID
                    for (BankCard card : cardList) {
                        if (card instanceof CreditCard) {
                            CreditCard cc = (CreditCard) card;
                            if (cc.getCardId() == (cardId)) {
                                cc.setCreditLimit(newCreditLimit, newGracePeriod);
                                // show confirmation dialog to the user
                                JOptionPane.showMessageDialog(null,
                                        "Credit limit and grace period updated for card ID: " + cardId);
                            }
                        }
                    }
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "No credit card found with card ID: ");
                }
            }
        }

        if (e.getSource() == CreditDisplay) {
            if (CCardIDTextfield.getText().isEmpty() || CCVCTextField.getText().isEmpty()
                    || CIssuerBanktextfield.getText().isEmpty() ||
                    CBankAccounttextfield.getText().isEmpty() || CBalanceAmounttextfield.getText().isEmpty()
                    || CClientNametextfield.getText().isEmpty() ||
                    CInterestRatetextfield.getText().isEmpty() || CExpirationDate.getText().isEmpty()
                    || CreditCardIDtextfield.getText().isEmpty() ||
                    CreditCreditLimittextfield.getText().isEmpty() || CreditGracePeriodtextfield.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "The fields are empty !!");
            } else {
                try {

                    for (BankCard Display_CreditCard : cardList) {
                        if (Display_CreditCard instanceof CreditCard) {
                            CreditCard CreditCard_Object = (CreditCard) Display_CreditCard;
                            CreditCard_Object.display();
                            JOptionPane.showMessageDialog(null,
                                    "Credit Card information's for setting the Credit Limit are displayed. Please check the display tab!!!");
                        }
                    }
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "Please provide required information's only!!!");
                }
            }
        }

        if (e.getSource().equals(CancelCreditCard)) {
            // Retrieve user input for card ID
            int cardId = Integer.parseInt(CreditCardIDtextfield.getText());

            // Search for the BankCard object with the matching card ID
            for (BankCard card : cardList) {
                if (card instanceof CreditCard) {
                    CreditCard cc = (CreditCard) card;
                    if (cc.getCardId() == cardId) {
                        // Cast the BankCard object to a CreditCard object and cancel the credit card
                        cc.cancelCreditCard();

                        // Remove the credit card from the cardList ArrayList
                        cardList.remove(card);

                        // Display a message in an information dialog to confirm that the credit card
                        // has been canceled
                        JOptionPane.showMessageDialog(null, "Credit card " + card.getCardId() + " has been canceled.");

                        // Exit the loop since the credit card has been found and canceled
                        break;
                    }
                }
            }
        }

        if (e.getSource().equals(ClearButton)) {
            DCardIDtextfield.setText("");
            Dcientnametextfield.setText("");
            DBankAccounttextfield.setText("");
            DIssuerBanktextfield.setText("");
            DBalanceAmounttextfield.setText("");
            DPinNumbertextfield.setText("");
            CCardIDTextfield.setText("");
            CCVCTextField.setText("");
            CBankAccounttextfield.setText("");
            CIssuerBanktextfield.setText("");
            CBalanceAmounttextfield.setText("");
            CClientNametextfield.setText("");
            CInterestRatetextfield.setText("");
            DebitCardIDtextfield.setText("");
            debitWithdrawalAmount.setText("");
            DebitPinNumbertextfield.setText("");
            CreditCardIDtextfield.setText("");
            CreditCreditLimittextfield.setText("");
            CreditGracePeriodtextfield.setText("");
        }


    }

    public static void main(String[] args) {

        BankGUI obj = new BankGUI();
    }

}
