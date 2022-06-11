import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int randomLessThan100 = randomGenerator.nextInt(100);
        int randomLessThan1000 = randomGenerator.nextInt(1000);
        int randomBetween50And100 = randomGenerator.nextInt(49) + 51;

        System.out.println(randomBetween50And100);
    }
}
