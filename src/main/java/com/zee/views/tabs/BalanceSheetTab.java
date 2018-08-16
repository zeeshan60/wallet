package com.zee.views.tabs;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class BalanceSheetTab extends AbstractTab {

    private VerticalLayout view;

    public BalanceSheetTab(VerticalLayout view) {
        super("Balance Sheet");
        this.view = view;
        tabDidUnSelected();
    }

    public BalanceSheetTab() {
        this(new VerticalLayout(new Text("Balance sheet tab showing")));
    }

    @Override
    public Component getView() {
        return view;
    }
}
