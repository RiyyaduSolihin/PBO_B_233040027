package PbopraktekTugasP11;

public class Dog extends Hewan implements Peliharaan {
    // Konstruktor memanggil super
    public Dog(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    public String suara() {
        return "Guk guk!"; // suara anjing
    }

    @Override
    public void bermain() {
        System.out.println(nama + " sedang bermain lempar tangkap.");
    }

    @Override
    public void makan() {
        System.out.println(nama + " sedang makan keringan anjing.");
    }
}