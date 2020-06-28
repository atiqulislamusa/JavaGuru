import java.util.Scanner;

public class ATMTransaction
{
    //email: atiqul@hotmail.com
    //subject: ITPFUS Java 003 [Your Name] - subject
    //body: write your question
    public static void main(String args[])
    {
        double balance = 200;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter withdrawl amount: ");

        double withdrawlAmount = scan.nextDouble();

        if ( balance == 0 )
        {
            System.out.println("Customer, you cannot withdraw any more money");
        } else if ( withdrawlAmount <= balance ) {
            balance = balance - withdrawlAmount;
            System.out.println("Here is your $" + withdrawlAmount + ". Your current balance is $" + balance );

        } else if ( withdrawlAmount > balance ) {
            System.out.println("You do not have enough fund");
        }

        scan.close();
    }
}
