package ru.iojs.geovk;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;


public class CheckinsActivity extends AppCompatActivity {

    public ArrayList<Card> cards;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkins);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CheckinsActivity.this, NewPostActivity.class);
                startActivity(intent);
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
        cards.add(new Card("Mail.ru Group", "28 сентября 2017"));
        cards.add(new Card("Mail.ru Group", "28 сентября 2017"));
        cards.add(new Card("МГТУ им. Н.Э. Баумана", "19 сентября 2017"));
        cards.add(new Card("Jeffrey's Coffee", "19 сентября 2017"));

    }

    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(cards);
        rv.setAdapter(adapter);
    }


}

