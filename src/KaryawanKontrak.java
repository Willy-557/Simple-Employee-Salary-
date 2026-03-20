/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author William
 */
public class KaryawanKontrak  extends Karyawan{
    
    private String vendor;

    public KaryawanKontrak(String vendor, String id, String nama, String departemen, int gaji, int tunjangan, int lamaKerja, String posisi, String tipe) {
        super(id, nama, departemen, gaji, tunjangan, lamaKerja, posisi, tipe);
        this.vendor = vendor;
    }

    public void lihatSemuaData() {
        System.out.println("ID: " + getId() + " | " + getNama() + "      | Vendor: " + vendor + "   | Gaji: Rp " + getGaji());
    }
    
}
