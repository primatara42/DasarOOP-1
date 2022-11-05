package com.belajaroop1;

import java.util.Scanner;

public class HitungNilai
{
    //PROPERTY yang dibutuhkan dalam menghitung nilai :
    int tugas, kuis, softSkill, uts, uas;
    String predikat, keterangan;
    double nilaiAkhir;

    //CONSTRUCTOR dijalankan, masukkan nilai
    HitungNilai(int inputTugas, int inputKuis, int inputSoftSkill, int inputUts, int inputUas)
    {
        this.tugas = inputTugas;
        this.kuis = inputKuis;
        this.softSkill = inputSoftSkill;
        this.uts = inputUts;
        this.uas = inputUas;

        this.nilaiAkhir = (this.tugas * 0.2) + (this.kuis * 0.2) + (this.softSkill * 0.1) + (this.uts * 0.3) + (this.uas * 0.3);

        //PENGKONDISIAN UNTUK MENCARI PREDIKAT
        if(this.nilaiAkhir < 45)
        {
            this.predikat = "E";
        }

        else if(this.nilaiAkhir >= 45 && this.nilaiAkhir < 60)
        {
            this.predikat = "D";
        }

        else if(this.nilaiAkhir >= 60 && this.nilaiAkhir < 75)
        {
            this.predikat = "C";
        }

        else if(this.nilaiAkhir >= 75 && this.nilaiAkhir < 90)
        {
            this.predikat = "B";
        }

        else if(this.nilaiAkhir <= 90 && this.nilaiAkhir >= 100)
        {
            this.predikat = "A";
        }

        //PENGKONDISIAN KETERANGAN LULUS
        if(this.predikat == "E" || this.predikat == "D" || this.predikat == "C")
        {
            this.keterangan = "Maaf Anda Dinyatakan Guobloook. Jangan Jadi Beban Ortu!";
        }

        else
        {
            this.keterangan = "Selamat Anda Dinyatakan Lulus. Ortu Anda Pasti Bangga :)";
        }
    }

































































    /*
    public String namaAwal, namaAkhir, namaLengkap, tanggalLahir, prodi;


    //Constructor
    TampilBiodata(String inputNamaAwal, String inputNamaAkhir, String inputTanggalLahir, String inputProdi)
    {
        this.namaAwal = inputNamaAwal;
        this.namaAkhir = inputNamaAkhir;
        namaLengkap = inputNamaAwal + " " + inputNamaAkhir;
        this.tanggalLahir = inputTanggalLahir;
        this.prodi = inputProdi;
    }

    //Method Untuk Menampilkan Nama Lengkap
    void printBiodata()
    {
        System.out.println();
        System.out.println("Nama \t\t\t: " + this.namaLengkap);
        System.out.println("Tanggal Lahir \t: " + this.tanggalLahir);
        System.out.println("Prodi \t\t\t: " + this.prodi);
        System.out.println();
    }

     */
}
