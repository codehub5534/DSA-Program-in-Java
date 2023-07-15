package com.amit.dsa.arrays;

public class CyclicRotatedArray {

    // 1 2 3 4 --->4 1 2 3

    public static void rotateArrayByOne(int arr[]){
        if(arr==null){
            return;
        }

        int tmp = arr[arr.length-1];

        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=tmp;

        for (int i:arr){
            System.out.print(i+"-->");
        }
    }

    public static void main(String args[]){
        int arr[] =new int[]{2,3,4,5};
        for (int i:arr){
            System.out.print(i+"-->");
        }
        System.out.println("-----------");
        rotateArrayByOne(arr);
    }
}
