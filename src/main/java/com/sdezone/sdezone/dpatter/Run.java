package com.sdezone.sdezone.dpatter;

public class Run {
    public static void main(String[] args) {
        EagerInitializationSingleton.getInstance().singeltonTest();
        StaticBlocSingelton.getStaticBlocSingelton().singeltonTest();
        TreadSafeSingelton.getTreadSafeSingelton().getTreadSafeSingeltonTest();
    }
}
