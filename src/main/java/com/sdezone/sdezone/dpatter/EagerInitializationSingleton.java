package com.sdezone.sdezone.dpatter;

public class EagerInitializationSingleton {
    private static final EagerInitializationSingleton INSTANCE_EAGER_INITIALIZATION_SINGLETON = new EagerInitializationSingleton();

    private EagerInitializationSingleton() {
    }

    public static EagerInitializationSingleton getInstance() {
        return INSTANCE_EAGER_INITIALIZATION_SINGLETON;
    }

    public void singeltonTest() {
        System.out.println("Eager Singelton method çalıştı.");
    }
}

/*
 * BU nesne sadece memomry problemini çözmektedir. Dezavantajı ise
 * ihtiyacımız olmayan durumda da static final keywordlerinden dolayı bir nesne
 * oluşmaktadır.
 */