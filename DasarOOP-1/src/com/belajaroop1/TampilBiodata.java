package com.belajaroop1;

public class TampilBiodata
{
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
}
