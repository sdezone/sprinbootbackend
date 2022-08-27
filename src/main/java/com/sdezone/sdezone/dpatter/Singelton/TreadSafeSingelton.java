package com.sdezone.sdezone.dpatter.Singelton;

public class TreadSafeSingelton {

    private static TreadSafeSingelton treadSafeSingelton;

    private TreadSafeSingelton() {
    }

    // synchronized label or keyword will be helpfull for multitread application.
    public static synchronized TreadSafeSingelton getTreadSafeSingelton() {
        if (treadSafeSingelton == null) {
            treadSafeSingelton = new TreadSafeSingelton();
        }
        return treadSafeSingelton;
    }

    public void getTreadSafeSingeltonTest() {
        System.out.println("Tread Safe Singelton pattern");
    }
}
