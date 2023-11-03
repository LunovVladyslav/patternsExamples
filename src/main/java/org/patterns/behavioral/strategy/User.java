package org.patterns.behavioral.strategy;

public class User {
    private Browser browser;

    public User(Browser browser) {
        this.browser = browser;
    }

    public void setBrowser(Browser browser) {
        this.browser = browser;
    }

    public void useBrowser() {
        this.browser.use();
    }
}
