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
public interface User {

    public abstract void setNama(String nama);

    public abstract void setAlamat(String Alamat);

    public abstract void setTelepon(String Telepon);

    public abstract String getNama(int id);

    public abstract String getAlamat(int id);

    public abstract String getTelepon(int id);

}