package com.azvk.nationalhockeyteams;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.activity_registration, new RegistrationFragment())
                    .commit();
        }
    }
}
