package com.example.likingapp.utils;

import android.app.Application;

import com.example.likingapp.migrations.CreateOwnUserMigration;

import se.emilsjolander.sprinkles.Sprinkles;

public class LikingApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Sprinkles sprinkles = Sprinkles.init(getApplicationContext());

        sprinkles.addMigration(new CreateOwnUserMigration());
    }
}
