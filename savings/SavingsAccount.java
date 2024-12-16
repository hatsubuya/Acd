public class SavingsAccount {

    private static double annualInterestRate;

    private double savingsBalance;

    
    public SavingsAccount(double initialBalance) {
        
        savingsBalance = initialBalance;
    }

    
    public void calculateMonthlyInterest() {
        
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        
        savingsBalance += monthlyInterest;
        
    }

    
    public static void modifyInterestRate(double newRate) {
        
        annualInterestRate = newRate;
        
    }

    
    public double getSavingsBalance() {
        
        return savingsBalance;
        
    }

    
    public static double getAnnualInterestRate() {
        
        return annualInterestRate;
        
    }
}