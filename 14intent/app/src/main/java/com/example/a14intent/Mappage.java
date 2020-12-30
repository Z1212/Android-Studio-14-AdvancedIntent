package com.example.a14intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Mappage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mpapage);
        Intent map = new Intent(Intent.ACTION_VIEW);
        startActivity(map);
        finish();//開啟後關閉XML
    }
}