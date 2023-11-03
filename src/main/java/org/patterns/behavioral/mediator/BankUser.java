package org.patterns.behavioral.mediator;

public class  BankUser {
    private String name;
    private BankMediator bankMediator;

    public BankUser(String name, BankMediator bankMediator) {
        this.name = name;
        this.bankMediator = bankMediator;
    }

    public String getName() {
        return name;
    }

    public void setBankMediator(BankMediator bankMediator) {
        this.bankMediator = bankMediator;
    }

    public void createAccount() {
        bankMediator.createAccount(this);
    }

    public void applyForLoan() {
        bankMediator.applyForLoan(this );
    }
}
