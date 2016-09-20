package com.example.syedinkisarahmed.fourthassignment;

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
    public void display(View v){
        Submit(1);
    }
    public void Submit(int a){
        TextView tx =(TextView) findViewById(R.id.txt);
        tx.setText(""+a);
    }
}
