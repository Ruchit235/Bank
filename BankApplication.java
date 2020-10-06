package ASSIGNMENT3;

import java.util.Scanner;

class AccountHolder
{
    private int accountNo ;
    private String accHolderName ;
    private boolean accountType ;
    private double initialAmount ;
    private int depositAmount = 0 ;
    private int withDrawls = 0 ;

    public AccountHolder(int accountNo, String accHolderName, boolean accountType)
    {
        this.accountNo = accountNo;
        this.accHolderName = accHolderName;
        this.accountType = accountType;
        deposit(this.depositAmount) ;
        withDrawls(this.withDrawls) ;

    }
    public double deposit(int depositAmount)
    {
        System.out.println("Amount Deposited : " + depositAmount);
        System.out.println("Account Balance : " + (depositAmount + initialAmount) );
        return (depositAmount + initialAmount) ;
    }
    public double withDrawls(int withDrawlsAmount)
    {
        if(initialAmount >= 500 && (initialAmount - withDrawlsAmount) >= 500)
        {
            System.out.println("Amount Withdrawals : " + withDrawlsAmount);
            System.out.println("Account Balance : " + (initialAmount - withDrawlsAmount));
        }
        else
        {
            System.out.println("Account balance is too low for transaction .");
        }
        return (initialAmount - withDrawlsAmount) ;
    }

}
public class BankApplication
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in) ;
        printInstructions() ;
        boolean quit = false ;
        while(!quit)
        {
            System.out.println("Enter your Input : ");
            int choice  = scanner.nextInt() ;
            switch(choice)
            {
                case 0 :
                {
                    System.out.println("Thank you for banking with us .");
                    quit = false ;
                }
                break ;
                case 1 :
                {
                    System.out.println("Enter amount to Deposit");
                    int amount = scanner.nextInt() ;

                }
            }
        }
    }

    private static void printInstructions()
    {
        System.out.println("1 ---> DEPOSIT ");
        System.out.println("2 ---> CheckBalance");
        System.out.println("3 ---> CheckBalance");
        System.out.println("4 ---> PrintInstructions");
        System.out.println("0 ---> Quit");
    }
}

