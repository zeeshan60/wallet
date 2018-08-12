package com.zee.models;

import java.util.Objects;

public class Account {

    private long id;
    private String title;
    private AccountCategory category;
    private AccountType type;
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public AccountCategory getCategory() {
        return category;
    }

    public void setCategory(AccountCategory category) {
        this.category = category;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id &&
                Objects.equals(title, account.title) &&
                category == account.category &&
                type == account.type &&
                Objects.equals(description, account.description);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, title, category, type, description);
    }
}
