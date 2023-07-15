package com.amit.dsa.arrays;

public class MaximumSumSubArray {
    // using kadane's algorithm for efficient approach and O(N) Time complexity

    public static int maxSumSubArrayUsingKadane(int [] arr){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for (int i=0;i<arr.length;i++){
            currSum=currSum+arr[i];
            currSum=Math.max(currSum,0);
            maxSum=Math.max(currSum,maxSum);
        }
        return Math.max(maxSum, 0);
    }

    //1,2,-3,4,5,-3,8,-6,2,3
    public static int printMaxSumSubArray(int [] arr){
        if(arr==null){
            return 0;
        }
        int result=Integer.MIN_VALUE;
        int l=arr.length;
        int currSum=0;

        for(int i=0;i<l;i++){
            currSum=0;
            for(int j=i;j<l;j++){
                currSum=currSum+arr[j];
                if(currSum>result){
                    result=currSum;
                }
            }
        }
        return result;
    }

    public static void main(String args[]){
        int [] arr =new int[]{10,-20,-30,4,6,-3,8,-6,2,3};
        int sum =printMaxSumSubArray(arr);
        System.out.println(sum);
        int kadanesum =maxSumSubArrayUsingKadane(arr);
        System.out.println(kadanesum);
    }
}
