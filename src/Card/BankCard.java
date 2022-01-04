package Card;

import ATM.ATM;


public class BankCard {
        public String nameOfBank;
        int  numberOfCreditCard;
        String nameOwner;
        public String pinCode;
        public int balance;
        public int blocking;

        public BankCard(String nameOfBank, String nameOwner, int numberOfCreditCard, String pinCode, int balance, int blocking) {
                this.nameOfBank = nameOfBank;
                this.nameOwner = nameOwner;
                this.numberOfCreditCard = numberOfCreditCard;
                this.pinCode = pinCode;
                this.balance = balance;
                this.blocking = blocking; //// 0 - blocked, 1 - not blocked;
        }
        public void ATM (BankCard card) {
                ATM.ATM (card);
        }
        }
