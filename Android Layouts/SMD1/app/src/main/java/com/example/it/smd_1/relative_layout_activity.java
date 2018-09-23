package com.example.it.smd_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class relative_layout_activity extends AppCompatActivity {

    CheckBox termsAndConditions;
    EditText emailTw;
    EditText passwordTw;
    RadioButton maleRB;
    RadioGroup genderRG;
    RadioButton femaleRB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout_activity);

        termsAndConditions = (CheckBox) findViewById(R.id.termsCB);
        emailTw = (EditText) findViewById(R.id.emailTW2);
        passwordTw = (EditText) findViewById(R.id.passwordRB2);
        maleRB = (RadioButton) findViewById(R.id.maleRB2);
        femaleRB = (RadioButton) findViewById(R.id.femaleRB2);

    }

    public void onClick1(View view) {

        if (emailTw.getText().length() == 0){

            Toast.makeText(this,"Please write an email",Toast.LENGTH_SHORT).show();
        }

        else if (passwordTw.getText().length() == 0){

            Toast.makeText(this,"Please write a password",Toast.LENGTH_SHORT).show();
        }

        else if (!maleRB.isChecked() && !femaleRB.isChecked()){

            Toast.makeText(this,"Please select a gender",Toast.LENGTH_SHORT).show();
        }

        else if (termsAndConditions.isChecked()) {

            String gender = "None";
            if (maleRB.isChecked()) {

                gender = "Male";
            } else if (femaleRB.isChecked())
                gender = "female";


            String details = "Email : " + emailTw.getText().toString() +
                    "\nPassword :" + passwordTw.getText().toString() +
                    "\nGender : " + gender +
                    "\nTerms and conditions : Checked";

            Toast.makeText(this, details, Toast.LENGTH_SHORT).show();
        } else {

            Toast.makeText(this, R.string.notChecked, Toast.LENGTH_SHORT).show();
        }

    }
}
