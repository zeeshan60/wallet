package com.zee.views.tabs;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.tabs.Tab;

public abstract class AbstractTab extends Tab implements ITab {
    protected AbstractTab(String title) {
        super(title);
    }

    @Override
    public void tabDidSelected() {

        try {
            getView().setVisible(true);
        } catch (Exception ex) {

        }
    }

    @Override
    public void tabDidUnSelected() {

        try{

            getView().setVisible(false);
        } catch (Exception ex) {

        }
    }

    public abstract Component getView();
}
