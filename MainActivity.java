package com.example.googletv;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle b) {
        super.onCreate(b);

        TextView text = new TextView(this);
        text.setText("HELLO GOOGLE TV!");
        text.setTextSize(40);
        text.setTextColor(Color.WHITE);
        text.setGravity(17);
        text.setBackgroundColor(Color.BLACK);

        setContentView(text);
    }
}
