package com.guihaojin;

import com.google.inject.ProvidedBy;
import com.guihaojin.providers.DatabaseTransactionLogProvider;

//@ProvidedBy(DatabaseTransactionLogProvider.class)
/* equivalent to:
 * bind(TransactionLog.class)
 *       .toProvider(DatabaseTransactionLogProvider.class);
 */
public class TransactionLog {

    public String transact() {
        return this.getClass().getSimpleName();
    }

}
