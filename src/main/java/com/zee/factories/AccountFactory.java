package com.zee.factories;

import com.zee.services.AccountService;

public abstract class AccountFactory {

    private static AccountFactory factory;

    public static synchronized AccountFactory factory() {
        if (factory == null) {
            factory = new DummyAccountFactory();
        }
        return factory;
    }

    public static void setFactory(AccountFactory factory) {
        AccountFactory.factory = factory;
    }

    public abstract AccountService getAccountService();
}
