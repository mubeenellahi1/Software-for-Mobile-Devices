package com.example.it.smd_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button relativeLayoutButton;
    Button contraintLayoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayoutButton = (Button) findViewById(R.id.button);
        contraintLayoutButton = (Button)findViewById(R.id.button2);

    }

    public void onClick1(View view){

        Intent i = new Intent(this,relative_layout_activity.class);
        startActivity(i);

    }

    public void onClick2(View view){

        Intent i2 = new Intent(this,constraint_layout_activity.class);
        startActivity(i2);
    }
}
