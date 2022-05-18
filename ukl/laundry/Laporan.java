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
public class Laporan {

    public void laporan(Client Client) {
        int x = Client.getJmlClient();

        System.out.println();
        System.out.println("Tabel Client");
        System.out.println();
        System.out.println("Nama \tAlamat \t\tTelepon \tSaldo");
        for (int i = 0; i < x; i++) {
            System.out.println(Client.getNama(i) + "\t" + Client.getAlamat(i) + "\t" + Client.getTelepon(i) + "\t" + Client.getSaldo(i));
        }
    }
}
