package com.qihao.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * @author huangqihao
 * @version 1.0
 * @date 2020/6/10 16:56
 */
public class HeapSort {

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(100);
        }

        for (int i = arr.length - 1; i > 0; i--) {
            sort(arr, i);

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int n) {
        for (int i = (n - 1) / 2; i >= 0; i--) {
            int child = 2 * i + 1;
            if (child != n && arr[child] < arr[child + 1]) {
                child++;
            }
            if (arr[i] < arr[child]) {
                int temp = arr[child];
                arr[child] = arr[i];
                arr[i] = temp;
            }
        }
    }

}
