package com.devera.studentlogin;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Spinner;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(R.layout.activity_main);
        Spinner spinnerProgram = findViewById(R.id.spinnerProgram);

        String[] programs = {
                "Select Program",
                "BSCS-ML",
                "BSCS-DF"
        };

        ArrayAdapter<String> programAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                programs
        );

        programAdapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item
        );

        spinnerProgram.setAdapter(programAdapter);

        Spinner spinnerYear = findViewById(R.id.spinnerYearLevel);

        String[] years = {
                "Select Year Level",
                "1st Year",
                "2nd Year",
                "3rd Year",
                "4th Year"
        };

        ArrayAdapter<String> yearAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                years
        );

        yearAdapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item
        );

        spinnerYear.setAdapter(yearAdapter);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}