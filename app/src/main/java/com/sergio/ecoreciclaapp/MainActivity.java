package com.sergio.ecoreciclaapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        Button btnCategorias = findViewById(R.id.categoriasButton);

        // Set an OnClickListener to the button
        btnCategorias.setOnClickListener(v -> {
            // Create an Intent to start MainActivity
            Intent intent = new Intent(MainActivity.this, CategoriasActivity.class);
            // Start MainActivity
            startActivity(intent);
        });


        Button btnEstadisticas = findViewById(R.id.estadisticasButton);

        // Set an OnClickListener to the button
        btnEstadisticas.setOnClickListener(v -> {
            // Create an Intent to start MainActivity
            Intent intent = new Intent(MainActivity.this, EstadisticasActivity.class);
            // Start MainActivity
            startActivity(intent);
        });


        Button btnDesafios = findViewById(R.id.desafiosButton);

        // Set an OnClickListener to the button
        btnDesafios.setOnClickListener(v -> {
            // Create an Intent to start MainActivity
            Intent intent = new Intent(MainActivity.this, DesafioActivity.class);
            // Start MainActivity
            startActivity(intent);
        });


        Button btnConsejos = findViewById(R.id.consejosButton);

        // Set an OnClickListener to the button
        btnConsejos.setOnClickListener(v -> {
            // Create an Intent to start MainActivity
            Intent intent = new Intent(MainActivity.this, ConsejosActivity.class);
            // Start MainActivity
            startActivity(intent);
        });

        // Find the button by its ID
        Button btnConfiguration = findViewById(R.id.configButton);

        // Set an OnClickListener to the button
        btnConfiguration.setOnClickListener(v -> {
            // Create an Intent to start MainActivity
            Intent intent = new Intent(MainActivity.this, ConfiguracionActivity.class);
            // Start MainActivity
            startActivity(intent);
        });
    }
}