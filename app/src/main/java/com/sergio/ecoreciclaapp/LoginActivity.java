package com.sergio.ecoreciclaapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        // Setting up edge-to-edge
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.login), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Find the button by its ID
        Button btnLogin = findViewById(R.id.InicioButton);

        // Set an OnClickListener to the button
        btnLogin.setOnClickListener(v -> {
            // Create an Intent to start MainActivity
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            // Start MainActivity
            startActivity(intent);
        });

        // Find the button by its ID
        Button btnRegister = findViewById(R.id.registerButton);

        // Set an OnClickListener to the button
        btnRegister.setOnClickListener(v -> {
            // Create an Intent to start MainActivity
            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            // Start MainActivity
            startActivity(intent);
        });
    }
}