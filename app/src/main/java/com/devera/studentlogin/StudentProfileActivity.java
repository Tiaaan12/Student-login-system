package com.devera.studentlogin;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowCompat;

public class StudentProfileActivity extends AppCompatActivity {

    Spinner spinnerProgram, spinnerYear;
    Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(R.layout.activity_student_profile);

        spinnerProgram = findViewById(R.id.spinnerProgram);
        spinnerYear = findViewById(R.id.spinnerYearLevel);
        btnLogout = findViewById(R.id.btnLogout);

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

        btnLogout.setOnClickListener(v -> {
            Intent intent = new Intent(
                    StudentProfileActivity.this,
                    MainActivity.class
            );

            intent.setFlags(
                    Intent.FLAG_ACTIVITY_CLEAR_TOP |
                            Intent.FLAG_ACTIVITY_NEW_TASK
            );

            startActivity(intent);
            finish();
        });
    }
}