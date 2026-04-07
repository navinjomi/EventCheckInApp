package com.example.scansure.ui;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.scansure.R;
import com.example.scansure.data.AttendanceRepository;

public class ConfirmActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        String data = getIntent().getStringExtra("DATA");

        TextView text = findViewById(R.id.txtData);
        Button btn = findViewById(R.id.btnConfirm);

        AttendanceRepository repo = new AttendanceRepository(this);

        if (repo.isCheckedIn(data)) {
            text.setText("❌ Already Checked-in\n" + data);
            btn.setEnabled(false);
        } else {
            text.setText("Scan: " + data);
        }

        String currentTime = new java.text.SimpleDateFormat("hh:mm a")
                .format(new java.util.Date());

        repo.save(data + " - " + currentTime);

        btn.setOnClickListener(v -> {
            repo.save(data);
            text.setText("✅ Checked-in\n" + data);
            btn.setEnabled(false);
        });
    }
}