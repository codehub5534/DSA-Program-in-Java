package com.amit.dsa.arrays;

public class ArrayReversal {

    static void arrayReversalAtPosition(int [] arr){
        int front=0;
        int last=arr.length-1;
        while(front<last){
            int tmp=arr[front];
            arr[front]=arr[last];
            arr[last]=tmp;
            front++;
            last--;
        }
        for(int i: arr){
            System.out.print(i+"->");
        }
        System.out.println("------End");
    }

    public static void main(String args[]){
        int[] arr =new int[]{6,4,1,8};
        for(int i: arr){
            System.out.print(i+"->");
        }
        System.out.println("End");
        System.out.println("-----After Reversal-------");
        arrayReversalAtPosition(arr);
    }
}
