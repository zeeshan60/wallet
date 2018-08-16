package com.zee.services;

import com.zee.models.Account;
import com.zee.models.Voucher;
import com.zee.providers.DummyAccounts;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class DummyAccountServiceImpl implements AccountService {
    @Override
    public CompletionStage<List<Account>> getAccounts() {
        return CompletableFuture.completedFuture(DummyAccounts.getAccounts());
    }

    @Override
    public CompletionStage<List<Voucher>> getVouchers() {
        return CompletableFuture.completedFuture(DummyAccounts.getVouchers());
    }
}
