package ATM;

import Card.BankCard;
import Card.CreditCard;
import ServicedBank.ServicedBank;

import java.util.Scanner;

import static java.lang.String.valueOf;

public class ATM {
    public static int a = 0;
    public static int servicedBank1 = 1; /// 1 - serviced, 0 - not serviced.
    ServicedBank servicedBank;

    public ATM (ServicedBank servicedBank) {
        this.servicedBank =  servicedBank;
    }

    public static int checkBank(BankCard card) {

        for (ServicedBank nameOfBank : ServicedBank.values()) {
            if (nameOfBank.name1.equals(card.nameOfBank)) {
               servicedBank1 = 1;
               break;
            }
            else {
            servicedBank1 = 0;
        }
    }
        if (servicedBank1 == 0) {
        System.out.print("Your bank card is not served at this ATM. Take your card.");
    }
return servicedBank1;
}

    public static int enterPinCode(BankCard card) {
        if (servicedBank1 == 1) {
            if (card.blocking == 1) {
                Scanner s = new Scanner(System.in);
                System.out.print("Enter pin code");
                for (int i = 0; i < 3; i++) {
                    if (s.next().equals(card.pinCode)) {
                        a = 1;
                        break;
                    } else {
                        a = 2;
                        if (i < 2) {
                            System.out.println("You enter invalid pin-code. You have " + (2 - i) + " attempts to enter. Enter pin-code");
                        }
                        if (i == 2) {
                            System.out.println("You enter invalid pin-code. Your card was blocked.");
                            card.blocking = 0;
                        }
                    }
                }
                return a;
            } else if (card.blocking == 0) {
                System.out.println("Your card was blocked. You can not work with it");

            }
        }
        return a;
    }


    public static int workWithAtm(BankCard card) {
        if (a == 1) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Choose operation: 1.checking the balance of money 2.Get cash 3.Take card");
            switch (sc1.nextInt()) {
                case 1:
                    checkingBalance(card);
                    System.out.println("You want to do other operation: 1.Yes 2.No");
                    switch (sc1.nextInt()) {
                        case 1:
                            return workWithAtm(card);
                        case 2:
                            System.out.println("Take your card");
                            break;
                    }
                    break;
                case 2:
                    getCash(card);
                    System.out.println("You want to do other operation: 1.Yes 2.No");
                    switch (sc1.nextInt()) {
                        case 1:
                            return workWithAtm(card);
                        case 2:
                            System.out.println("Take your card");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Take your card");
                    break;
            }
        }
        return 0;
    }

    public static int workWithAtm(CreditCard card) {
        if (a == 1) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Choose operation: 1.checking the balance of money 2.Get cash 3.Take card");
            switch (sc1.nextInt()) {
                case 1:
                    checkingBalance(card);
                    System.out.println("You want to do other operation: 1.Yes 2.No");
                    switch (sc1.nextInt()) {
                        case 1:
                            return workWithAtm(card);
                        case 2:
                            System.out.println("Take your card");
                            break;
                    }
                    break;
                case 2:
                    getCash(card);
                    System.out.println("You want to do other operation: 1.Yes 2.No");
                    switch (sc1.nextInt()) {
                        case 1:
                            return workWithAtm(card);
                        case 2:
                            System.out.println("Take your card");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Take your card");
                    break;
            }
        }
        return 0;
    }


    public static void checkingBalance(BankCard card) {
        System.out.println(card.balance);
    }

    public static double getCash(BankCard card) {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter number of money");
        double a = sc2.nextDouble();
        if (a <= card.balance) {
            card.balance = card.balance - a;
            System.out.println("Take your many." + "\n" + "Balance of money on the card: " + card.balance); ///// проверка работы
            return card.balance;
        } else {
            System.out.println("You haven't enough money");
            return getCash(card);
        }
    }

    public static double getCash(CreditCard card) {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter number of money");
        double a = sc2.nextInt();
        double x = card.balance - a;
        if (a <= card.balance) {
            card.balance = card.balance - a;
            System.out.println("Take your many." + "\n" + "Balance of money on the card: " + card.balance); ///// проверка работы
        } else if (x < 0 && x >= -1000) {
            System.out.println("You haven't enough money. You want to take credit. 1. Yes 2. No");
            switch (sc2.nextInt()) {
                case 1:
                    card.balance = card.balance - a;
                    System.out.println("Take your many." + "\n" + "Balance of money on the card: " + card.balance); ///// проверка работы
                    break;

                case 2:
                    break;

            }
        } else {
            System.out.println("You haven't enough money. Your credit agreement does not allow to issue a credit over 1000");
            return getCash(card);
        }
        return card.balance;
    }

    public static void ATM (BankCard card) {
        checkBank(card);
        enterPinCode(card);
        workWithAtm(card);
    }

    public static void  ATM (CreditCard card) {
        checkBank(card);
        enterPinCode(card);
        workWithAtm(card);
    }
}

