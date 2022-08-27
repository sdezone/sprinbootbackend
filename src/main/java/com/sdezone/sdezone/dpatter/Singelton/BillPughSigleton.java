package com.sdezone.sdezone.dpatter.Singelton;

public class BillPughSigleton {
    private BillPughSigleton() {
    }

    private static class SingeltonHelper {
        private static final BillPughSigleton I_SIGLETON = new BillPughSigleton();
    }

    public static BillPughSigleton getInstance() {
        return SingeltonHelper.I_SIGLETON;
    }

    public void BillPughSigeltonTest() {
        System.out.println("Bill Pugh test calisti.");
    }
}
