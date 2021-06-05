package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button btn;
    public TextView txtView;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button19);
        txtView=findViewById(R.id.textView4);
    }

    public void Magic(View view) {


        txtView.setText("I have changed during your blink");
    }

}