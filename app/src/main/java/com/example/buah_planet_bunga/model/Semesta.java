package com.example.buah_planet_bunga.model;

import java.io.Serializable;

public class Semesta implements Serializable {
    private String jenis;
    private String ras;
    private String asal;
    private String deskripsi;
    private int drawbleRes;

    public Semesta(String jenis,String ras,String asal,String deskripsi,int drawbleRes){
        this.jenis = jenis;
        this.ras = ras;
        this.asal = asal;
        this.deskripsi = deskripsi;
        this.drawbleRes = drawbleRes;
    }

    public String getJenis() {
        return jenis;
    }
    public void setJenis(String jenis){
        this.jenis= jenis;
    }
    public String setRas(){
        return ras;
    }
    public void setRas(String ras){
        this.ras = ras;
    }
    public String getAsal(){
        return asal;
    }
    public void setAsal(String asal){
        this.asal = asal;
    }
    public String getDeskripsi(){
        return deskripsi;
    }
    public void setDeskripsi(String deskripsi){
        this.deskripsi = deskripsi;
    }
    public int getDrawbleRes(){
        return drawbleRes;
    }
    public void setDrawbleRes(int drawbleRes){
        this.drawbleRes = drawbleRes;
    }
}
