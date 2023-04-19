package com.example.escapevelocitycompanionapp.activities;

import android.content.Intent;
import android.os.Bundle;

import com.example.escapevelocitycompanionapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.escapevelocitycompanionapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        ImageButton btn_event = findViewById(R.id.ib_event);
        btn_event.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, EventCardsActivity.class));
            }
        });

        ImageButton btn_gadget = findViewById(R.id.ib_gadget);
        btn_gadget.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, GadgetCardsActivity.class));
            }
        });

        ImageButton btn_penalty = findViewById(R.id.ib_penalty);
        btn_penalty.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PenaltyCardsActivity.class));
            }
        });
    }
}