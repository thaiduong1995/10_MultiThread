package bai2;

import java.util.Random;

public class Source {
    public static int[] sourceArr;

    public static int[] sourceFibonacci() {
        sourceArr = new int[100];
        sourceArr[0] = 1;
        sourceArr[1] = 1;
        for (int i = 2; i < sourceArr.length; i++) {
            sourceArr[i] = sourceArr[i - 2] + sourceArr[i - 1];
        }
        return sourceArr;
    }

    public static int[] sourcePrime() {
        sourceArr = new int[100];
        int i = 0;
        boolean b = true;
        do {
            int prime = new Random().nextInt(1000) + 2;
            for (int j = 2; j <= prime / 2; j++) {
                if (prime % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                sourceArr[i] = prime;
                i++;
            }
            b = true;
        } while (i < sourceArr.length) ;
        return sourceArr;
    }
}
