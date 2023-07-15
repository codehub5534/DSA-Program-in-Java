package com.amit.dsa.arrays;

public class ArrayTraversal {

    static void traverse(int [] arr){
         if(arr==null){
             return;
         }
        int i=0;
         while(i<arr.length){
             System.out.print(arr[i]+"->");
             i++;
        }
        System.out.print("end");
    }

    public static void main(String args[]){
        int [] arr =new int[]{1,3,4,5,7};
        traverse(arr);
    }
}
