import java.util.*;
class ATM
{
    double balance;
    public void withdraw(double amount)
    {
        if(amount>balance)
        {
            System.out.println("Insufficient amount````` in your account.");
        }
        else {
            balance-=amount;
            System.out.println(amount+" has been successfully debited from your account");
        }
    }
    public void deposit(double amount)
    {
        balance+=amount;
        System.out.println(amount+" has been successfully deposited into your account");
    }
    public void checkbalance()
    {
        System.out.println("Your balance is : "+balance);
    }
}
public class ATMInterface {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ATM obj=new ATM();
        System.out.println("Welcome to the ATM");
        int choice;
        do{
            System.out.println("1. Withdraw\n2. Deposit\n3. Check Your Balance\n4. Exit");
            System.out.print("What do you wish to do : ");
         choice=sc.nextInt();
         switch (choice)
         {
             case 1:
                 System.out.print("Enter the amount to withdraw: ");
                 double withdrawamount=sc.nextInt();
                 obj.withdraw(withdrawamount);
                 break;
             case 2:
                 System.out.print("Enter the amount to deposit: ");
                 double depositamount=sc.nextInt();
                 obj.deposit(depositamount);
                 break;
             case 3:
                 obj.checkbalance();
                 break;
             case 4:
                 System.out.println("Thank you! Have a nice day.");
                 break;
             default:
                 System.out.println("Invalid choice. Please make right choice.");
         }
        }while(choice!=4);
    }
}