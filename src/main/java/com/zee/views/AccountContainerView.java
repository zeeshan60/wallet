package com.zee.views;

import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.Route;
import com.zee.views.tabs.*;

@HtmlImport("styles/shared-styles.html")
@Route("")
public class AccountContainerView extends VerticalLayout {

    private ITab currentTab;

    public AccountContainerView() {
        AccountTab accountTab = new AccountTab();
        BalanceSheetTab balanceSheetTab = new BalanceSheetTab();
        IncomeStatementTab incomeStatementTab = new IncomeStatementTab();
        JournalTab journalTab = new JournalTab();

        currentTab = accountTab;
        currentTab.tabDidSelected();
        AbstractTab[] theTabs = {accountTab, balanceSheetTab, incomeStatementTab, journalTab};
        Tabs tabs = new Tabs(theTabs);

        tabs.addSelectedChangeListener(e -> {

            AbstractTab selectedTab = theTabs[tabs.getSelectedIndex()];
            selectedTab.tabDidSelected();
            currentTab.tabDidUnSelected();
            currentTab = selectedTab;
        });

        add(tabs);
        for (AbstractTab theTab : theTabs) {

            add(theTab.getView());
        }
        setSizeFull();
        setAlignItems(Alignment.CENTER);
    }
}
