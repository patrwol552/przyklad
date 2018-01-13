package com.example.user.przyklad;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by User on 12.01.2018.
 */

class CoffeeAdapter extends RecyclerView.Adapter<CoffeeAdapter.ViewHolder> {

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        @OnClick(R.id.wybierzdane_btn)
        void onNameClick() {
            Intent intent = new Intent(itemView.getContext(), MainActivity.class);
            itemView.getContext().startActivity(intent);
        }
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        //private void setName(String name) {
            //Latte.setText(name); }

        //private void setPrice(String price) {
            //Cena.setText(price);}


        }
    }
}