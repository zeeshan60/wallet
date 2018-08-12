package com.zee.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class Menu extends HorizontalLayout {

    public Menu() {

        Button accountBtn = new Button("Accounts", event -> {
        });
        Button balanceSheetBtn = new Button("Balance Sheet", event -> {
        });
        Button incomeStatementBtn = new Button("Income Statement", event -> {
        });
        Button journalBtn = new Button("Journal", event -> {
        });

        add(accountBtn, balanceSheetBtn, incomeStatementBtn, journalBtn);
    }
}
