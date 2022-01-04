package Card;

import ATM.ATM;

public class CreditCard extends BankCard {
    public CreditCard(String nameOfBank, String nameOwner, int numberOfCreditCard, String pinCode, int balance, int blocking) {
        super(nameOfBank, nameOwner, numberOfCreditCard, pinCode, balance, blocking);
    }

    public void ATM (CreditCard card) {
        ATM.ATM (card);
    }
}




