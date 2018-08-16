package com.zee.views.tabs;

import com.vaadin.flow.component.Component;
import com.zee.views.JournalView;

public class JournalTab extends AbstractTab {

    private JournalView journalView;

    public JournalTab(JournalView journalView) {
        super("Journal");
        this.journalView = journalView;
        tabDidUnSelected();
    }

    public JournalTab() {
        this(new JournalView());
    }

    @Override
    public Component getView() {
        return journalView;
    }
}
