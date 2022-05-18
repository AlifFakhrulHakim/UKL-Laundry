/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl.laundry;

/**
 *
 * @author USER
 */
public class Laundry {

    public static void main(String[] args) {
        // TODO code application logic here
        Client Client = new Client();
        Petugas Petugas = new Petugas();
        Laporan laporan = new Laporan();
        Transaksi transaksi = new Transaksi();
        JenisLaundry JenisLaundry = new JenisLaundry();
        laporan.laporan(Client);
        transaksi.prosesTransaksi(Client, transaksi, JenisLaundry);
        laporan.laporan(Client);

    }
}
