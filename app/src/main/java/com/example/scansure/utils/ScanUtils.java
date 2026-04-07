package com.example.scansure.utils;

public class ScanUtils {

    public static boolean isValid(String data) {
        return data != null && !data.trim().isEmpty();
    }

    public static String clean(String data) {
        return data.trim();
    }
}