package bai1;

import java.util.Random;

public class Solove extends Thread{
    private int surplus;
    private int valueFilter;

    @Override
    public void run() {
        try {
            int index = 0;
            while (index < Result.resultArr.length) {
                if (index % 2 == surplus) {
                    do {
                        Result.resultArr[index] = new Random().nextInt(100);
                    } while (Result.resultArr[index] % valueFilter != 0);
                    System.out.println("Phần tử thứ " + (index + 1) + " của " + getName() + " là " + Result.resultArr[index]);
                }
                index++;
            }
            Thread.sleep(50);
        } catch (InterruptedException e) {
            System.out.println("Thread " + getName() + " is interrupted");
        }
    }

    public Solove() {
    }

    public Solove(int surplus, int valueFilter) {
        this.surplus = surplus;
        this.valueFilter = valueFilter;
    }


    public int getSurplus() {
        return surplus;
    }

    public void setSurplus(int surplus) {
        this.surplus = surplus;
    }

    public int getValueFilter() {
        return valueFilter;
    }

    public void setValueFilter(int valueFilter) {
        this.valueFilter = valueFilter;
    }
}
