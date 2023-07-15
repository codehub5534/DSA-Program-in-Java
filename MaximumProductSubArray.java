package com.amit.dsa.arrays;

public class MaximumProductSubArray {

    static int maxProductSubArray(int[] arr,int n){
        if(arr==null){
            return 1;
        }
    // 1 2 -2 -3 4 5

        int result =1;
        int min=1;
        int max=1;

        for(int i=0;i<n;i++){
            if(arr[i]>0){
                max=max*arr[i];
                min =Integer.min(min,min*arr[i]);
            }else if(arr[i]<0){
                int tmp=max;
                max=min;
                min=tmp;
                min=min*arr[i];
                max=Math.max(1,max*arr[i]);

            }else {
                min=1;
                max=1;
            }
            result=Math.max(result,max);
        }

        return result;
    }

    public static void main(String args[]){
        int [] arr =new int[]{1,2,4,-5,-6};
        int prouct =maxProductSubArray(arr,5);
        System.out.println(prouct);
    }
}
