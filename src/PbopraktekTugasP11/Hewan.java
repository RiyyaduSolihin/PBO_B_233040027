package PbopraktekTugasP11;

public abstract class Hewan {
    protected String nama;
    protected int umur;

    // Konstruktor
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Getter nama
    public String getNama() {
        return nama;
    }

    // Getter umur
    public int getUmur() {
        return umur;
    }

    // Method abstrak: setiap hewan mengeluarkan suara berbeda
    public abstract String suara();
}