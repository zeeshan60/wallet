package com.zee;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@HtmlImport("styles/shared-styles.html")
@Route("")
public class LeftMenu extends VerticalLayout {

    public LeftMenu() {

        HorizontalLayout horizontalLayout = new HorizontalLayout();
        Button accountBtn = new Button("Accounts", event -> {
        });
        Button balanceSheetBtn = new Button("Balance Sheet", event -> {
        });
        Button incomeStatementBtn = new Button("Income Statement", event -> {
        });
        Button journalBtn = new Button("Journal", event -> {
        });

        horizontalLayout.add(accountBtn, balanceSheetBtn, incomeStatementBtn, journalBtn);

        setSizeFull();
        setAlignItems(Alignment.CENTER);
        add(horizontalLayout);
    }
}
