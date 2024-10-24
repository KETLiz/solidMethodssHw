package org.example;

public class Washing1 implements Wipping{

    @Override
    public void wipMirrows() {
        System.out.println("Протирка зеркал на мойке №1");
    }

    @Override
    public void wipWindshield() {
        System.out.println("Протирка лобового стекла на мойке №1");
    }

    @Override
    public void wipHeadLights() {
        System.out.println("Протирка фар на мойке №1");
    }
}
