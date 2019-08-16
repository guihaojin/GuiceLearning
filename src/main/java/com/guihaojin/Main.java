package com.guihaojin;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new BillingModule());

        BillingService billingService = injector.getInstance(BillingService.class);
        billingService.bill();

        // test binding annotation
        ProcessingService processingService = injector.getInstance(ProcessingService.class);
        System.out.println(processingService.getProcessor().getClass().getSimpleName());

        // test @Named binding annotation
        CheckoutProcessingService checkoutProcessingService = injector.getInstance(CheckoutProcessingService.class);
        System.out.println(checkoutProcessingService.getProcessor().getClass().getSimpleName());

        // test instance binding
        billingService.printUrl();

        // test untargeted binding
        MyConcreteClass myConcreteClass = injector.getInstance(MyConcreteClass.class);
        System.out.println(myConcreteClass.getClass().getSimpleName());

        // test build-in binding
        TransactionLog transactionLog = injector.getInstance(TransactionLog.class);
        System.out.println(transactionLog.getClass().getSimpleName());
        ((ConsoleTransactionLog) transactionLog).logWarning("testing");

        // test just-in-time binding
        Charger charger = injector.getInstance(Charger.class);
        System.out.println(charger.getClass().getSimpleName());
    }
}
