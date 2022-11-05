package com.belajaroop1;

public class Main
{
    public static void main(String[] args)
    {
        //INISIALISASI OBJEK BARU
        TampilBiodata mahasiswa1 = new TampilBiodata("Prima", "Putra", 22, "Teknik Informatika");

        System.out.println("Nama saya adalah " + mahasiswa1.namaAwal + " " + mahasiswa1.namaAkhir);
        System.out.println("Saya berusia " + mahasiswa1.usia + " tahun dan merupakan mahasiswa prodi " + mahasiswa1.prodi);
    }
}