/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {

        SavingsAccount account1 = new SavingsAccount(2000);
        SavingsAccount account2 = new SavingsAccount(3000);

        
        SavingsAccount.modifyInterestRate(0.04);

        
        account1.calculateMonthlyInterest();
        account2.calculateMonthlyInterest();

        System.out.printf("conta1 com 4%% de juros: %.2f\n", account1.getSavingsBalance());
        System.out.printf("conta2 com 4%% de juros: %.2f\n", account2.getSavingsBalance());


        SavingsAccount.modifyInterestRate(0.05);


        account1.calculateMonthlyInterest();
        account2.calculateMonthlyInterest();

        System.out.printf("conta 1 com 5%% de juros: %.2f\n", account1.getSavingsBalance());
        System.out.printf("conta 2 com 5%% de juros: %.2f\n", account2.getSavingsBalance());
	}
}
