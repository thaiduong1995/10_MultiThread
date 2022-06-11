package bai2;

import java.util.Random;

public class Solove extends Thread{
    private int[] resultArr;
    private int[] sourceArr;
    private int size;
    private int condition;

    @Override
    public String toString() {
        String result = "\nTa có mảng " + getName() + ":\n";
        for (int i = 0; i < size; i++) {
            result += "Phần tủ thứ " + (i + 1) + " của " + getName() + " là: " + resultArr[i] + "\n";
        }
        return result;
    }

    @Override
    public void run() {
        try {
            int index = 0;
            resultArr = new int[size];
            for (int i = 0; i < sourceArr.length; i++) {
                if (sourceArr[i] > condition) {
                    resultArr[index] = sourceArr[i];
                    System.out.println("Phần tủ thứ " + (index + 1) + " của " + getName() + " là: " + resultArr[index]);
                    index++;
                }
                if (index >= size) {
                    break;
                }
            }
            Thread.sleep(50);
        } catch (InterruptedException e) {
            System.out.println("Thread " + getName() + " is interrupted");
        }
    }

    public Solove() {
        resultArr = new int[size];
    }

    public Solove(int size, int condition, int[] sourceArr) {
        this.size = size;
        this.condition = condition;
        this.sourceArr = sourceArr;
    }

    public int[] getResultArr() {
        return resultArr;
    }

    public void setResultArr(int[] resultArr) {
        this.resultArr = resultArr;
    }

    public int[] getSourceArr() {
        return sourceArr;
    }

    public void setSourceArr(int[] sourceArr) {
        this.sourceArr = sourceArr;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
