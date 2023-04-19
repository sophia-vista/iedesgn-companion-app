package com.example.escapevelocitycompanionapp.viewholders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.escapevelocitycompanionapp.R;
import com.example.escapevelocitycompanionapp.models.Card;

import org.jetbrains.annotations.NotNull;

public class CardViewHolder extends RecyclerView.ViewHolder {
    private final ImageView ivcardicon;
    private final TextView tvcardname;
    private final ConstraintLayout layout;
    public CardViewHolder(@NonNull @NotNull View itemView) {
        super(itemView);

        this.ivcardicon = itemView.findViewById(R.id.iv_card_icon);
        this.tvcardname = itemView.findViewById(R.id.tv_card_name);
        this.layout = itemView.findViewById(R.id.cl_template_card);
    }

    public void setCardName(String name) {
        this.tvcardname.setText(name);
    }
    public void setCardIcon(int id) {
         this.ivcardicon.setImageResource(id);
    }

    public View getConstraintLayout() {
        return this.layout;
    }
}
