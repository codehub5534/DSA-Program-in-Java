package com.amit.dsa.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void sort(int arr []){

        for(int i=arr.length-1;i>=0;i--){

            for(int j=0;j<i;j++)
            {
                if(arr[i]<arr[j]){
                    int tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
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
