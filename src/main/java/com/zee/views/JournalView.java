package com.zee.views;

import com.vaadin.flow.component.grid.Grid;
import com.zee.factories.AccountFactory;
import com.zee.models.VoucherEntry;

import java.util.stream.Collectors;

public class JournalView extends Grid<VoucherEntry> {

    public static final int MAX_ITEMS = 10;

    public JournalView() {

        addColumn(VoucherEntry::getTitle).setHeader("Title");
        addColumn(v -> v.getAccount().getCategory()).setHeader("Account");
        addColumn((v) -> v.isDebit() ? v.getAmount() : "").setHeader("Debit");
        addColumn((v) -> !v.isDebit() ? v.getAmount() : "").setHeader("Credit");

        AccountFactory.factory().getAccountService().getVouchers().thenAcceptAsync(
                vouchers -> setItems(vouchers.subList(0, MAX_ITEMS).stream().flatMap(v -> v.getEntries().stream()).collect(Collectors.toList()))
        );
        setHeightByRows(true);

    }
}
