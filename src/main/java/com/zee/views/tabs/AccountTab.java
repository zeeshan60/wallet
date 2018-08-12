package com.zee.views.tabs;

import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.dom.Element;
import com.zee.views.JournalView;

public class AccountTab extends Tab implements ITab {

    private Element layout;
    private JournalView journalView;

    public AccountTab(Element layout, JournalView journalView) {
        this.layout = layout;
        this.journalView = journalView;
    }

    @Override
    public void tabDidSelected() {

        layout.getChildren().forEach(e -> e.setVisible(false));
        journalView.setVisible(true);

    }
}
