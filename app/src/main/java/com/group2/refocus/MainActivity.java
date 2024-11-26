package com.group2.refocus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchFocus(View view) {
        Intent intent = new Intent(this, FocusActivity.class);

        this.startActivity(intent);
    }

    public void launchBreak(View view) {
        Intent intent = new Intent(this, BreakActivity.class);

        this.startActivity(intent);
    }

    public void launchSettings(View view) {

        Intent intent = new Intent(this, SettingsActivity.class);

        this.startActivity(intent);
    }
}