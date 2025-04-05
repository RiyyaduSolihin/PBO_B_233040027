package Pertemuan7;

import Praktek.Latihan2.Matakuliah;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        // Create object matakuliah
        Matakuliah mk1 = new Matakuliah("001","Algoritma Pemograman 1", "BC", 3);
        Matakuliah mk2 = new Matakuliah("002","Algoritma Pemograman 2", "AB", 3);
        Matakuliah mk3 = new Matakuliah("003","PBO", "A", 2);

        // membuat object khs
        KartuHasilStudi khs = new KartuHasilStudi("2");
        khs.addMataKuliah(mk1);
        khs.addMataKuliah(mk2);
        khs.addMataKuliah(mk3);


        // Membuat object mahasiswa
        Mahasiswa mhs = new Mahasiswa("233040027", "Riyyadu");

        // membuat object transkripnilai
        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKHS(khs);


        // Hitung IPK keseluruh an
        transkrip.hitungIPK();

        transkrip.display();
    }

}