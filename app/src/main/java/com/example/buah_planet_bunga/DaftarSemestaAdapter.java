package com.example.buah_planet_bunga;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.buah_planet_bunga.model.Semesta;

import java.util.List;

public class DaftarSemestaAdapter extends ArrayAdapter<Semesta>{

    Context context;

    public DaftarSemestaAdapter(Context context, List<Semesta> semestas) {
        super(context, R.layout.row_daftar_semesta, semestas);
        this.context = context;
    }

    private static class ViewHolder  {
        TextView textJenis;
        TextView textAsal;
        ImageView gambar;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Semesta semesta = getItem(position);
        ViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_daftar_semesta, parent, false);
            viewHolder.textJenis =  convertView.findViewById(R.id.row_text_jenis);
            viewHolder.textAsal = (TextView) convertView.findViewById(R.id.row_text_asal);
            viewHolder.gambar = convertView.findViewById(R.id.row_image_semesta);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.textJenis.setText(semesta.setRas());
        viewHolder.textAsal.setText(semesta.getAsal());
        viewHolder.gambar.setImageDrawable(context.getDrawable(semesta.getDrawbleRes()));
        return convertView;
    }

}
