package com.example.escapevelocitycompanionapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.escapevelocitycompanionapp.R;
import com.example.escapevelocitycompanionapp.adapters.CardAdapter;
import com.example.escapevelocitycompanionapp.data.CardDataHelper;
import com.example.escapevelocitycompanionapp.models.Card;

import java.util.ArrayList;

public class GadgetCardsActivity extends AppCompatActivity {
    private ArrayList<Card> gadgetCards;
    private RecyclerView rvGadgetCards;
    private CardAdapter cardAdapterGadget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Gadget Cards");
        setContentView(R.layout.activity_cardslist);
        this.initializeRecyclerView();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // API 5+ solution
                onBackPressed();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
    private void initializeRecyclerView() {
        this.rvGadgetCards = findViewById(R.id.rv_cards);
        this.rvGadgetCards.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        this.gadgetCards = (new CardDataHelper().getGadgetCardsList());

        this.cardAdapterGadget = new CardAdapter(gadgetCards);
        this.rvGadgetCards.setAdapter(this.cardAdapterGadget);
    }
}
