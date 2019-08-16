package com.guihaojin;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Named;
import com.google.inject.name.Names;
import com.guihaojin.providers.DatabaseTransactionLogProvider;

// bindings in modules are called *explicit bindings*.
public class BillingModule extends AbstractModule {

    @Override
    protected void configure() {

//        // this binding is duplicate with the @Provider method binding
//        bind(TransactionLog.class).to(DatabaseTransactionLog.class); // linked binding

        bind(CreditCardProcessor.class)
                .annotatedWith(Paypal.class) // binding annotation
                .to(PayPalCreditCardProcessor.class);

        bind(CreditCardProcessor.class)
                .annotatedWith(Names.named("Checkout")) // named binding annotation
                .to(CheckoutCreditCardProcessor.class);

        bind(String.class)
                .annotatedWith(Names.named("JDBC URL"))
                .toInstance("jdbc:mysql://localhost/pizza");

//        // Provider binding
//        bind(TransactionLog.class)
//                .toProvider(DatabaseTransactionLogProvider.class);

        // untargeted binding
        bind(MyConcreteClass.class);

//        // Constructor binding
//        try {
//            bind(TransactionLog.class)
//                    .toConstructor(ConnectionTransactionLog.class.getConstructor(Connection.class));
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        }

        // built-in binding
        bind(TransactionLog.class).to(ConsoleTransactionLog.class);

        // binding for method injection
        bind(String.class)
                .annotatedWith(Names.named("Paypal API key"))
                .toInstance("paypal_api_key");
    }

//    // @Providers method
//    @Provides
//    TransactionLog provideTransactionLog() {
//        AwsTransactionLog transactionLog = new AwsTransactionLog();
//        transactionLog.setId("abc");
//        return transactionLog;
//    }
}
