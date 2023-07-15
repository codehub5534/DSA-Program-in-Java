package com.amit.dsa.arrays;

public class ArrangeNumberInSorting {

    //using counter
    static void arrangeZeroOneAndTwoInSorted(int[] arr){
        //11220121  ----> 01111222
        int count0=0;
        int count1=0;
        int count2=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count0++;
            }
            if(arr[i]==1){
                count1++;
            }
            if(arr[i]==2){
                count2++;
            }
        }
         int k=0;
        for(int i=0;i<count0;i++){
           arr[k]=0;
           k++;
        }
        for(int i=0;i<count1;i++){
            arr[k]=1;
            k++;
        }
        for(int i=0;i<count2;i++){
            arr[k]=2;
            k++;
        }
        for(int i:arr){
            System.out.print(i+"->");
        }

        System.out.println("end");
    }

    static void arrangeNumberUsingPartitionTheorem(int [] arr){
        //001222001----
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(low<high&&mid< arr.length&&mid<high){
            if(arr[mid]==0){
                int tmp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=tmp;
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                int tmp=arr[mid];
                arr[mid]=arr[high];
                arr[high] = tmp;
                high--;
            }
        }

        for(int k:arr){
            System.out.print(k+"->");
        }

        System.out.println("end");
    }
    public static void main(String args[]){
        int [] arr =new int[]{2,2,1,1,0,0};
        arrangeZeroOneAndTwoInSorted(arr);
        arrangeNumberUsingPartitionTheorem(arr);
    }
}
