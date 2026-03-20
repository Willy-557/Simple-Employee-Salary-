/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author William
 */
public class Manajer extends Karyawan{

    public Manajer(String id, String nama, String departemen, int gaji, int tunjangan, int lamaKerja, String posisi) {
        super(id, nama, departemen, gaji, tunjangan, lamaKerja, posisi);
    }
    
    public void lihatSemuaData() {
        System.out.println("ID: " + getId() + " | " + getNama() + "      | Dept: " + getDepartemen() + "   | Gaji: Rp " + getGaji());
    }
}
