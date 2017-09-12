package ru.iojs.geovk;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import ru.iojs.geovk.R;

/**
 * Created by evfrosiniyazerminova on 12.09.17.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.CardViewHolder> {

    private ArrayList<Card> cards;

    static class CardViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;

        CardViewHolder(CardView cv) {
            super(cv);
            cardView = cv;
        }
    }

    RVAdapter(ArrayList<Card> cards){
        this.cards = cards;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview, parent, false);
        return new CardViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(CardViewHolder cardViewHolder, int position) {
        CardView cardView = cardViewHolder.cardView;
        TextView title = (TextView)cardView.findViewById(R.id.title);
        title.setText(cards.get(position).title);
        TextView content = (TextView)cardView.findViewById(R.id.content);
        content.setText(cards.get(position).content);

    }

    @Override
    public int getItemCount() {
        return cards.size();
    }
}
