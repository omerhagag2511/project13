package com.example.project13;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    Switch swDN;
    RadioButton b1;
    RadioButton b2;
    RadioButton b3;
    RadioButton b4;
    ConstraintLayout layout;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        swDN = findViewById(R.id.swDN);
        layout = findViewById(R.id.layout);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);

    }
    public void next(View view){
        if (swDN.isChecked()) {
            layout.setBackgroundColor(Color.RED);
        }
        else{
            layout.setBackgroundColor(Color.GREEN);
        }
    }
    public void go(View view) {
        if (b1.isChecked()){
            layout.setBackgroundColor(Color.GRAY);
        }
        else if (b2.isChecked()){
            layout.setBackgroundColor(Color.BLUE);
        }
        else if (b3.isChecked()){
            layout.setBackgroundColor(Color.YELLOW);
        }
        else if (b4.isChecked()){
            layout.setBackgroundColor(Color.MAGENTA);
        }
    }
}
