package com.yunus.ccApp.entities;

import javax.persistence.*;

@Entity
@Table(name = "saglik")
public class SaglikEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int saglikId;

    @Column(name = "asi_aciklama")
    private String asiAciklama;

    @Column(name = "asi_tarihi")
    private String asiTarihi;

    @Column(name = "muayene_aciklama")
    private String muayeneAciklama;

    @Column(name = "muayene_tarihi")
    private String muayeneTarihi;

    @Column(name = "hayvan_kupe")
    private int hayvanKupe;

    @Column(name = "users_id")
    private Integer usersId;


    public int getHayvanKupeNo() {
        return hayvanKupe;
    }

    public void setHayvanKupeNo(int hayvanKupeNo) {
        this.hayvanKupe = hayvanKupeNo;
    }

    public Integer getUserId() {
        return usersId;
    }

    public void setUserId(Integer usersId) {
        this.usersId = usersId;
    }

    public int getSaglikId() {
        return saglikId;
    }

    public void setSaglikId(int saglikId) {
        this.saglikId = saglikId;
    }

    public String getAsiAciklama() {
        return asiAciklama;
    }

    public void setAsiAciklama(String asiAciklama) {
        this.asiAciklama = asiAciklama;
    }

    public String getAsiTarihi() {
        return asiTarihi;
    }

    public void setAsiTarihi(String asiTarihi) {
        this.asiTarihi = asiTarihi;
    }

    public String getMuayeneAciklama() {
        return muayeneAciklama;
    }

    public void setMuayeneAciklama(String muayeneAciklama) {
        this.muayeneAciklama = muayeneAciklama;
    }

    public String getMuayeneTarihi() {
        return muayeneTarihi;
    }

    public void setMuayeneTarihi(String muayeneTarihi) {
        this.muayeneTarihi = muayeneTarihi;
    }
}
