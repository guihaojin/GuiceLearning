package com.guihaojin.providers;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.guihaojin.Connection;
import com.guihaojin.DatabaseProviderTransactionLog;
import com.guihaojin.TransactionLog;

public class DatabaseTransactionLogProvider implements Provider<TransactionLog> {

    private final Connection connection;

    @Inject
    public DatabaseTransactionLogProvider(Connection connection) {
        this.connection = connection;
    }

    public TransactionLog get() {
        DatabaseProviderTransactionLog transactionLog = new DatabaseProviderTransactionLog();
        transactionLog.setConnection(this.connection);
        return transactionLog;
    }

}
