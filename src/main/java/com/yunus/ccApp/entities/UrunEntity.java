package com.yunus.ccApp.entities;

import javax.persistence.*;

@Entity
@Table(name = "urunler")
public class UrunEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int urunId;

    @Column(name = "hayvan_kupe_no")
    private int hayvanKupeNo;

    @Column(name = "hayvan_adi")
    private String hayvanAdi;

    @Column(name = "dogum_sekli")
    private String dogumSekli;

    @Column(name = "hayvan_resmi")
    private String hayvanResmi;

    @Column(name = "hayvan_cinsiyet")
    private String hayvanCinsiyet;

    @Column(name = "hayvan_irki")
    private String hayvanIrki;

    @Column(name = "hayvan_anneAdi")
    private String hayvanAnneAdi;

    @Column(name = "dogum_tarihi")
    private String dogumTarihi;

    @Column(name = "dogum_agirligi")
    private Double dogumAgirligi;

    @Column(name = "tohuma_hazir")
    private Boolean tohumaHazir;

    @Column(name = "sut_miktari")
    private Double sutMiktari;

    @Column(name = "sut_tarihi")
    private String sutTarihi;

    @Column(name = "urun_tutar")
    private Double urunTutar;

    @Column(name = "user_id")
    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public int getHayvanKupeNo() {
        return hayvanKupeNo;
    }

    public void setHayvanKupeNo(int hayvanKupeNo) {
        this.hayvanKupeNo = hayvanKupeNo;
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

    public Double getUrunTutar() {
        return urunTutar;
    }

    public void setUrunTutar(Double urunTutar) {
        this.urunTutar = urunTutar;
    }

    public int getUrunId() {
        return urunId;
    }

    public void setUrunId(int urunId) {
        this.urunId = urunId;
    }


}
