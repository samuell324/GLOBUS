package com.example.javaoop_globus;

import android.util.Log;

public class Wind extends Instrument {
    String mode;
    String keyboardType;
    String material;

    public Wind() {

    }


    public Wind(String mode, String keyboardType, String material) {
        this.mode = mode;
        this.keyboardType = keyboardType;
        this.material = material;
    }


    public void review() {
        Log.i("review()", "This instrument use key board type: " + keyboardType + " and has :" + mode + " mode, material - " + material);
    }


}
