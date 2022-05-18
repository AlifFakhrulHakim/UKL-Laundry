/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl.laundry;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Petugas implements User{
    
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();

    public Petugas() {
        this.namaPetugas.add("Alip #4");
        this.alamat.add("Pasuruan");
        this.telepon.add("081259400176");
        this.jabatan.add(0);
    }

    public void setJabatan(int jabatan) {
        this.jabatan.add(jabatan);
    }

    public int getJabatan(int idPetugas) {
        return this.jabatan.get(idPetugas);
    }

    public int getJmlPetugas() {
        return this.namaPetugas.size();
    }

    @Override
    public void setNama(String namaPetugas) {
        this.namaPetugas.add(namaPetugas);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idPetugas) {
        return this.namaPetugas.get (idPetugas);
    }

    @Override
    public String getAlamat(int idPetugas) {
        return this.alamat.get (idPetugas);
    }

    @Override
    public String getTelepon(int idPetugas) {
        return this.telepon.get (idPetugas);
    }


}
