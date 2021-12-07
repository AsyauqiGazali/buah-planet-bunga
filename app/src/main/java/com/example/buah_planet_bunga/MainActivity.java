package com.example.buah_planet_bunga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton btnBuah,btnPlanet,btnBunga,bottom;
    public static final String JENIS_GALERI_KEY = "JENIS GALERI";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();
    }

    private void inisialisasiView(){
        btnBuah= findViewById(R.id.btn_buka_kategori_buah);
        btnPlanet= findViewById(R.id.btn_buka_kategori_pelanet);
        btnBunga= findViewById(R.id.btn_buka_kategori_bunga);
        bottom = findViewById(R.id.dialog_button);
        btnBuah.setOnClickListener(View -> bukaGaleri("Buah"));
        btnPlanet.setOnClickListener(View -> bukaGaleri("Planet"));
        btnBunga.setOnClickListener(View -> bukaGaleri("Bunga"));
        bottom.setOnClickListener(view -> MainActivity2());

    }
    private void bukaGaleri(String jenisSemesta){
        Log.d("Main","Buka activity galeri");
        Intent intent = new Intent(this, DaftarSemestaActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisSemesta);
        startActivity(intent);
    }
    private void MainActivity2() {
        Log.d("MAIN","Buka Activity 2");
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}