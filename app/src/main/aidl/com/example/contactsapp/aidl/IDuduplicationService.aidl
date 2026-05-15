package com.example.contactsapp.aidl;


interface IDuduplicationService {
    void startDeduplication();
    boolean isRunning();
    int getStatus();
}