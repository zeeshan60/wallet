package com.zee.providers;

import com.zee.models.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DummyAccounts {

    private static List<Account> accounts = getAccounts();
    private static List<Voucher> vouchers = getVouchers();

    public static List<Account> getAccounts() {

        if (accounts == null) {
            accounts = new ArrayList<>();
            accounts.add(getCreditAccount("Food", AccountCategory.EXPENSE));
            accounts.add(getCreditAccount("Home", AccountCategory.EXPENSE));
            accounts.add(getCreditAccount("House", AccountCategory.EXPENSE));
            accounts.add(getCreditAccount("Other", AccountCategory.EXPENSE));
            accounts.add(getDebitAccount("DBS", AccountCategory.BANK));
            accounts.add(getDebitAccount("Cash", AccountCategory.BANK));
        }
        return accounts;
    }

    public static List<Voucher> getVouchers() {
        getAccounts();
        if (vouchers == null) {
            vouchers = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                vouchers.add(getVoucher());
            }
        }

        return vouchers;
    }

    private static Voucher getVoucher() {
        Voucher voucher = new Voucher();
        voucher.setEntries(getVoucherEntries());
        voucher.setDate(new Date());
        voucher.setDesciption("My first voucher");
        return voucher;
    }

    private static List<VoucherEntry> getVoucherEntries() {
        List<VoucherEntry> entries = new ArrayList<>();
        entries.add(getVoucherDebitEntry());
        entries.add(getVoucherCreditEntry());
        return entries;
    }

    private static VoucherEntry getVoucherDebitEntry() {
        VoucherEntry voucherEntry = new VoucherEntry();
        voucherEntry.setAccount(accounts.stream().filter(a -> a.getTitle().equals("Food")).findAny().get());
        voucherEntry.setAmount(21);
        voucherEntry.setDebit(true);
        voucherEntry.setTitle("KFC meal");
        return voucherEntry;
    }

    private static VoucherEntry getVoucherCreditEntry() {
        VoucherEntry voucherEntry = new VoucherEntry();
        voucherEntry.setAccount(accounts.stream().filter(a -> a.getTitle().equals("Cash")).findAny().get());
        voucherEntry.setAmount(21);
        voucherEntry.setDebit(false);
        return voucherEntry;
    }

    private static Account getCreditAccount(String name, AccountCategory category) {
        Account account = getAccount(name, category);
        account.setType(AccountType.CREDIT);
        return account;
    }

    private static Account getDebitAccount(String name, AccountCategory category) {
        Account account = getAccount(name, category);
        account.setType(AccountType.DEBIT);
        return account;
    }

    private static Account getAccount(String name, AccountCategory category) {
        Account account = new Account();
        account.setTitle(name);
        account.setCategory(category);
        return account;
    }
}
