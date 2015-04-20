package com.example.administrator.java;

import java.util.Random;

/**
 * Created by Administrator on 2015/4/20.
 */
public class InsertionSort {
    public void straightInsertionSort(double[] sorted) {
        int sortedLen = sorted.length;
        for (int i = 2; i < sortedLen; i++) {
            if (sorted[i] < sorted[i - 1]) {
                sorted[0] = sorted[i];
                sorted[i] = sorted[i - 1];
                int insertPos = 0;
                for (int j = i - 2; j >= 0; j--) {
                    if (sorted[j] > sorted[0]) {
                        sorted[j+1] = sorted[j];
                    } else {
                        insertPos = j+1;
                        break;
                    }

                }
                sorted[insertPos] = sorted[0];
            }
        }
    }


    public static void main(String[] args) {
        Random random = new Random(5);
        int arraysize = 6;
        double[] sorted = new double[arraysize];
        System.out.println("Before Sort:");
        for (int i = 1; i < arraysize; i++) {
            sorted[i] = (int) (random.nextDouble() * 100);
            System.out.println(sorted[i]);
        }
        System.out.println();
        InsertionSort sorter = new InsertionSort();
        sorter.straightInsertionSort(sorted);
        System.out.println("After Sort 排序之后:");//排序之后
        for (int i = 1; i < sorted.length; i++) {

            System.out.println((int) sorted[i] + " ");
        }
        System.out.println();

    }
}