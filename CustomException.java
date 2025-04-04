public class CustomException 
{
    private double balance;

    public CustomException(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to withdraw money
    public void withdraw(double amount) throws InsufficientFundsException 
    {
        if (amount > balance) 
        {
            throw new InsufficientFundsException("Insufficient funds for withdrawal. Available balance: " + balance);
        }
        balance -= amount;
    }

    public double getBalance() 
    {
        return balance;
    }

    public static void main(String[] args) 
    {
        CustomException account = new CustomException(100.0);

        try {
            account.withdraw(150.0);  // This will throw the custom exception
        } catch (InsufficientFundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Account balance: " + account.getBalance());
    }
    
}
