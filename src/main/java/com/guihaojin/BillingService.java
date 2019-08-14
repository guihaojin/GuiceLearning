package com.guihaojin;

import com.google.inject.Inject;

public class BillingService {

    private final TransactionLog transactionLog;

    @Inject
    BillingService(TransactionLog transactionLog) {
        this.transactionLog = transactionLog;
    }

    public void bill() {
        System.out.println("BillingService bill, transaction log: " + transactionLog.transact());
    }
}
