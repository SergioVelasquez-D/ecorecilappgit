package com.sergio.ecoreciclaapp;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class RegistroMaActivity extends AppCompatActivity {

    private TextView textViewDate;
    private Button buttonSelectDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerma);

        textViewDate = findViewById(R.id.textViewDate);
        buttonSelectDate = findViewById(R.id.buttonSelectDate);

        buttonSelectDate.setOnClickListener(v -> showDatePickerDialog());




        Button btnEstadisticas = findViewById(R.id.estadisticasButton2);

        // Set an OnClickListener to the button
        btnEstadisticas.setOnClickListener(v -> {
            // Create an Intent to start MainActivity
            Intent intent = new Intent(RegistroMaActivity.this, EstadisticasActivity.class);
            // Start MainActivity
            startActivity(intent);
        });


    }

    private void showDatePickerDialog() {
        final Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this,
                (view, selectedYear, selectedMonth, selectedDay) -> {
                    // Nota: `selectedMonth` es 0-indexado (Enero es 0, Diciembre es 11)
                    String selectedDate = selectedDay + "/" + (selectedMonth + 1) + "/" + selectedYear;
                    textViewDate.setText(selectedDate);
                },
                year, month, day);
        datePickerDialog.show();
    }


}
