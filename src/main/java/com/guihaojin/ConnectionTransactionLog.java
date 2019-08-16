package com.guihaojin;

import com.google.inject.Inject;

public class ConnectionTransactionLog extends TransactionLog {
    private Connection connection;

    public ConnectionTransactionLog(Connection connection) {
        this.connection = connection;
    }
}
