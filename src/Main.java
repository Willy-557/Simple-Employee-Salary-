
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author William
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        Manajer[] manajer = new Manajer[10];
        KaryawanKontrak[] karyawanKontrak = new KaryawanKontrak[10];
        StafTetap[] stafTetap = new StafTetap[10];
        
        int ctr_manajer = 0;
        int ctr_staf = 0;
        int ctr_karyawan = 0;
        
        int id_manajer = 1;
        int id_staf = 1;
        int id_karyawan = 1;
        
        System.out.print("Masukkan nama PT: ");
        String namaPT = scanner.nextLine();
        
        System.out.println("=========================================");
        System.out.println("        SISTEM PENGGAJIAN KARYAWAN       ");
        System.out.println("=========================================");
        System.out.println(" PT. " + namaPT + "  |  Surabaya, 2026   ");
        System.out.println("");
        System.out.println(">> Memuat data karyawan...");
        
        while (true) {
            System.out.println("=========================================");
            System.out.println("        SISTEM PENGGAJIAN KARYAWAN       ");
            System.out.println("=========================================");
            System.out.println("1. Lihat semua karyawan");
            System.out.println("2. Cari karyawan");
            System.out.println("3. Rekap Gaji Per Divisi");
            System.out.println("4. Tambah Karyawan");
            System.out.println("0. Exit");
            
            System.out.print(">> ");
            int menu = scanner.nextInt();
            scanner.nextLine();
            
            if (menu == 0) {
                break;
            }
            else if (menu > 4 || menu < 0) {
                System.out.println("Error");
                continue;
            }
            else {
                if (menu == 1) {
                    System.out.println("=== DAFTAR KARYAWAN ===");
                    System.out.println("");
                    System.out.println("[ MANAJER ]");
                    for (int i = 0; i < ctr_manajer; i++) {
                       manajer[i].lihatSemuaData();
                    }
                    System.out.println("");
                    System.out.println("[ STAF TETAP ]");
                    for (int i = 0; i < ctr_staf; i++) {
                       stafTetap[i].lihatSemuaData();
                    }
                    System.out.println("");
                    System.out.println("[ KARYAWAN KONTRAK ]");
                    for (int i = 0; i < ctr_karyawan; i++) {
                       karyawanKontrak[i].lihatSemuaData();
                    }
                    System.out.println("");
                    int totalKaryawan = ctr_staf + ctr_manajer + ctr_karyawan;
                    System.out.println("Total karyawan : " + totalKaryawan);
                }
                else if (menu == 2) {
                    
                }
                else if (menu == 4) {
                    while (true) {
                        System.out.println("=== TAMBAH KARYAWAN BARU ===");
                        System.out.println("Pilih tipe karyawan:");
                        System.out.println("1. Manajer");
                        System.out.println("2. Staf Tetap");
                        System.out.println("3. Karyawan Kontrak");
                        System.out.println("0. Batal");

                        System.out.print(">> ");
                        int choice4 = scanner.nextInt();
                        scanner.nextLine();

                        if (choice4 == 0) {
                            break;
                        }
                        else if (choice4 > 3 || choice4 < 0) {
                            System.out.println("Error");
                            continue;
                        }
                        else {
                            if (choice4 == 1) {
                                System.out.println("=== INPUT DATA MANAJER ===");
                                
                                String idManajer = "MGR-00" + id_manajer;
                                
                                System.out.print("Nama : ");
                                String nama = scanner.nextLine();
                                
                                System.out.print("Gaji pokok : ");
                                int gaji = scanner.nextInt();
                                scanner.nextLine();
                                
                                System.out.print("Tunjangan: ");
                                int tunjangan = scanner.nextInt();
                                scanner.nextLine();
                                
                                System.out.println("Lama kerja: ");
                                int lamaKerja = scanner.nextInt();
                                scanner.nextLine();
                                
                                System.out.print("Posisi: ");
                                String posisi = scanner.nextLine();
                                
                                System.out.println("Divisi: ");
                                String divisi = scanner.nextLine();
                                
                                manajer[ctr_manajer] = new Manajer(idManajer, nama, divisi, gaji, tunjangan, lamaKerja, posisi, "Manajer");
                                System.out.println("Manajer " + nama + " {" + idManajer + ") berhasil ditambahkan!");
                                ctr_manajer++;
                                id_manajer++;
                            }
                            else if (choice4 == 2) {
                                System.out.println("=== INPUT DATA STAF TETAP ===");
                                
                                String idStaf = "STF-00" + id_staf;
                                
                                System.out.print("Nama : ");
                                String nama = scanner.nextLine();
                                
                                System.out.print("Gaji pokok : ");
                                int gaji = scanner.nextInt();
                                scanner.nextLine();
                                
                                System.out.print("Tunjangan: ");
                                int tunjungan = scanner.nextInt();
                                scanner.nextLine();
                                
                                System.out.println("Lama kerja: ");
                                int lamaKerja = scanner.nextInt();
                                scanner.nextLine();
                                
                                System.out.print("Posisi: ");
                                String posisi = scanner.nextLine();
                                
                                System.out.println("Divisi: ");
                                String divisi = scanner.nextLine();
                                
                                stafTetap[ctr_staf] = new StafTetap(idStaf, nama, divisi, gaji, tunjungan, lamaKerja, posisi, "Staf Tetap");
                                System.out.println("Staf tetap " + nama + " {" + idStaf + ") berhasil ditambahkan!");
                                ctr_staf++;
                                id_staf++;
                            }
                            else if (choice4 == 3) {
                                System.out.println("=== INPUT DATA KARYAWAN KONTRAK ===");
                                
                                String idkaryawan = "KON-00" + id_karyawan;
                                
                                System.out.print("Nama : ");
                                String nama = scanner.nextLine();
                                
                                System.out.print("Gaji pokok : ");
                                int gaji = scanner.nextInt();
                                scanner.nextLine();
                                
                                System.out.print("Tunjangan: ");
                                int tunjungan = scanner.nextInt();
                                scanner.nextLine();
                                
                                System.out.println("Lama kerja: ");
                                int lamaKerja = scanner.nextInt();
                                scanner.nextLine();
                                
                                System.out.print("Posisi: ");
                                String posisi = scanner.nextLine();
                                
                                System.out.println("Divisi: ");
                                String divisi = scanner.nextLine();
                                
                                System.out.println("Vendor: ");
                                String vendor = scanner.nextLine();
                                
                                karyawanKontrak[ctr_karyawan] = new KaryawanKontrak(vendor, idkaryawan, nama, divisi, gaji, tunjungan, lamaKerja, posisi, "Karyawan Kontrak");
                                System.out.println("Karyawan Kontrak " + nama + " {" + idkaryawan + ") berhasil ditambahkan!");
                                ctr_karyawan++;
                                id_karyawan++;
                            }
                        }
                    }  
                }
            }
        }
    }
    
}
