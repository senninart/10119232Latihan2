package com.example.a10119232latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

//21 Juni 2022
//Muhammad Faisal Obara
//10119232
//IF 6

public class AlmostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost);
    }

    public void btnVerify(View view){
        Intent intent = new Intent(this, VerifyActivity.class);
        startActivity(intent);
    }
}