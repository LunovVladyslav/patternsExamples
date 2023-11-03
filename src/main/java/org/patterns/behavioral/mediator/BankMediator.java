package org.patterns.behavioral.mediator;

public interface BankMediator {
    void createAccount(BankUser user);
    void applyForLoan(BankUser user);
}
