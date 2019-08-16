package com.guihaojin;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class CheckoutProcessingService extends ProcessingService {

    @Inject
    public CheckoutProcessingService(@Named("Checkout") CreditCardProcessor processor) {
        super(processor);
    }

}
