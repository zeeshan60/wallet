package com.zee.models;

import java.util.Objects;

public class JournalEntry {

    private long id;
    private long journalId;
    private long accountId;
    private long amount;
    private boolean debit;
    private String title;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getJournalId() {
        return journalId;
    }

    public void setJournalId(long journalId) {
        this.journalId = journalId;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public boolean isDebit() {
        return debit;
    }

    public void setDebit(boolean debit) {
        this.debit = debit;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JournalEntry that = (JournalEntry) o;
        return id == that.id &&
                journalId == that.journalId &&
                accountId == that.accountId &&
                amount == that.amount &&
                debit == that.debit &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, journalId, accountId, amount, debit, title);
    }
}
