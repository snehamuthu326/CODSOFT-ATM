
import java.util.*;

public class ATM {

    int amount, balance = 0, pin;
    Scanner with = new Scanner(System.in);

    int withdraw() {

        if (balance != 0) {
            System.out.print("Enter Withdrawal amount: ");
            amount = with.nextInt();

            if (amount >= (balance - 500)) {
                System.out.println("***Insufficient Balance***");
            } else {
                this.balance = balance - amount;
                System.out.println("You Successfully Withdrawn your Amount");
            }

            return balance;
        } else {
            System.out.println("***Insufficient Balance***");
        }

        checkBalance();
        return balance;
    }

    int deposite() {
        System.out.print("Enter Amount Deposited: ");
        amount = with.nextInt();
        this.balance = balance + amount;
        System.out.println("Your Amount has been Deposited");
        return balance;
    }

    int checkBalance() {
        System.out.println("Your Account Balance is " + balance);
        return balance;
    }

}
