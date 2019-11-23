package pl.itacademy.week7;

import pl.itacademy.week7.accounts.Account;
import pl.itacademy.week7.accounts.CreditAccount;
import pl.itacademy.week7.accounts.DebitAccount;

import java.math.BigDecimal;

public class BankomatTester {
    public static void main(String[] args) {
        Bank ing = new Bank("ING");
        BankRegistrator.registerBank(ing);

        Account debitAccount = new DebitAccount();
        Account creditAccount = new CreditAccount(BigDecimal.valueOf(1000));
        ing.addAccount(debitAccount);
        ing.addAccount(creditAccount);

        System.out.println(debitAccount.getAccountNumber());
        System.out.println(creditAccount.getAccountNumber());

        Card debitCard = new Card("123", ing.getName(), debitAccount.getAccountNumber());
        Card creditCard = new Card("234", ing.getName(), creditAccount.getAccountNumber());

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
