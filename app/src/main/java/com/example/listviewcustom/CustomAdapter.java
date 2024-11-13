package com.example.listviewcustom;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class CustomAdapter extends BaseAdapter {
    private List<String> beallitasok;
    private List<String> beallitasLeirasok;
    private List<Integer> kepek;
    private LayoutInflater inf;

    @Override
    public int getCount() {
        return this.beallitasok.size();
    }

    @Override
    public Object getItem(int pos) {
        return this.beallitasok.get(pos);
    }
    @Override
    public long getItemId(int pos) {
        return pos;

    }
    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        ImageView kep_hely = convertView.findViewById((R.id.kep_hely));
        TextView beallitas_neve = convertView.findViewById(R.id.beallitas_neve);
        TextView beallitas_leiras = convertView.findViewById(R.id.beallitas_leiras);

        kep_hely.setImageResource((kepek.get(pos)));
        beallitas_neve.setText((beallitasok.get(pos)));
        beallitas_leiras.setText((beallitasLeirasok.get(pos)));

        convertView = inf.inflate(R.layout.custom_row, parent);
        return convertView;
    }
}
