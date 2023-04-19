package com.example.escapevelocitycompanionapp.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.escapevelocitycompanionapp.R;
import com.example.escapevelocitycompanionapp.activities.CardInfoActivity;
import com.example.escapevelocitycompanionapp.models.Card;
import com.example.escapevelocitycompanionapp.viewholders.CardViewHolder;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class CardAdapter extends RecyclerView.Adapter<CardViewHolder>{
    private ArrayList<Card> cards;

    public CardAdapter(ArrayList<Card> cards) {
        this.cards = cards;
    }

    @NonNull
    @NotNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.template_card, parent, false);

        CardViewHolder vh = new CardViewHolder(view);

        vh.getConstraintLayout().setOnClickListener(view1 -> {
            Intent i = new Intent(view.getContext(), CardInfoActivity.class);
            i.putExtra("KEY_NAME", cards.get(vh.getBindingAdapterPosition()).getName());
            i.putExtra("KEY_ICON", cards.get(vh.getBindingAdapterPosition()).getIcon());
            i.putExtra("KEY_CARD", cards.get(vh.getBindingAdapterPosition()).getCard());
            i.putExtra("KEY_TYPE", cards.get(vh.getBindingAdapterPosition()).getType());
            i.putExtra("KEY_DESC", cards.get(vh.getBindingAdapterPosition()).getDescription());
            i.putExtra("KEY_NOTE", cards.get(vh.getBindingAdapterPosition()).getNote());

            view.getContext().startActivity(i);
        });

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        holder.setCardName(this.cards.get(position).getName());
        holder.setCardIcon(this.cards.get(position).getIcon());
    }

    @Override
    public int getItemCount() {
        return this.cards.size();
    }
}
