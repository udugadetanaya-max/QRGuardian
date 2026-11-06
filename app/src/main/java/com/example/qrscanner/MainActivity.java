package com.example.qrscanner;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnScan, btnHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnScan = findViewById(R.id.btnScan);
        btnHistory = findViewById(R.id.btnHistory);

        // Open QR Scanner screen
        btnScan.setOnClickListener(v -> {

            Intent intent = new Intent(
                    MainActivity.this,
                    ScannerActivity.class
            );

            startActivity(intent);
        });

        // History feature will be implemented later
        btnHistory.setOnClickListener(v -> {

            Toast.makeText(
                    MainActivity.this,
                    "Scan History coming soon!",
                    Toast.LENGTH_SHORT
            ).show();

        });
    }
}
