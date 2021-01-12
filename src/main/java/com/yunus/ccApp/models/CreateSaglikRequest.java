package com.yunus.ccApp.models;


import com.sun.istack.NotNull;

public class CreateSaglikRequest {

    @NotNull
    private String asiAciklama;

    @NotNull
    private String asiTarihi;

    @NotNull
    private String muayeneAciklama;

    @NotNull
    private String muayeneTarihi;

    @NotNull
    private Integer hayvanKupeNo;

    @NotNull
    private Integer usersId;


    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public Integer getHayvanKupeNo() {
        return hayvanKupeNo;
    }

    public void setHayvanKupeNo(Integer hayvanKupeNo) {
        this.hayvanKupeNo = hayvanKupeNo;
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
