package com.example.a14intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click_phone(View v){
        Intent phone = new Intent(this, Phonepage.class);
        startActivity(phone);//開啟播號介面輸入設定號碼
    }
    public void click_map(View v){
        Intent map = new Intent(this, Mappage.class);
        startActivity(map);//開啟Google Map
    }
    public void click_web(View v){
        Intent web = new Intent(this, Webpage.class);
        startActivity(web);//開啟瀏覽器

    }
}