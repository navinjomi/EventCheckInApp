#  ScanSure – QR-Based EventCheckerApp

## Team Members

* **Navin Jomi K**
* **Nishith**
* **Alan**

---

## Project Overview

**ScanSure** is an Android-based application that simplifies attendance tracking using QR code scanning. It ensures structured, time-stamped, and session-controlled attendance recording for events.

---

##  Key Features

###  Session Creation

* Create a session with:

  * Event Name
  * Duration
* Ensures attendance is recorded only during an active session

---

### 📷 QR Code Scanning

* Scan QR codes for attendance
* Simple and fast check-in process

---

### Time-Stamped Entries

* Automatically records entry time
* Provides accurate attendance tracking

---

### Structured Attendance List

* Displays attendees in:

  * Numbered format (1, 2, 3…)
  * With entry timestamps

#### Example:

```
1. Rahul – 10:01 AM
2. Sneha – 10:03 AM
3. Arjun – 10:07 AM
```

---

### Session Validation

* Prevents scanning before session starts
* Ensures controlled and reliable attendance logging

---

## Working Flow

1. Launch the application
2. Create a session
3. Navigate to scanning
4. Scan QR code
5. Confirm check-in
6. View attendance list

---

## Project Structure

```
com.example.scansure
│
├── data/
│   ├── SessionManager.java
│   ├── AttendanceRepository.java
│
├── ui/
│   ├── SessionActivity.java
│   ├── MainActivity.java
│   ├── ScanActivity.java
│   ├── ConfirmActivity.java
│   ├── AttendanceActivity.java
│
├── utils/
│   ├── ScanUtils.java
```

---

##  Technologies Used

* Java (Android Development)
* Android SDK
* SharedPreferences (Local Storage)
* QR Code Scanner Integration

---

##  Installation & Setup

1. Clone the repository:

```
git clone https://github.com/YOUR-USERNAME/YOUR-REPO-NAME.git
```

2. Open in Android Studio

3. Sync Gradle

4. Run the app on:

   * Emulator OR
   * Physical Android device

---

##  Future Enhancements

* Duplicate entry prevention
* Session expiry timer
* Export attendance (PDF/Excel)
* Cloud-based database

---

##  License

This project is developed for academic purposes.
