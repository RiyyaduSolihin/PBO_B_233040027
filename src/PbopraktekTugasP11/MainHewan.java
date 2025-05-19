package PbopraktekTugasP11;

public class MainHewan {
    public static void main(String[] args) {
        // Buat objek Dog dan Cat
        Dog dog = new Dog("Dogi", 3);
        Cat cat = new Cat("Milo", 2);

        // Tampilkan informasi dan tingkah laku Dog
        System.out.println("=== Dog ===");
        System.out.println("Nama: " + dog.getNama());
        System.out.println("Umur: " + dog.getUmur() + " tahun");
        System.out.println("Suara: " + dog.suara());
        dog.bermain();
        dog.makan();

        System.out.println();

        // Tampilkan informasi dan tingkah laku Cat
        System.out.println("=== Cat ===");
        System.out.println("Nama: " + cat.getNama());
        System.out.println("Umur: " + cat.getUmur() + " tahun");
        System.out.println("Suara: " + cat.suara());
        cat.bermain();
        cat.makan();
    }
}