package com.rccars.controller;

import java.io.Serial;
public class SerialNumberGenerator {

    private static SerialNumberGenerator generate;
    private int startValue;
    private String prefixValue;
    private String modelValue;

    public static synchronized SerialNumberGenerator getInstance() {
        if(generate == null ) {
            generate = new SerialNumberGenerator();
        }
        return generate;
    }

    private SerialNumberGenerator(){}

    public synchronized void startGeneration(String UPC,int startNumber, String modelNumber){
        prefixValue = UPC;
        startValue = startNumber;
        modelValue =modelNumber;
    }
    public synchronized String getNextSerial() {
        return prefixValue + (++startValue);
    }

    public synchronized int getRecentNumber() {
        return startValue;
    }
}// End Class
