package com.guihaojin;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new BillingModule());

        BillingService billingService = injector.getInstance(BillingService.class);

        billingService.bill();
    }
}
