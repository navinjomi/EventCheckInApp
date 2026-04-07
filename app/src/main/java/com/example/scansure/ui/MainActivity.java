package com.example.scansure.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.scansure.R;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnScan).setOnClickListener(v ->
                startActivity(new Intent(this, ScanActivity.class)));

        findViewById(R.id.btnView).setOnClickListener(v ->
                startActivity(new Intent(this, AttendanceActivity.class)));
    }
}