package com.guihaojin;

public class DatabaseProviderTransactionLog extends TransactionLog {
    private Connection connection;

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
