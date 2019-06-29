package com.kamau.gabriel.converterapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void convert(View view){
    EditText editText=findViewById(R.id.converttext);

    String message=editText.getText().toString();
    double temp=Double.parseDouble(message);
    double kelvin=temp+273;
    String k= String.valueOf(kelvin);
    TextView textView=findViewById(R.id.txt);
        textView.setText(k);
}}
