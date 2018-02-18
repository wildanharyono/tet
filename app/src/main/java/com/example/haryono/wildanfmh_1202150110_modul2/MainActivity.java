package com.example.haryono.wildanfmh_1202150110_modul2;


import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static int SPLASH_TIME_OUT=4000; //Inisiasi splash

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() { //inisiasi handler
            @Override
            public void run() { //inisiasi method run
                Intent homeIntent = new Intent(MainActivity.this, HomeActivity.class); //inisiasi intent
                startActivity(homeIntent);  //memanggil method start
                finish(); //memanggil method finish
            }
        },SPLASH_TIME_OUT); //tag penutup splash
    }
}
