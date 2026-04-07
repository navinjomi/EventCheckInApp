package com.example.scansure.data;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;

public class AttendanceRepository {

    private SharedPreferences prefs;

    public AttendanceRepository(Context context) {
        prefs = context.getSharedPreferences("AttendanceDB", Context.MODE_PRIVATE);
    }

    public boolean isCheckedIn(String id) {
        return prefs.contains(id);
    }

    public void save(String id) {
        prefs.edit().putLong(id, System.currentTimeMillis()).apply();
    }

    public Map<String, ?> getAll() {
        return prefs.getAll();
    }
}