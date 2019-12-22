package com.example.javaoop_globus;

import android.util.Log;

public class Stringed extends Instrument {
    int numberOfStrings;
    String instrumentType;


    public Stringed(int numberOfStrings, String instrumentType) {
        this.numberOfStrings = numberOfStrings;
        this.instrumentType = instrumentType;
    }

    public void reviewS() {
        Log.i("reviewS()", "This instrument has " + instrumentType + " type and has " + numberOfStrings + " strings");
    }
}