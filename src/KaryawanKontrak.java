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
    
    public void detailKaryawan() {
        System.out.println("ID          : " + getId());
        System.out.println("Nama        : " + getNama());
        System.out.println("Tipe        : " + getTipe());
        System.out.println("Vendor      : " + vendor);
        System.out.println("Divisi      : " + getDepartemen());
        System.out.println("Posisi      : " + getPosisi());
        System.out.println("Gaji Pokok  : " + getGaji());
        System.out.println("Tunjangan   : " + getTunjangan());
        System.out.println("Lama Kerja  : " + getLamaKerja() + " tahun");
        System.out.println("------------------------------------");
        System.out.println("Total Gaji: " + totalGaji());
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
    
    
    
}
