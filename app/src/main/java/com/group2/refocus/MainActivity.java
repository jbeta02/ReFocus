package com.group2.refocus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchFocus(View view) {
        Intent intent = new Intent(this, Focus.class);

        this.startActivity(intent);
    }

    public void launchBreak(View view) {
        Intent intent = new Intent(this, Break.class);

        this.startActivity(intent);
    }

    public void launchSettings(View view) {

        Intent intent = new Intent(this, SettingsActivity.class);

        this.startActivity(intent);
    }
}