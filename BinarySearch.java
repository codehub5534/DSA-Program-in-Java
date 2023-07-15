package com.amit.dsa.arrays;

public class BinarySearch {

    public static int indexOfElements(int arr[],int target){
        int result =-1;
        if(arr==null){
            return -1;
        }
        int begin =0;
        int end = arr.length;
        int mid =-1;
        while( begin<end ){
             mid = (begin+end)/2;
             if(arr[mid]==target){
                 return mid;
             } else if (arr[mid]<target) {
                 begin=mid+1;
             }else {
                 end=mid-1;
             }
        }
        return result;
    }

    public static void main(String args[]){
        int arr[] =new int[]{1,3,7,9,11,12};
        int idx=indexOfElements(arr,3);
        System.out.println(idx);
    }
}
