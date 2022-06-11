package bai2;

public class Main {
    public static void main(String[] args) {
        Solove arr1 = new Solove(50, 0, Source.sourceFibonacci());
        Solove arr2 = new Solove(50, 30, Source.sourcePrime());

        arr1.setName("Mảng b");
        arr2.setName("Mảng a");

        arr1.start();
        arr2.start();

        System.out.println(arr1);
        System.out.println(arr2);
    }
}
