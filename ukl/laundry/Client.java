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
public class Client implements User {

    private ArrayList<String> namaClient = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    public Client() {
        this.namaClient.add("Alip");
        this.alamat.add("Pasuruan");
        this.telepon.add("081259400176");
        this.saldo.add(1000000);

        this.namaClient.add("Rafi");
        this.alamat.add("Malang  ");
        this.telepon.add("082143620017");
        this.saldo.add(700000);

        this.namaClient.add("Rehan");
        this.alamat.add("Malang  ");
        this.telepon.add("08102664455");
        this.saldo.add(850000);
    }

    public void setSaldo(int saldo) {
        this.saldo.add(saldo);
    }

    public int getSaldo(int idClient) {
        return this.saldo.get(idClient);
    }

    public void editSaldo(int saldo, int idClient) {
        this.saldo.set(saldo, idClient);
    }

    public int getJmlClient() {
        return this.namaClient.size();
    }

    @Override
    public void setNama(String namaClient) {
        this.namaClient.add(namaClient);

    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.alamat.add(telepon);
    }

    @Override
    public String getNama(int idClient) {
        return this.namaClient.get(idClient);

    }

    @Override
    public String getAlamat(int idClient) {
        return this.alamat.get(idClient);

    }

    @Override
    public String getTelepon(int idClient) {
        return this.telepon.get(idClient);

    }
}
