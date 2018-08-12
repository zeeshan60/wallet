package com.zee.services;

import com.zee.models.Account;
import com.zee.models.Voucher;

import java.util.List;
import java.util.concurrent.CompletionStage;

public interface AccountService {

    CompletionStage<List<Account>> getAccounts();
    CompletionStage<List<Voucher>> getVouchers();
}
