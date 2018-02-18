package com.example.haryono.wildanfmh_1202150110_modul2;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    RadioGroup radio;
    RadioButton radioButton;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }
    public void onClick(View view) {
        radio = (RadioGroup)findViewById(R.id.radioGroup);
        int selected_id=radio.getCheckedRadioButtonId();
        radioButton = (RadioButton)findViewById(selected_id);
        String pilihan=radioButton.getText().toString();

        if(pilihan.equals("DINE IN")){
            Intent dienIn = new Intent(this, DineInActivity.class);
            startActivity(dienIn);
        }
        else if (pilihan.equals("TAKE AWAY")){
            Intent takeAway = new Intent(this, TakeAwayActivity.class);
            startActivity(takeAway);
        }
    }
}
