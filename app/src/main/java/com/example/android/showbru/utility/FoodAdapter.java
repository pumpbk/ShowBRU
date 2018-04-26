package com.example.android.showbru.utility;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class FoodAdapter extends BaseAdapter{

    private Context context;
    private String[] imgaeStrings, foodStrings, priceStrings, detailStrings;

    public FoodAdapter(Context context,
                       String[] imgaeStrings,
                       String[] foodStrings,
                       String[] priceStrings,
                       String[] detailStrings) {
        this.context = context;
        this.imgaeStrings = imgaeStrings;
        this.foodStrings = foodStrings;
        this.priceStrings = priceStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() {
        return foodStrings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);



        return null;
    }
}
