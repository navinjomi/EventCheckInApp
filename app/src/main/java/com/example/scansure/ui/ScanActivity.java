package com.example.scansure.ui;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.journeyapps.barcodescanner.ScanContract;
import com.journeyapps.barcodescanner.ScanOptions;
import com.example.scansure.utils.ScanUtils;

public class ScanActivity extends AppCompatActivity {

    private ActivityResultLauncher<String> permissionLauncher;
    private ActivityResultLauncher<ScanOptions> scannerLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!com.example.scansure.data.SessionManager.isActive()) {
            android.widget.Toast.makeText(this, "Session not started", android.widget.Toast.LENGTH_SHORT).show();
            finish();
        }

        // Scanner launcher
        scannerLauncher = registerForActivityResult(new ScanContract(), result -> {
            String data = result.getContents();

            if (!ScanUtils.isValid(data)) return;

            Intent intent = new Intent(this, ConfirmActivity.class);
            intent.putExtra("DATA", data.trim());
            startActivity(intent);
            finish();
        });

        // Permission launcher
        permissionLauncher = registerForActivityResult(
                new ActivityResultContracts.RequestPermission(),
                isGranted -> {
                    if (isGranted) {
                        startScan();
                    }
                });

        // Check permission
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
                == PackageManager.PERMISSION_GRANTED) {
            startScan();
        } else {
            permissionLauncher.launch(Manifest.permission.CAMERA);
        }
    }

    private void startScan() {
        ScanOptions options = new ScanOptions();
        options.setPrompt("Scan QR Code");
        scannerLauncher.launch(options);
    }
}