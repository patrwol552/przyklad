package com.example.user.przyklad;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by User on 12.01.2018.
 */

class CoffeeAdapter extends RecyclerView.Adapter<CoffeeAdapter.ViewHolder> {


    ArrayList<Kawa> list = new ArrayList<>();

    CoffeeAdapter(ArrayList<Kawa> kawy) {
        this.list = kawy;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.coffe, null);
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.setName(list.get(position).getNazwa());
        holder.setPrice(list.get(position).getCena());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.cena12)
        TextView cena;

        @BindView(R.id.latte)
        TextView Latte;

        @BindView(R.id.check)
        ImageView Wybrane;


        @OnClick(R.id.button_wybierz)
        void onNameClick() {
            if (Wybrane.getVisibility() == View.INVISIBLE) {
                Wybrane.setVisibility(View.VISIBLE);
            } else {
                Wybrane.setVisibility(View.INVISIBLE);
            }
        }

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            Wybrane.setVisibility(View.INVISIBLE);
        }

        private void setName(String name) {
            Latte.setText(name);
        }

        private void setPrice(String price) {
            cena.setText(price);
        }


        }
    }
