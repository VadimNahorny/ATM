package com.company;

import ATM.ATM;
import Card.CreditCard;

public class Main {

    public static void main(String[] args) {
      ATM atm = new ATM();
    ////  BankCard Card1 = new BankCard("PRIVAT_BANK", "Vasya", 1234567890, "1111", 1000, 1);
     /////atm.ATM1(Card1);   // Check
      CreditCard Card2 = new CreditCard("PRIVAT_BANK", "Vasya", 1234567890, "1111", 1000, 1); // Check
      atm.ATM2(Card2);   // Check
       // Card2.ATM (Card2);  // Check
    }
}
