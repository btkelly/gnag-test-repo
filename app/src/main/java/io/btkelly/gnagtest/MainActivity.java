package io.btkelly.gnagtest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            Log.e("TEST", "Should fail Gnag Check");
        } catch (Exception e) {

        }
    }
}
