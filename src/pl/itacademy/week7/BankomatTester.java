package pl.itacademy.week7;

import java.math.BigDecimal;

public class BankomatTester {
    public static void main(String[] args) {
        Account debitAccount = new DebitAccount();
        Account creditAccount = new CreditAccount(BigDecimal.valueOf(1000));

        System.out.println(debitAccount.getAccountNumber());
        System.out.println(creditAccount.getAccountNumber());

        //create accounts
        //create banks
        //create cards. put account numbers into cards
        //put bank names into cards
        //register accounts in banks
        //register banks in bank registrator
        //
        //create different ATMs (bankomat, wplatomat, bankomat+wplatomat)
        // try to top-up, withdraw different cards with different bankomats
    }
}
