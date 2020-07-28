package com.qihao.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * @author huangqihao
 * @version 1.0
 * @date 2020/6/12 10:36
 */
public class QuickSort {

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 数组第一位作为对比元素，把后面元素一分为二，小于对比元素的在左边，大于对比元素的在右边
     * @param arr   数组
     * @param start 起始位置
     * @param end   结束位置
     */
    public static void sort(int[] arr, int start, int end) {
        if (start >= end) return;

        int left = start + 1; // 记录找到比起始元素小的下标位置
        int right = end;    // 记录找到比起始元素大的下标位置
        while (left != right) {
            // 从左开始遍历，找到比第一位大的元素
            for (int i = left; i < arr.length; ) {
                // 比第一位大，且下标不等于右边的下标，当前就下标递增
                if (arr[start] >= arr[i] && i != right) {
                    i++;
                } else {
                    left = i;
                    break;
                }
            }

            // 从右开始遍历，找到比第一位小的元素
            for (int i = right; i >= left; ) {
                // 比第一位小，且下标不等于左边的下标，当前就下标递减
                if (arr[i] > arr[start] && i != left) {
                    i--;
                } else {
                    right = i;
                    break;
                }
            }
            // 交换左边大元素和右边小元素的数据
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

        // 两边下标相等时退出循环，所以此下标的元素是否大于第一个元素，大于则左移一位交换元素，否则当前位置交换元素
        if (arr[right] > arr[start])
            left--;
        int temp = arr[left];
        arr[left] = arr[start];
        arr[start] = temp;

        // 第一个元素移至到合适位置后，左边是比它小的元素，右边是比它大的元素，然后不断递归两边的元素，直至排序完成为止
        sort(arr, start, left - 1);
        sort(arr, left + 1, end);
    }

}
