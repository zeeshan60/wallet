package com.zee.views.tabs;

import com.vaadin.flow.component.Component;
import com.zee.views.AccountView;

public class AccountTab extends AbstractTab {

    private AccountView accountView;

    public AccountTab(AccountView accountView) {
        super("Accounts");
        this.accountView = accountView;
        tabDidUnSelected();
    }

    public AccountTab() {
        this(new AccountView());
    }

    @Override
    public Component getView() {
        return accountView;
    }
}
