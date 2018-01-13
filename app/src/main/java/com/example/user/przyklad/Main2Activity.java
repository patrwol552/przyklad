package com.example.user.przyklad;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
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
        kawy.add(new Kawa("Latte", "12zł"));
        kawy.add(new Kawa("Cappuccino", "10zł"));
        kawy.add(new Kawa("Americano", "9zł"));
        kawy.add(new Kawa("Espresso", "7zł"));
        kawy.add(new Kawa("Flat white", "11zł"));



        CoffeeAdapter coffeeAdapter= new CoffeeAdapter(kawy);
        recycler.setAdapter(coffeeAdapter);


    }


}
