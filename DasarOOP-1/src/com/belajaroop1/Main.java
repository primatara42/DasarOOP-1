package com.belajaroop1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
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
    }
}