package com.company;

import Card.BankCard;
import Card.CreditCard;

public class Main {

    public static void main(String[] args) {
      BankCard Card1 = new BankCard("PRIVAT_BANK", "Vasya", 1234567890, "1111", 1000, 1);
      Card1.ATM(Card1);   // Check
      CreditCard Card2 = new CreditCard("PRIVAT_BANK", "Vasya", 1234567890, "1111", 1000, 1);
      Card2.ATM (Card2);  // Check
       // Card2.ATM (Card2);  // Check
    }
}
