package com.example.scansure.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.scansure.R;
import com.example.scansure.data.SessionManager;

public class SessionActivity extends AppCompatActivity {

    EditText edtEvent, edtDuration;
    Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session);

        edtEvent = findViewById(R.id.edtEvent);
        edtDuration = findViewById(R.id.edtDuration);
        btnStart = findViewById(R.id.btnStart);

        btnStart.setOnClickListener(v -> {
            String event = edtEvent.getText().toString();
            String duration = edtDuration.getText().toString();

            SessionManager.startSession(event, duration);

            startActivity(new Intent(this, MainActivity.class));
            finish();
        });
    }
}