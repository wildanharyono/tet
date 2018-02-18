package com.example.haryono.wildanfmh_1202150110_modul2;


import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TakeAwayActivity extends AppCompatActivity {

    private EditText name, phone, alamat, catatan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);

        //melakukan inisiasi dengan menggunakan id
        name = (EditText) findViewById(R.id.name);
        phone = (EditText) findViewById(R.id.phone);
        alamat = (EditText) findViewById(R.id.alamat);
        catatan = (EditText) findViewById(R.id.catatan);
    }

    public void onClick(View view) {

        String nama = name.getText().toString();
        String telepon = phone.getText().toString();
        String alamat = this.alamat.getText().toString();
        String catatan = this.catatan.getText().toString();


        if (nama.isEmpty()|| telepon.isEmpty() || alamat.isEmpty() || catatan.isEmpty()){
            Toast.makeText(this,"Wajib di Isi",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "Nama :"+nama+ " telepon : "+ telepon+ " alamat : "+alamat+" catatan : "+catatan,
                    Toast.LENGTH_LONG).show();
            Intent next = new Intent(this,MenuActivity.class);
            startActivity(next);
        }

    }
    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.date_picker));
    }

    public void showTimePickerDialog(View view) {

        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.time_picker));
    }


    public void processDatePickerResult(int year, int month, int day) {
        String month_string = Integer.toString(month+1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        String dateMessage = (month_string + "/" +
                day_string + "/" + year_string);
        Toast.makeText(this, "Nama :"+name.getText().toString()+"Date: " + dateMessage,
                Toast.LENGTH_SHORT).show();

    }

    public void processTimePickerResult(int hourOfDay, int minute) {
        String hour_string = Integer.toString(hourOfDay);
        String minute_string = Integer.toString(minute);
        String timeMessage = (hour_string + ":" + minute_string);
        Toast.makeText(this, "Nama :"+name.getText().toString()+ "Time: " + timeMessage,
                Toast.LENGTH_SHORT).show();
    }
}