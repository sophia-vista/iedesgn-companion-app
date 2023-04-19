package com.example.escapevelocitycompanionapp.activities;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.escapevelocitycompanionapp.R;
import com.example.escapevelocitycompanionapp.models.Card;

public class CardInfoActivity extends AppCompatActivity {
    private ImageView ivCard;
    private ImageView ivCardIcon;
    private TextView tvCardName;
    private TextView tvCardType;
    private TextView tvCardDesc;
    private TextView tvCardNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_cardinfo);

        this.ivCard = findViewById(R.id.iv_card);
        this.ivCardIcon = findViewById(R.id.iv_card_icon_2);
        this.tvCardName = findViewById(R.id.tv_card_name);
        this.tvCardType = findViewById(R.id.tv_card_type);
        this.tvCardDesc = findViewById(R.id.tv_card_desc);
        this.tvCardNote = findViewById(R.id.tv_card_note);

        Intent i = this.getIntent();
        int ivCard = i.getIntExtra("KEY_CARD", 0);
        this.ivCard.setImageResource(ivCard);

        if (i.getIntExtra("KEY_TYPE", 0) == Card.GADGET_CARD) {
            String type = "GADGET CARD";
            this.tvCardType.setText(type);
            this.tvCardType.setTextColor(Color.rgb(81,236,70));
            getSupportActionBar().setTitle("Return to Gadget Cards");
        }
        else if (i.getIntExtra("KEY_TYPE", 0) == Card.PENALTY_CARD) {
            String type = "PENALTY CARD";
            this.tvCardType.setText(type);
            this.tvCardType.setTextColor(Color.rgb(204,18,43));
            getSupportActionBar().setTitle("Return to Penalty Cards");
        }

        else {
            String type = "EVENT CARD";
            this.tvCardType.setText(type);
            this.tvCardType.setTextColor(Color.rgb(193,52,192));
            getSupportActionBar().setTitle("Return to Event Cards");
        }

        this.ivCardIcon.setImageResource(i.getIntExtra("KEY_ICON", 0));
        this.tvCardName.setText(i.getStringExtra("KEY_NAME"));
        this.tvCardDesc.setText(i.getStringExtra("KEY_DESC"));
        this.tvCardNote.setText(i.getStringExtra("KEY_NOTE"));
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
}
