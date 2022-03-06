package com.lhzh.study.arraysort;

/**
 * @author 卢宏政
 * @date 2022/3/4 9:57
 */
public class ArraySort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 10, 1, 2, 8, 6, 3, 5, 9, 3, 2, 4, -2, 0, -7};
//        directInsertSort(arr);
//        maopaoSort(arr);
        Quick_Sort(arr, 0, arr.length - 1);
        bianliArr(arr);
    }

    private static void bianliArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    /*
    快速排序
*/
    private static void quickSort(int[] arr, int begin, int end) {
        //
    }

    private static void Quick_Sort(int arr[], int begin, int end) {
        if (begin > end)
            return;
        int tmp = arr[begin];
        int i = begin;
        int j = end;
        while (i != j) {
            while (arr[j] >= tmp && j > i)
                j--;
            while (arr[i] <= tmp && j > i)
                i++;
            if (j > i) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        arr[begin] = arr[i];
        arr[i] = tmp;
        Quick_Sort(arr, begin, i - 1);
        Quick_Sort(arr, i + 1, end);
    }

    /*
冒泡排序
 */
    private static void maopaoSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                int i1 = arr[j];
                int i2 = arr[j + 1];
                if (i1 > i2) {
                    int temp = i1;
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /*
    直接插入排序
     */
    private static void directInsertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];
            if (num >= arr[i - 1]) {
                continue;
            }
            for (int j = i - 1; j >= 0; j--) {
                int arrNum = arr[j];
                if (num >= arrNum) {
                    //右侧插入点
                    for (int k = i; k >= j + 2; k--) {
                        arr[k] = arr[k - 1];
                    }
                    arr[j + 1] = num;
                    break;
                } else if (j == 0) {
                    //左侧插入点
                    for (int k = i; k >= 1; k--) {
                        arr[k] = arr[k - 1];
                    }
                    arr[j] = num;
                    break;
                }
            }
        }
    }
}
