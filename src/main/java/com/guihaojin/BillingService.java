package com.guihaojin;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class BillingService {

    private final TransactionLog transactionLog;

    @Inject @Named("JDBC URL")
    private String url;

    @Inject
    BillingService(TransactionLog transactionLog) {
        this.transactionLog = transactionLog;
    }

    public void bill() {
        System.out.println("BillingService bill, transaction log: " + transactionLog.transact());
    }

    public void printUrl() {
        System.out.println(url);
    }
}
