/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl.laundry;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Transaksi {

    private ArrayList<Integer> idLaundry = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    private ArrayList<Integer> idClient = new ArrayList<Integer>();

    public Transaksi() {
        this.idClient.add(0);
        this.idLaundry.add(0);
        this.banyak.add(0);

        this.idClient.add(0);
        this.idLaundry.add(1);
        this.banyak.add(0);

        this.idClient.add(1);
        this.idLaundry.add(0);
        this.banyak.add(0);

        this.idClient.add(1);
        this.idLaundry.add(2);
        this.banyak.add(0);
    }

    public void prosesTransaksi(Client Client, Transaksi transaksi, JenisLaundry JenisLaundry) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Silahkan melakukan transaksi");
        System.out.println("Masukkan ID Client");
        int idClient = myObj.nextInt();
        System.out.println("Selamat datang " + Client.getNama(idClient));
        ArrayList<Integer> idLaundry = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>();
        int i = 0;
        int temp = 0;
        do {
            System.out.println("Masukkan kode pakaian :");
            temp = myObj.nextInt();
            if (temp != 99) {
                idLaundry.add(temp);
                System.out.print(JenisLaundry.getNamaLaundry(idLaundry.get(i)) + " sebanyak : ");
                banyak.add(myObj.nextInt());
                i++;
            }
        } while (temp != 99);

        System.out.println("Transaksi laundry " + Client.getNama(idClient) + " sebagai berikut");
        System.out.println("Nama Barang \tQty \tHarga \tTotal Harga \tDurasi");
        int total = 0;
        int hasil = 0;
        int x = idLaundry.size();
        for (int j = 0; j < x; j++) {
            int jumlah = banyak.get(j) * JenisLaundry.getHarga(idLaundry.get(j));
            total += jumlah;
            int durasi = banyak.get(j) * JenisLaundry.getStok(idLaundry.get(j));
            hasil += durasi;
            System.out.println(JenisLaundry.getNamaLaundry(idLaundry.get(j)) + "\t\t" + banyak.get(j) + "\t"
                    + JenisLaundry.getHarga(idLaundry.get(j)) + "\t" + jumlah + "\t\t" + durasi + "jam");
            transaksi.setTransaksi(JenisLaundry, idClient, idLaundry.get(j), banyak.get(j));
        }

        System.out.println("Total Biaya : " + total);
        Client.editSaldo(idClient, Client.getSaldo(idClient) - total);
    }

    public void setTransaksi(JenisLaundry JenisLaundry, int idClient, int idLaundry, int banyaknya) {
        this.idClient.add(idClient);
        this.idLaundry.add(idLaundry);
        this.banyak.add(banyaknya);

    }

    public int getIdLaundry(int id) {
        return this.idLaundry.get(id);
    }

    public int getBanyaknya(int id) {
        return this.banyak.get(id);
    }

    public int getIdClient(int id) {
        return this.idClient.get(id);
    }

    public int getJmlTransaksi() {
        return this.idClient.size();
    }
}
