package com.zee.views;

import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.Route;

@HtmlImport("styles/shared-styles.html")
@Route("")
public class AccountContainerView extends VerticalLayout {

    JournalView journalView;
    public AccountContainerView() {
        Tab accountTab = new Tab("Accounts");
        Tab balanceSheetTab = new Tab("Balance Sheet");
        Tab incomeStatementTab = new Tab("Income Statement");
        Tab journalTab = new Tab("Journal");

        Tabs tabs = new Tabs(accountTab, balanceSheetTab, incomeStatementTab, journalTab);

        tabs.addSelectedChangeListener(e -> {
           switch (tabs.getSelectedIndex()) {
               case 0:
                   accountTabSelected();
                   break;
               case 1:
                   balanceSheetTabSelected();
                   break;
               case 2:
                   incomeStatementTabSelected();
                   break;
               case 3:
                   journalTabSelected();
                   break;
           }
        });

        add(tabs);
        journalView = new JournalView();
        add(journalView);
        setSizeFull();
        setAlignItems(Alignment.CENTER);
    }

    private void journalTabSelected() {
        journalView.setVisible(true);
    }

    private void incomeStatementTabSelected() {
        journalView.setVisible(false);
    }

    private void balanceSheetTabSelected() {
        journalView.setVisible(false);
    }

    private void accountTabSelected() {
        journalView.setVisible(false);
    }
}
