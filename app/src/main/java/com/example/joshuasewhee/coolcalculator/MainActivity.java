package com.example.joshuasewhee.coolcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Function called when 7 is pressed
    public void ButtonSevenPressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        result.setText(R.string.seven);
    }

    // Function called when 8 is pressed
    public void ButtonEightPressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        result.setText(R.string.eight);
    }

    // Function called when 9 is pressed
    public void ButtonNinePressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        result.setText(R.string.nine);
    }

}
