package com.guihaojin;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class PayPalCreditCardProcessor extends CreditCardProcessor {

    private static final String DEFAULT_API_KEY = "dev_api_key";

    private String apiKey = DEFAULT_API_KEY;

    @Inject // method injection
    public void setApiKey(@Named("Paypal API key") String apiKey) {
        System.out.println("Setting Paypal API key to: " + apiKey);
        this.apiKey = apiKey;
    }
}
