package com.amit.dsa.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void sort(int [] arr ){
        for(int i=1;i< arr.length;i++){
            int j=i-1;
            int tmp=arr[i];
            while (j>-1 && tmp<arr[j]){
                 arr[j+1]=arr[j];
                arr[j]=tmp;
                j--;

            }
        }
    }

    public static void main(String args[]){
        int arr[] =new int[]{6,5,1,3,7,9,4};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(arr));
    }
}
