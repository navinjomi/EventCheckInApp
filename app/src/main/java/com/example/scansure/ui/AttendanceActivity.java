package com.example.scansure.ui;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.scansure.R;
import com.example.scansure.data.AttendanceRepository;
import java.util.Map;

public class AttendanceActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);

        TextView txt = findViewById(R.id.txtAttendance);

        AttendanceRepository repo = new AttendanceRepository(this);
        Map<String, ?> data = repo.getAll();

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, ?> e : data.entrySet()) {
            sb.append("• ").append(e.getKey()).append("\n");
        }

        int i = 1;
        for (Map.Entry<String, ?> entry : data.entrySet()) {
            sb.append(i++)
                    .append(". ")
                    .append(entry.getKey())
                    .append("\n");
        }

        txt.setText(sb.toString());
    }
}