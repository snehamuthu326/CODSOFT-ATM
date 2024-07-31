import java.util.HashMap;
import java.util.Map;
import java.io.*;
import java.util.*;

class bankAccount {

    int pin;
    String no;
    Scanner wi = new Scanner(System.in);

    HashMap<String, Integer> map = new HashMap< String, Integer>();

    public void wel() {

        map.put("123456789000", 9000);
        map.put("098765432111", 2111);
        map.put("246813571234", 1234);
        map.put("135713571357", 1357);

        int attempt = 3;

        System.out.print("Swipe your card or Enter your card number(12 digits): ");
        no = wi.nextLine();

        if (!map.containsKey(no)) {
            System.out.println("***No such Card number Available!!!");
            wel();
        } else {

            do {
                System.out.print("Enter your PIN: ");
                pin = wi.nextInt();

                if (map.containsValue(pin) == true) {
                    return;
                } else {
                    System.out.println("***Enter valid PIN number*** ");
                    attempt--;
                }

            } while (attempt != 0 || !map.containsValue(pin));

            while (attempt == 0) {
                System.out.println("***Your Card has been Locked***");
                wel();
            }
        }
    }

    public static void main(String args[]) {

        ATM obj = new ATM();
        bankAccount acc = new bankAccount();
        System.out.println("**********************************************");
        System.out.println("            Welcome to ATM");
        System.out.println("**********************************************");
        Scanner wit = new Scanner(System.in);
        acc.wel();
        System.out.println("**********************************************");
        System.out.println("1.WithDraw  2.Deposite  3.CheckBalance  4.Exit");
        int ch;

        do {
            System.out.print("Enter your Choice: ");
            ch = wit.nextInt();

            switch (ch) {
                case 1:
                    obj.withdraw();
                    break;
                case 2:
                    obj.deposite();
                    break;
                case 3:
                    obj.checkBalance();
                    break;
                default:
                System.out.println("***********************************");
                System.out.println("Thank You for using our ATM-Service");
                System.out.println("***********************************");
                    break;
            }
        } while (ch < 5);
    }
}
