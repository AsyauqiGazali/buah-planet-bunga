package com.example.buah_planet_bunga;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.buah_planet_bunga.model.Semesta;

import java.util.List;

public class DaftarSemestaActivity extends AppCompatActivity{
    public final static String SEMESTA_TERPILIH ="semesta_obj_key";
    List<Semesta> semestas;
    ListView listView;
    String jenisSemesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_semesta);
        Intent intent = getIntent();
        jenisSemesta = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        TextView txJudul = findViewById(R.id.text_title_daftar);
        txJudul.setText("DAFTAR BERBAGAI  "+jenisSemesta.toUpperCase());
        semestas = DataProvider.getSemestasByTipe(this,jenisSemesta);
        setupListView();
    }

    private void setupListView() {
        listView = findViewById(R.id.listview_daftar_semesta);
        DaftarSemestaAdapter adapter = new DaftarSemestaAdapter(this,semestas);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(onListClik);
    }

    private AdapterView.OnItemClickListener onListClik = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            Semesta terpilih = semestas.get(position);
            bukaProfileSemesta(terpilih);
        }
    };

    private void bukaProfileSemesta(Semesta semestaTerpilih) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, ProfilActivity.class);
        intent.putExtra(SEMESTA_TERPILIH, semestaTerpilih);
        startActivity(intent);
    }
}
