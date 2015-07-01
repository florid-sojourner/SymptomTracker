package com.volcomj.symptomtracker;

import android.os.Handler;
import android.widget.TextView;

/**
 * Created by Justin on 6/30/2015.
 */
public class AddHeadache implements Runnable{

    private Handler callerHandler;
    private TextView display;

    public AddHeadache(Handler mainActivityHandler, TextView displayLabel) {
        this.callerHandler = callerHandler;
        this.display = display;
    }

    public void run() {

        callerHandler.post(new Runnable() {
            @Override
            public void run() {
                //display.setText("12 May 2007, 4:03 PM");
            }
        });
    }
}
