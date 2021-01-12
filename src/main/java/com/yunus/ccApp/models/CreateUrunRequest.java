package com.yunus.ccApp.models;


import com.sun.istack.NotNull;

public class CreateUrunRequest {


    @NotNull
    private String hayvanAdi;

    @NotNull
    private Integer hayvanKupeNo;

    @NotNull
    private String dogumSekli;

    @NotNull
    private String hayvanResmi;

    @NotNull
    private String hayvanCinsiyet;

    @NotNull
    private String hayvanIrki;

    @NotNull
    private String hayvanAnneAdi;

    @NotNull
    private String dogumTarihi;

    @NotNull
    private Double dogumAgirligi;

    @NotNull
    private Boolean tohumaHazir;

    @NotNull
    private Double sutMiktari;

    @NotNull
    private String sutTarihi;

    @NotNull
    private int urunId;

    @NotNull
    private int urunTutar;

    @NotNull
    private Integer userId;


    public Integer getHayvanKupeNo() {
        return hayvanKupeNo;
    }

    public void setHayvanKupeNo(Integer hayvanKupeNo) {
        this.hayvanKupeNo = hayvanKupeNo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public int getUrunTutar() {
        return urunTutar;
    }

    public void setUrunTutar(int urunTutar) {
        this.urunTutar = urunTutar;
    }

    public int getUrunId() {
        return urunId;
    }

    public void setUrunId(int urunId) {
        this.urunId = urunId;
    }

    public Double getSutMiktari() {
        return sutMiktari;
    }

    public void setSutMiktari(Double sutMiktari) {
        this.sutMiktari = sutMiktari;
    }

    public String getSutTarihi() {
        return sutTarihi;
    }

    public void setSutTarihi(String sutTarihi) {
        this.sutTarihi = sutTarihi;
    }

    public String getHayvanAdi() {
        return hayvanAdi;
    }

    public void setHayvanAdi(String hayvanAdi) {
        this.hayvanAdi = hayvanAdi;
    }

    public String getDogumSekli() {
        return dogumSekli;
    }

    public void setDogumSekli(String dogumSekli) {
        this.dogumSekli = dogumSekli;
    }

    public String getHayvanResmi() {
        return hayvanResmi;
    }

    public void setHayvanResmi(String hayvanResmi) {
        this.hayvanResmi = hayvanResmi;
    }

    public String getHayvanCinsiyet() {
        return hayvanCinsiyet;
    }

    public void setHayvanCinsiyet(String hayvanCinsiyet) {
        this.hayvanCinsiyet = hayvanCinsiyet;
    }

    public String getHayvanIrki() {
        return hayvanIrki;
    }

    public void setHayvanIrki(String hayvanIrki) {
        this.hayvanIrki = hayvanIrki;
    }

    public String getHayvanAnneAdi() {
        return hayvanAnneAdi;
    }

    public void setHayvanAnneAdi(String hayvanAnneAdi) {
        this.hayvanAnneAdi = hayvanAnneAdi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public Double getDogumAgirligi() {
        return dogumAgirligi;
    }

    public void setDogumAgirligi(Double dogumAgirligi) {
        this.dogumAgirligi = dogumAgirligi;
    }

    public Boolean getTohumaHazir() {
        return tohumaHazir;
    }

    public void setTohumaHazir(Boolean tohumaHazir) {
        this.tohumaHazir = tohumaHazir;
    }
}
