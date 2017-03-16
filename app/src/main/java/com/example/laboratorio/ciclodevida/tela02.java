package com.example.laboratorio.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class tela02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela02);

        String msg = getIntent().getStringExtra("resultado");

    }
}
