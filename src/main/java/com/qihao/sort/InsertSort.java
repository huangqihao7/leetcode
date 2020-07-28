package com.qihao.sort;

/**
 * 直接插入排序
 *
 * @author huangqihao
 * @version 1.0
 * @date 2020/4/7 16:47
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 3, 1, 8, 6, 9, 0, 1, 2};
        sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j;
            for (j = i; j > 0; j--) {
                if (arr[j - 1] > temp) {
                    arr[j] = arr[j - 1];
                } else {
                    break;
                }
            }
            arr[j] = temp;
        }
    }


}



