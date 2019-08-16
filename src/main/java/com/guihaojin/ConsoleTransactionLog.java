package com.guihaojin;

import java.util.logging.Logger;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton // scope, by default Guice return a new instance each time it supplies a value.
public class ConsoleTransactionLog extends TransactionLog {

    private final Logger logger;

    @Inject // Constructor injection
    public ConsoleTransactionLog(Logger logger) { // built-in binding for `java.util.logging.Logger`.
        this.logger = logger;
    }

    public void logWarning(String message) {
        logger.warning("WARNING: " + message);
    }
}
