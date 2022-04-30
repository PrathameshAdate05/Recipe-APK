package com.prathamesh.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Splash_Screen extends AppCompatActivity {

    ImageView IV_Splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        IV_Splash = findViewById(R.id.IV_Splash);
        Glide.with(this).load(R.drawable.splash).into(IV_Splash);
    }
}