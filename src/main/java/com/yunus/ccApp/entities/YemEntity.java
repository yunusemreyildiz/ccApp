package com.yunus.ccApp.entities;

import javax.persistence.*;

@Entity
@Table(name = "yem")
public class YemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int yemId;

    @Column(name = "yemin_turu")
    private String yeminTuru;

    @Column(name = "yem_miktari")
    private Integer yemMiktari;

    @Column(name = "yem_islemi")
    private Boolean yemIslemi;

    @Column(name = "yem_tarihi")
    private String yemTarihi;

    @Column(name = "user_id")
    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public int getYemId() {
        return yemId;
    }

    public void setYemId(int yemId) {
        this.yemId = yemId;
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
