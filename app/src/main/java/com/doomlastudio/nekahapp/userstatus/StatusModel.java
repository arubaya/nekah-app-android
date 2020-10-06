package com.doomlastudio.nekahapp.userstatus;

public class StatusModel {

    public String nama;
    public String status;
    public int photoprofile;

    /*public StatusModel(String nama, String status, int photoprofile) {
        this.nama = nama;
        this.status = status;
        this.photoprofile = photoprofile;
    }*/

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPhotoprofile() {
        return photoprofile;
    }

    public void setPhotoprofile(int photoprofile) {
        this.photoprofile = photoprofile;
    }
}
