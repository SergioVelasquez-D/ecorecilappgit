package com.sergio.ecoreciclaapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class BienvenidaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        // Establecer un retraso de 2 segundos
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Iniciar la actividad de inicio de sesión
                Intent intent = new Intent(BienvenidaActivity.this, LoginActivity.class);
                startActivity(intent);
                // Cerrar la actividad de bienvenida
                finish();
            }
        }, 2000); // 2000 milisegundos = 2 segundos
    }
}
