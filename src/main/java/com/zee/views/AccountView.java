package com.zee.views;

import com.vaadin.flow.component.grid.Grid;
import com.zee.factories.AccountFactory;
import com.zee.models.Account;

public class AccountView extends Grid<Account> {

    public static final int MAX_ITEMS = 10;

    public AccountView() {

        addColumn(Account::getTitle).setHeader("Title");
        addColumn(Account::getCategory).setHeader("Account");

        AccountFactory.factory().getAccountService().getAccounts().thenAcceptAsync(
                this::setItems
        );
        setHeightByRows(true);

    }
}
