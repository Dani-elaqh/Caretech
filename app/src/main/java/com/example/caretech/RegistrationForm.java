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
        TextView textFirstName = findViewById(R.id.textFirstName);
        TextView textLastName = findViewById(R.id.textLastName);
        TextView textEmail = findViewById(R.id.textEmail);

        EditText editTextFirstName = findViewById(R.id.editTextFirstName);
        EditText editTextLastName = findViewById(R.id.editTextLastName);
        EditText editTextEmail = findViewById(R.id.editTextDateOfBirth);

        textFirstName.setText("First Name: " + editTextFirstName.getText().toString());
        textLastName.setText("Last Name: " + editTextLastName.getText().toString());
        textEmail.setText("Email: " + editTextEmail.getText().toString());

    }
}