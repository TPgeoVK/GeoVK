package ru.iojs.geovk;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;


public class BlogActivity extends AppCompatActivity {

    public ArrayList<Card> cards;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        rv=(RecyclerView)findViewById(R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        initializeData();
        initializeAdapter();
    }


    private void initializeData(){
        cards = new ArrayList<>();
        cards.add(new Card("Card 1", "Content 1"));
        cards.add(new Card("Card 2", "Content 2"));
        cards.add(new Card("Card 3", "Content 3"));
        cards.add(new Card("Card 4", "Content 4"));
        cards.add(new Card("Card 5", "Content 5"));
        cards.add(new Card("Card 6", "Content 6"));
        cards.add(new Card("Card 7", "Content 7"));
        cards.add(new Card("Card 8", "Content 8"));
        cards.add(new Card("Card 9", "Content 9"));
    }

    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(cards);
        rv.setAdapter(adapter);
    }
}

