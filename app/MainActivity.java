package com.example.googletv;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle b) {
        super.onCreate(b);

        TextView t = new TextView(this);
        t.setText("HELLO GOOGLE TV!");
        t.setTextSize(40);
        t.setTextColor(Color.WHITE);
        t.setGravity(Gravity.CENTER);
        t.setBackgroundColor(Color.BLACK);

        setContentView(t);
    }
}
