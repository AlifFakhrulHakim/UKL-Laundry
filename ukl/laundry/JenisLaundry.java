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
public class JenisLaundry {

    private ArrayList<String> namaJenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    JenisLaundry() {
        this.namaJenisLaundry.add("Baju");
        this.stok.add(1);
        this.harga.add(5000);

        this.namaJenisLaundry.add("Celana");
        this.stok.add(2);
        this.harga.add(5000);

        this.namaJenisLaundry.add("Jaket");
        this.stok.add(3);
        this.harga.add(10000);
    }

    public void setNamaLaundry(String namaLaundry) {
        this.namaJenisLaundry.add(namaLaundry);
    }
    public void setNamaLaundry() {
        System.out.println("y");;
    }
    public String getNamaLaundry(int idLaundry) {
        return this.namaJenisLaundry.get(idLaundry);
    }

    public void setStok(int stok) {
        this.stok.add(stok);
    }

    public int getStok(int idLaundry) {
        return this.stok.get(idLaundry);
    }

    public void setHarga(int harga) {
        this.harga.add(harga);
    }

    public int getHarga(int idLaundry) {
        return this.harga.get(idLaundry);
    }

}
