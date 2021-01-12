package com.yunus.ccApp.models;


import com.sun.istack.NotNull;

public class CreateYemRequest {

    @NotNull
    private String yeminTuru;

    @NotNull
    private Integer yemMiktari;

    @NotNull
    private Boolean yemIslemi;

    @NotNull
    private String yemTarihi;

    @NotNull
    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getYeminTuru() {
        return yeminTuru;
    }

    public void setYeminTuru(String yeminTuru) {
        this.yeminTuru = yeminTuru;
    }

    public Integer getYemMiktari() {
        return yemMiktari;
    }

    public void setYemMiktari(Integer yemMiktari) {
        this.yemMiktari = yemMiktari;
    }

    public Boolean getYemIslemi() {
        return yemIslemi;
    }

    public void setYemIslemi(Boolean yemIslemi) {
        this.yemIslemi = yemIslemi;
    }

    public String getYemTarihi() {
        return yemTarihi;
    }

    public void setYemTarihi(String yemTarihi) {
        this.yemTarihi = yemTarihi;
    }
}
