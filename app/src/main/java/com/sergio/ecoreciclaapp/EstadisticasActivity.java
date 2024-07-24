package com.sergio.ecoreciclaapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class EstadisticasActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadistics);



        Button btnConsejos = findViewById(R.id.consejosButton2);

        // Set an OnClickListener to the button
        btnConsejos.setOnClickListener(v -> {
            // Create an Intent to start MainActivity
            Intent intent = new Intent(EstadisticasActivity.this, ConsejosActivity.class);
            // Start MainActivity
            startActivity(intent);
        });


    }


}
