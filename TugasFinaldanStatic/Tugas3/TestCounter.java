package Tugas3;

public class TestCounter {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();

        System.out.println("Total Counter instances: " + Counter.getInstanceCount());
    }
}

