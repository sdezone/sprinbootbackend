package com.sdezone.sdezone.dpatter;

public class LazySingelton {

    public static LazySingelton lazySingelton;

    private LazySingelton() {
    }

    public static LazySingelton getLazySingeltonInstance() {
        if (lazySingelton == null)
            lazySingelton = new LazySingelton();
        return lazySingelton;
    }

    public void getInstanceTest() {
        System.out.println("LazySigelton çalisti.");
    }
}
