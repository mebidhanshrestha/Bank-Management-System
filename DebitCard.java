
/**
 * Write a description of class DebitCard here.
 *
 * @author (22067584 Bidhan Shrestha)
 * @version (1.0.0)
 */
public class DebitCard extends BankCard {
    //Attributes
    private int PIN;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
    
    //Constructor
    public DebitCard(int balanceAmount, int cardId, String bankAccount, String issuerBank, String clientName, int PIN) {
        super(balanceAmount, cardId, bankAccount, issuerBank);
        super.setClientName(clientName);
        this.PIN = PIN;
        hasWithdrawn = false;
    }
    // Accessor Method
    public int getPIN() { return PIN; }
    public int getWithdrawalAmount() { return withdrawalAmount; }
    public String getDateOfWithdrawal() { return dateOfWithdrawal; }
    public boolean getHasWithdrawn() { return hasWithdrawn; }

    // Mutator Method
    public void setWithdrawalAmount(int withdrawalAmount) { this.withdrawalAmount = withdrawalAmount; }
    
    //Withdraw Method
    public boolean withdraw(int withdrawalAmount, String dateOfWithdrawal, int PIN) {
        if (this.PIN == PIN) {
            if (withdrawalAmount <= super.getBalanceAmount()) {
                super.setBalanceAmount(super.getBalanceAmount() - withdrawalAmount);
                this.dateOfWithdrawal = dateOfWithdrawal;
                this.withdrawalAmount = withdrawalAmount;
                this.hasWithdrawn = true;
                return true;
            } else {
                System.out.println("Insufficient balance");
                return false;
            }
        } else {
            System.out.println("Invalid PIN");
            return false;
        }
    }


    //Display method
    @Override
    public void display() {
        super.display();//call th display method of superclass
        System.out.println("PIN: " + getPIN());
        if(hasWithdrawn == true) {
            System.out.println("Withdrawal Amount: " + getWithdrawalAmount());
            System.out.println("Date of Withdrawal: " + getDateOfWithdrawal());
        }
        else{
            System.out.println("No withdrawal has been done");
        }
    }
}