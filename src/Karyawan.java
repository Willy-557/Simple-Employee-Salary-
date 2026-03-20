/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author William
 */
public class Karyawan {
    private String id;
    private String nama;
    private String departemen;
    private int gaji;
    private int tunjangan;
    private int lamaKerja;
    private String posisi;
    private String tipe;

    public Karyawan(String id, String nama, String departemen, int gaji, int tunjangan, int lamaKerja, String posisi, String tipe) {
        this.id = id;
        this.nama = nama;
        this.departemen = departemen;
        this.gaji = gaji;
        this.tunjangan = tunjangan;
        this.lamaKerja = lamaKerja;
        this.posisi = posisi;
        this.tipe = tipe;
    }
    
    public void detailKaryawan() {
        System.out.println("ID          : " + id);
        System.out.println("Nama        : " + nama);
        System.out.println("Tipe        : " + tipe);
        System.out.println("Divisi      : " + departemen);
        System.out.println("Posisi      : " + posisi);
        System.out.println("Gaji Pokok  : " + gaji);
        System.out.println("Tunjangan   : " + tunjangan);
        System.out.println("Lama Kerja  : " + lamaKerja);
        System.out.println("------------------------------------");
        System.out.println("Total Gaji: " + totalGaji());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }
    
    public int totalGaji() {
        return gaji+tunjangan;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    
    
    
}
