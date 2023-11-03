package org.patterns.behavioral.mediator;

public class AnotherBankSystem implements BankMediator {

    @Override
    public void createAccount(BankUser user) {
        System.out.println("%s account registered into new bank system successfully".formatted(user.getName()));
    }

    @Override
    public void applyForLoan(BankUser user) {
        System.out.println("%s account applied for loan into new bank system successfully".formatted(user.getName()));
    }
}
