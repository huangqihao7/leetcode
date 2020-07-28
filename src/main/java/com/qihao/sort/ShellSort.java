package com.qihao.sort;

import java.util.Arrays;

/**
 * 希尔排序
 *
 * @author huangqihao
 * @version 1.0
 * @date 2020/4/8 11:05
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 3, 1, 8, 6, 9, 0, 11, 4};
        shellSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public static void shellSort(int[] arr) {
        int length = arr.length;
        int grep = length / 2;

        while (grep > 0) {
            for (int i = grep; i < arr.length; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= 0; j -= grep) {
                    if (j - grep >= 0 && temp < arr[j - grep]) {
                        arr[j] = arr[j - grep];
                    } else {
                        break;
                    }
                }
                arr[j] = temp;
            }
            grep /= 2;
        }
    }

}
