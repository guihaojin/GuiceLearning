package com.guihaojin;

import javax.inject.Named;

import com.google.inject.Inject;

public class ProcessingService {

    private final CreditCardProcessor processor;

    @Inject
    public ProcessingService(@Paypal CreditCardProcessor processor) {
        this.processor = processor;
    }

    CreditCardProcessor getProcessor() {
        return this.processor;
    }
}
