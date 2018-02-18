package com.example.haryono.wildanfmh_1202150110_modul2;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class DineInActivity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {

    private static final String TAG = DineInActivity.class.getSimpleName() ;
    private String mSpinnerLabel = "";


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        Spinner spinner = (Spinner) findViewById(R.id.label_spinner);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.labels_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);

        if (spinner != null) {
            spinner.setAdapter(adapter);
        }

    }
    public void showText(View view) {
        EditText editText = (EditText) findViewById(R.id.name);
        if (editText != null) {
            String showString = (editText.getText().toString() + " memilih " + mSpinnerLabel);
            Toast.makeText(this, showString, Toast.LENGTH_SHORT).show();

            Intent a = new Intent(DineInActivity.this, MenuActivity.class);
            startActivity(a);

        }
    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int
            i, long l) {
        mSpinnerLabel = adapterView.getItemAtPosition(i).toString();
        showText(view);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        Log.d(TAG, "onNothingSelected: ");
    }
}


