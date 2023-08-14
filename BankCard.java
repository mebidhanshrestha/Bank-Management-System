 

/**
 * Write a description of class DebitCard here.
 *
 * @author (22067584 Bidhan Shrestha)
 * @version (1.0.0.0)
 */
public class BankCard {
    //attributes
    private int cardId;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private double balanceAmount;

    //constructor
    public BankCard(double balanceAmount, int cardId, String bankAccount, String issuerBank) {
        this.balanceAmount = balanceAmount;
        this.cardId = cardId;
        this.bankAccount = bankAccount;
        this.issuerBank = issuerBank;
        this.clientName = ""; //initialize client name to an empty string
    }

    //accessor methods
    public int getCardId() {
        return cardId;
    }

    public String getClientName() {
        return clientName;
    }

    public String getIssuerBank() {
        return issuerBank;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public double getBalanceAmount() {
        return balanceAmount;
    }

    //mutator methods
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setBalanceAmount(double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    //display method
    public void display() {
        System.out.println("Card ID: " + cardId);
        if (clientName.equals("")) {
            System.out.println("Client name has not been assigned.");
        } else {
            System.out.println("Client Name: " + clientName);
        }
        System.out.println("Issuer Bank: " + issuerBank);
        System.out.println("Bank Account: " + bankAccount);
        System.out.println("Balance Amount: " + balanceAmount);
    }
}