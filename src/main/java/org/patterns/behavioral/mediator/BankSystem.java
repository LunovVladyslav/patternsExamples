package org.patterns.behavioral.mediator;

public class BankSystem implements BankMediator{
    @Override
    public void createAccount(BankUser user) {
        System.out.println("%s account registered into the system".formatted(user.getName()));
    }

    @Override
    public void applyForLoan(BankUser user) {
        System.out.println("%s account applied for the loan".formatted(user.getName()));
    }
}
