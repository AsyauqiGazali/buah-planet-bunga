package com.example.buah_planet_bunga;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.buah_planet_bunga.model.Semesta;


public class ProfilActivity extends AppCompatActivity {

    Semesta semesta;
    TextView txJudul,txJenis,txAsal,txDeskripsi;
    ImageView ivFotoSemesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_kategori);
        Intent intent = getIntent();
        semesta = (Semesta) intent.getSerializableExtra(DaftarSemestaActivity.SEMESTA_TERPILIH);
        inisialisasiView();
        tampilkanProfil(semesta);
    }

    private void inisialisasiView() {
        txJudul = findViewById(R.id.txJudul);
        txJenis = findViewById(R.id.txJenis);
        txAsal = findViewById(R.id.txAsal);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoSemesta = findViewById(R.id.gambarSemesta);
    }


    private void tampilkanProfil(Semesta semesta) {
        Log.d("Profil","Menampilkan "+semesta.getJenis());
        txJudul.setText(semesta.getJenis());
        txJenis.setText(semesta.setRas());
        txAsal.setText(semesta.getAsal());
        txDeskripsi.setText(semesta.getDeskripsi());
        ivFotoSemesta.setImageDrawable(this.getDrawable(semesta.getDrawbleRes()));
    }

}
