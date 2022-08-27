package com.sdezone.sdezone.dpatter.Singelton;

public class StaticBlocSingelton {
    private static StaticBlocSingelton staticBlocSingelton;

    private StaticBlocSingelton() {
    }

    static {
        try {
            staticBlocSingelton = new StaticBlocSingelton();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static StaticBlocSingelton getStaticBlocSingelton() {
        return staticBlocSingelton;
    }

    public void singeltonTest() {
        System.out.println("Static block Singelton method çalıştı.");
    }
}

/*
 * EagerinitialSingelton ile static block singelton uygulama ayaga kaltığında
 * heap memoryde çalışır ve beklerler.
 */