package com.example.scansure.data;

public class SessionManager {

    private static String eventName;
    private static String duration;
    private static boolean isActive = false;

    public static void startSession(String event, String dur) {
        eventName = event;
        duration = dur;
        isActive = true;
    }

    public static boolean isActive() {
        return isActive;
    }

    public static String getEventName() {
        return eventName;
    }

    public static String getDuration() {
        return duration;
    }
}