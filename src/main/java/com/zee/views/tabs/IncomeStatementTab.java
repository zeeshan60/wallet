package com.zee.views.tabs;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class IncomeStatementTab extends AbstractTab {

    private VerticalLayout view;

    public IncomeStatementTab(VerticalLayout view) {
        super("Income Statement");
        this.view = view;
        tabDidUnSelected();
    }

    public IncomeStatementTab() {
        this(new VerticalLayout(new Text("Income statement tab showing")));
    }

    @Override
    public Component getView() {
        return view;
    }
}
