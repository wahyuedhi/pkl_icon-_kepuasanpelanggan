package com.example.ultimate.icon.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Penilaian {

    @SerializedName("id_penilaian")
    @Expose
    private String idPenilaian;
    @SerializedName("id_variabel")
    @Expose
    private String idVariabel;
    @SerializedName("nama_customer")
    @Expose
    private String namaCustomer;
    @SerializedName("tanggal_penilaian")
    @Expose
    private String tanggalPenilaian;
    @SerializedName("score")
    @Expose
    private String score;

    public String getIdPenilaian() {
        return idPenilaian;
    }

    public void setIdPenilaian(String idPenilaian) {
        this.idPenilaian = idPenilaian;
    }

    public String getIdVariabel() {
        return idVariabel;
    }

    public void setIdVariabel(String idVariabel) {
        this.idVariabel = idVariabel;
    }

    public String getNamaCustomer() {
        return namaCustomer;
    }

    public void setNamaCustomer(String namaCustomer) {
        this.namaCustomer = namaCustomer;
    }

    public String getTanggalPenilaian() {
        return tanggalPenilaian;
    }

    public void setTanggalPenilaian(String tanggalPenilaian) {
        this.tanggalPenilaian = tanggalPenilaian;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Penilaian(String idVariabel, String namaCustomer, String tanggalPenilaian, String score) {
        this.idVariabel = idVariabel;
        this.namaCustomer = namaCustomer;
        this.tanggalPenilaian = tanggalPenilaian;
        this.score = score;
    }
}
