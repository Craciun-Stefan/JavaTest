package Inheritance;
// 1. Use inheritance to create a program that will include a Bank Account, a Credit Card account and a Savings Account
// 2. The default amount for each account can be 0
// 3. All classes can print the “Account details:” message
// 4. Provide the following values for each of the 2 accounts:t

/*
Credit Card account:
    - amount = 10000
    - fee = 5
Savings Account:
    - amount = 2500
    - interest = 3.75
*/
// 5. Print the following statements and values, in a separate class called “ExInherit”:
    /*
        - "Account details:"

    For Credit Card account, print:
        - "Credit card amount $:" + assigned value
        - "Credit card monthly fee $:" + assigned value

    For Savings Account, print:
        - "Savings account amount $:" + assigned value
        - "Savings account amount %:" + assigned value
    */
public class ExInheritance {
    public static void main(String[] args) {


        BankAccount valori = new BankAccount();
        valori.infoAccount();
        SavingsAccount valSavings = new SavingsAccount();
        CreditCard valCredit = new CreditCard();
        System.out.println("Valoare Savings: " + valSavings.amount);
        System.out.println("Interest rate: " + valSavings.interest);
        System.out.println("Valoare Credit " + valCredit.amount);
        System.out.println("Fee: " + valCredit.fee);
    }

}
