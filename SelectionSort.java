package com.amit.dsa.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void sort(int [] arr){
        for(int i=0;i<arr.length;i++){
            int minIndex=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int tmp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=tmp;

        }
    }

    public static void main(String args[]){
        int arr[] =new int[]{4,5,6,3,2,1};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(arr));
    }
}
