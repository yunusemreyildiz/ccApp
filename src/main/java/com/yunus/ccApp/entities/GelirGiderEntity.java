package com.yunus.ccApp.entities;

import javax.persistence.*;

@Entity
@Table(name = "gelirgider")
public class GelirGiderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gelgidId;

    @Column(name = "tutar")
    private Double tutar;

    @Column(name = "tutar_aciklama")
    private String tutarAciklama;

    @Column(name = "tutar_tarihi")
    private String tutarTarihi;

    @Column(name = "tutar_islemi")
    private Boolean tutarIslemi;


    @ManyToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name = "urun_id")
    private UrunEntity urunId;


    public UrunEntity getUrunId() {
        return urunId;
    }

    public void setUrunId(UrunEntity urunId) {
        this.urunId = urunId;
    }

    public int getGelgidId() {
        return gelgidId;
    }

    public void setGelgidId(int gelgidId) {
        this.gelgidId = gelgidId;
    }

    public Double getTutar() {
        return tutar;
    }

    public void setTutar(Double tutar) {
        this.tutar = tutar;
    }

    public String getTutarAciklama() {
        return tutarAciklama;
    }

    public void setTutarAciklama(String tutarAciklama) {
        this.tutarAciklama = tutarAciklama;
    }

    public String getTutarTarihi() {
        return tutarTarihi;
    }

    public void setTutarTarihi(String tutarTarihi) {
        this.tutarTarihi = tutarTarihi;
    }

    public Boolean getTutarIslemi() {
        return tutarIslemi;
    }

    public void setTutarIslemi(Boolean tutarIslemi) {
        this.tutarIslemi = tutarIslemi;
    }
}
