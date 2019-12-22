package com.example.javaoop_globus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    Wind myWind;
    Stringed myStringed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myWind = new Wind("labial", "static", "copper");
        myWind.review();

        Wind flute = new Wind("labial", "none", "wood");
        flute.review();
        flute.stock();

        Wind trombone = new Wind();
        trombone.mode = "mouthpiece";
        trombone.keyboardType = "dynamic";
        trombone.numberOfKeys = 0;
        trombone.material = "copper";
        trombone.review();
        Log.i("numberOfKeys()", "number of keys:  " + trombone.numberOfKeys);

        Trumpet trumpet = new Trumpet();
        trumpet.stock();
        trumpet.keyboardType = "static";
        trumpet.mode = "mouthpiece";
        trumpet.material = "copper";
        trumpet.numberOfKeys = 3;
        trumpet.review();
        trumpet.inStock = true;
        Log.i("stock()", "Keyboard type: " + trumpet.keyboardType +", mode: " + trumpet.mode + ", " + trumpet.stock());

        Stringed guitar = new Stringed(7, "plucked");
        guitar.reviewS();

    }
}
