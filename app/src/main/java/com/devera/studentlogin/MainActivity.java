package com.devera.studentlogin;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowCompat;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(v -> {
            Intent intent = new Intent(
                    MainActivity.this,
                    StudentProfileActivity.class
            );
            startActivity(intent);
        });
    }
}