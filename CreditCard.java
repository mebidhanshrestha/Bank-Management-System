
/**
 * Write a description of class DebitCard here.
 *
 * @author (22067584 Bidhan Shrestha)
 * @version (1.0.0)
 */
public class CreditCard extends BankCard {
    //attributes
    private int CVC;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;

    // constructor
    public CreditCard(int cardId, String clientName, String issuerBank, String bankAccount, double balanceAmount, int CVC,
    double interestRate, String expirationDate) {
        super(balanceAmount, cardId, bankAccount, issuerBank);
        this.CVC = CVC;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        this.isGranted = false;
    }

    // accessor methods
    public int getCVC() { return CVC; }
    public double getCreditLimit() { return creditLimit; }
    public double getInterestRate() { return interestRate; }
    public String getExpirationDate() { return expirationDate; }
    public int getGracePeriod() { return gracePeriod; }
    public boolean getIsGranted() { return isGranted; }

    //method to set credit limit and grace period
    public void setCreditLimit(double newCreditLimit, int newGracePeriod) {
        if (newCreditLimit <= 2.5 * this.getBalanceAmount()) {
            this.creditLimit = newCreditLimit;
            this.gracePeriod = newGracePeriod;
            this.isGranted = true;
        } else {
            System.out.println("Credit cannot be issued.");
        }
    }

    // new method to cancel credit card
    public void cancelCreditCard() {
        this.CVC = 0;
        this.creditLimit = 0;
        this.gracePeriod = 0;
        this.isGranted = false;
    }

    // display method
    public void display() {
        if (isGranted == true) {
            super.display();
            System.out.println("CVC: " + CVC);
            System.out.println("Credit Limit: " + creditLimit);
            System.out.println("Interest Rate: " + interestRate);
            System.out.println("Expiration Date: " + expirationDate);
            System.out.println("Grace Period: " + gracePeriod);
        } else {
            System.out.println("Credit has not been granted.");
        }
    }
}

