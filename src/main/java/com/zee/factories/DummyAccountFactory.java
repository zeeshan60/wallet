package com.zee.factories;

import com.zee.services.AccountService;
import com.zee.services.DummyAccountServiceImpl;

public class DummyAccountFactory extends AccountFactory {

    @Override
    public AccountService getAccountService() {
        return new DummyAccountServiceImpl();
    }
}
