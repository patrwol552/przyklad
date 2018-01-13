package com.example.user.przyklad;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by User on 11.01.2018.
 */

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.recycler)
    RecyclerView recycler;

    @Override
   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);

        ButterKnife.bind(this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recycler.setLayoutManager(layoutManager);

        ArrayList<Kawa> kawy = new ArrayList<>();
        kawy.add(new Kawa("Latte", "cena 12zł"));
        kawy.add(new Kawa("Cappuccino", "cena 10zł"));
        kawy.add(new Kawa("Americano", "cena 9zł"));
        kawy.add(new Kawa("Espresso", "cena 7zł"));
        kawy.add(new Kawa("Flat white", "cena 11zł"));


    }


}
