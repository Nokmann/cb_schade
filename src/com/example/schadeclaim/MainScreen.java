package com.example.schadeclaim;

import android.app.Activity;
import android.os.Bundle;
import org.apache.cordova.*;

public class MainScreen extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }

}
