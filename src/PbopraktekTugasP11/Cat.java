package PbopraktekTugasP11;

public class Cat extends Hewan implements Peliharaan {
    public Cat(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    public String suara() {
        return "Meong!"; // suara kucing
    }

    @Override
    public void bermain() {
        System.out.println(nama + " sedang bermain bola benang.");
    }

    @Override
    public void makan() {
        System.out.println(nama + " sedang makan ikan tuna.");
    }
}
