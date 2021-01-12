package com.yunus.ccApp.models;


import com.sun.istack.NotNull;

public class CreateGelirGiderRequest {

    @NotNull
    private Double tutar;

    @NotNull
    private String tutarAciklama;

    @NotNull
    private String tutarTarihi;

    @NotNull
    private Boolean tutarIslemi;


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
