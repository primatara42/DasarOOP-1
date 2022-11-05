package com.belajaroop1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //PROGRAM COBA MENAMPILKAN NILAI AKHIR MATA KULIAH
        HitungNilai mkPemdas = new HitungNilai(23, 86, 29, 80, 55);

        System.out.println();
        System.out.println("================PROGRAM MENAMPILKAN DAFTAR HASIL AKHIR NILAI MATA KULIAH================");
        System.out.println("Nilai Mata Kuliah Pemrograman Dasar Anda Adalah : " + mkPemdas.nilaiAkhir);
        System.out.println("Anda Mendapatkan Predikat " + mkPemdas.predikat);
        System.out.println(mkPemdas.keterangan);
        System.out.println();























        /*
        Scanner input = new Scanner(System.in);

        //Inisialisasi Property Untuk Objek
        String inputNamaAwal, inputNamaAkhir, inputTanggalLahir, inputProdi;

        System.out.print("Masukkan Nama Awal \t\t: ");
        inputNamaAwal = input.nextLine();

        System.out.print("Masukkan Nama Akhir \t: ");
        inputNamaAkhir = input.nextLine();

        System.out.print("Masukkan Tanggal Lahir \t: ");
        inputTanggalLahir = input.nextLine();

        System.out.print("Masukkan Prodi \t\t\t: ");
        inputProdi = input.nextLine();

        //Inisialisasi Objek
        TampilBiodata mahasiswa1 = new TampilBiodata(inputNamaAwal, inputNamaAkhir, inputTanggalLahir, inputProdi);
        TampilBiodata mahasiswa2 = new TampilBiodata("Rianto", "Julian", "3 Agustus 2001", "Teknik Mesin");

        //JALANKAN METHOD INSTANCE
        mahasiswa1.printBiodata();
        mahasiswa2.printBiodata();
        */

    }
}