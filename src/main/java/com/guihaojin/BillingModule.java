package com.guihaojin;

import com.google.inject.AbstractModule;

public class BillingModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(TransactionLog.class).to(DatabaseTransactionLog.class);
    }
}
