package com.sergio.ecoreciclaapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CategoriasActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        Button btnRegPapel = findViewById(R.id.buttonPapel);

        // Set an OnClickListener to the button
        btnRegPapel.setOnClickListener(v -> {
            // Create an Intent to start MainActivity
            Intent intent = new Intent(CategoriasActivity.this, RegistroMaActivity.class);
            // Start MainActivity
            startActivity(intent);
        });

        Button btnRegPlastico = findViewById(R.id.buttonPlastico);

        // Set an OnClickListener to the button
        btnRegPlastico.setOnClickListener(v -> {
            // Create an Intent to start MainActivity
            Intent intent = new Intent(CategoriasActivity.this, RegistroMaActivity.class);
            // Start MainActivity
            startActivity(intent);
        });

        Button btnRegMetales = findViewById(R.id.buttonMetales);

        // Set an OnClickListener to the button
        btnRegMetales.setOnClickListener(v -> {
            // Create an Intent to start MainActivity
            Intent intent = new Intent(CategoriasActivity.this, RegistroMaActivity.class);
            // Start MainActivity
            startActivity(intent);
        });

        Button btnRegVidrio = findViewById(R.id.buttonVidrio);

        // Set an OnClickListener to the button
        btnRegVidrio.setOnClickListener(v -> {
            // Create an Intent to start MainActivity
            Intent intent = new Intent(CategoriasActivity.this, RegistroMaActivity.class);
            // Start MainActivity
            startActivity(intent);
        });


        Button btnDesafios = findViewById(R.id.desafiosButton);

        // Set an OnClickListener to the button
        btnDesafios.setOnClickListener(v -> {
            // Create an Intent to start MainActivity
            Intent intent = new Intent(CategoriasActivity.this, DesafioActivity.class);
            // Start MainActivity
            startActivity(intent);
        });



    }


}
