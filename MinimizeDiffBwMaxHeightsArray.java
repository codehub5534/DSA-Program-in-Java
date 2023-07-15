package com.amit.dsa.arrays;

import java.util.Arrays;

public class MinimizeDiffBwMaxHeightsArray {

    // 2 3 7 8 9
    public static int minimizedDiffBwMaxHeights(int arr[],int k){
        Arrays.sort(arr);
        int result = arr[arr.length-1]-arr[0];
        int smallest= arr[0]+k;
        int largest=arr[arr.length-1]-k;

        for(int i=0;i<arr.length-1;i++){
            smallest=Math.min(smallest,arr[i+1]-k);
            largest=Math.max(largest,arr[i]+k);
            if(smallest<0)continue;
            result=Math.min(result,largest-smallest);
        }

        return result;
    }

    public static void main(String args[]){
        int [] arr = new int[]{2,3,4,9,8,13,11};
        int res =minimizedDiffBwMaxHeights(arr,3);
        System.out.println(res);
     }
}
