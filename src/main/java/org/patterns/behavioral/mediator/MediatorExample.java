package org.patterns.behavioral.mediator;

public class MediatorExample {
    public static void main(String[] args) {
        BankMediator oldSystem = new BankSystem();
        BankMediator newSystem = new AnotherBankSystem();

        BankUser user1 = new BankUser("John", oldSystem);
        BankUser user2 = new BankUser("Alice", oldSystem);

        user1.createAccount();
        user1.applyForLoan();
        user2.createAccount();
        user2.applyForLoan();

        user1.setBankMediator(newSystem);
        user2.setBankMediator(newSystem);

        user1.createAccount();
        user1.applyForLoan();
        user2.createAccount();
        user2.applyForLoan();

    }
}
