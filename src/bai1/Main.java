package bai1;

public class Main {
    public static void main(String[] args) {
        Solove arr1 = new Solove(0, 7);
        Solove arr2 = new Solove(1, 4);

        arr1.setName("Luồng 1");
        arr2.setName("Luồng 2");

        arr1.start();
        arr2.start();

    }
}
