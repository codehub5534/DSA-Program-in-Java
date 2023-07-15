package com.amit.dsa.arrays;

public class MaxMinInArray {

    private static void printMaxAndMin(int arr[]){
        if(arr==null){
            return;
        }
        int max=arr[0];
        int min=arr[0];
        int secmax=arr[0];
        for(int i=1;i<arr.length;i++){
           if(arr[i]>max){
               secmax=max;
               max=arr[i];
           }
            if(arr[i]>secmax&&arr[i]<max){
               secmax=arr[i];
           }
           min=Math.min(min,arr[i]);

        }
        System.out.println("max ->"+max);
        System.out.println("min ->"+min);
        System.out.println("secondMax ->"+secmax);
    }

    public static void main(String args[]){
        int arr[]= new int[]{1,2,3,6,-7,-5,8,4,11,9,13};
        printMaxAndMin(arr);
    }
}
