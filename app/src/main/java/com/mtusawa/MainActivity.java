package com.mtusawa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textViewSawa= (TextView)findViewById(R.id.text_sawa);
        textViewSawa.setText(sawa());
    }
    public String sawa(){
        int date = (int) new Date().getTime();
        int result = date % 2;
        if (result==0)
            return "YOU ARE SAWA";
        else
            return "YOU ARE NOT SAWA";
    }
}
