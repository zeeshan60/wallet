package com.zee.factories;

import com.zee.services.AccountService;
import com.zee.services.AccountServiceImpl;

public class DummyAccountFactory extends AccountFactory {

    @Override
    public AccountService getAccountService() {
        return new AccountServiceImpl();
    }
}
