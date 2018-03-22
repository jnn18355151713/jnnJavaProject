package com.jnn.suanfa;

/**
 * Created by Administrator on 2018/3/22.
 */


public class Sort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,19,4,6,80,3,58,73,11,34,8};
        int[] arr1 = new int[]{66,19,47,62,807,13,8,73,101,344,28};
        int[] array = bubbleSort(arr);
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");
        }
    }
    /*
    * 选择排序的思想就是：用第一个去跟下面的每一个比，比出来的最小值
    * 放在第一个位置，然后从第二个开始接着和下一个比较，以此类推，
    * i代表轮数，时间复杂度O(n²) 不稳定
    */
    public static  int[] selectSort(int[] arr){
        if (arr.length==0){
            return arr;
        }
        int temp;
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]>arr[j]){
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                }
            }
        }
        return  arr;
    }
    /*
     * 冒泡排序 两两比较 1和2比较 小的往前排,2和3比较...以此类推，
     * 第一轮结束，最后一个肯定是最大的  第二轮就不需要比较了 所以
     * 是j<arr.length-1-i i依然是轮数 稳定
     */

    public static  int[] bubbleSort(int[] arr){
        if (arr.length==0){
            return arr;
        }
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    /*
     *快速排序
     */

    public static  void quickSort(int[]arr){
        if (arr.length>0){
           quickSort(arr,0,arr.length-1);
        }
    }
    public static  void quickSort(int[]arr,int low,int high){
       if (low>high){
           return;
       }
        int i = low;
        int j =high;
        int pivot = arr[low];
        while (i<j){
            while (i<j&&arr[j]>pivot){
                j--;
            }
            while (i < j && arr[i]<pivot) {
                i++;
            }
            if (i<j){
                int temp = arr[i];
            }
        }
    }
}
