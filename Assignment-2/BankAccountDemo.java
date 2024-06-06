import java.util.Scanner;
public class BankAccountDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account holder's name:");
        String accountHolderName=sc.nextLine();
        System.out.println("Enter account number:");
        String accountNumber=sc.nextLine();
        System.out.println("Enter account type (S for savings, C for current):");
        char accountType=sc.next().charAt(0);
        System.out.println("Enter initial balance:");
        int initialBalance = sc.nextInt();
        BankAccount account=new BankAccount();
        account.initializeData(accountHolderName,accountNumber,accountType,initialBalance);
        System.out.println("Account created successfully.");
        System.out.println("Enter amount to deposit:");
        int depositAmount=sc.nextInt();
        account.deposit(depositAmount);
        System.out.println("Enter amount to withdraw:");
        int withdrawAmount = sc.nextInt();
        account.withdraw(withdrawAmount);
        System.out.println("Updated account details:");
        account.displayAccountDetails();
    }
}
class BankAccount{
    String accountHolderName;
    String accountNumber;
    char accountType;
    int balance;
    void initializeData(String accountHolderName,String accountNumber,char accountType,int balance)
    {
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        this.accountType=accountType;
        this.balance=balance;
    }
    void deposit(int amount) 
    {
        balance+=amount;
        System.out.println("Amount deposited successfully.");
    }
    void withdraw(int amount)  
    {
        if(balance-amount>=1000) 
        {
            balance-=amount;
            System.out.println("Amount withdrawn successfully.");
        } 
        else 
        {
            System.out.println("Withdrawal failed!");
        }
    }
    void displayAccountDetails() 
    {
        System.out.println("Account Holder's Name: "+accountHolderName);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Type: "+accountType);
        System.out.println("Balance: Rs. "+balance);
    }
}