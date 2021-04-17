package com.example.caretech;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class RegistrationForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_form);
    }
    //Listener button register
    public void onRegisterBtnClick (View view){
        TextView editTextTextPersonPPS = findViewById(R.id.editTextTextPersonPPS);
        TextView editTextFirstName = findViewById(R.id.editTextFirstName);
        TextView editTextLastName = findViewById(R.id.editTextLastName);
        TextView editTextTextPersonCountry = findViewById(R.id.editTextTextPersonCountry);
        TextView editTextDateOfBirth = findViewById(R.id.editTextDateOfBirth);


        EditText editTextFirstName = findViewById(R.id.editTextFirstName);
        EditText editTextLastName = findViewById(R.id.editTextLastName);
        EditText editTextDateOfBirth = findViewById(R.id.editTextDateOfBirth);

        editTextTextPersonPPS.setText("PPS Number: " + editTextTextPersonPPS.getText().toString());
        editTextFirstName.setText("First Name: " + editTextFirstName.getText().toString());
        editTextLastName.setText("Last Name: " + editTextLastName.getText().toString());
        editTextTextPersonCountry.setText("Country: " + editTextTextPersonCountry.getText().toString());
        editTextDateOfBirth.setText("Country: " + editTextDateOfBirth.getText().toString());

    }
}