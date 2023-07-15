package com.amit.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

public class UnionIntersectionSortedArray {

    public static int [] unionOfSortedArr(int[] arr1,int[] arr2){
        int [] res =new int[arr1.length+arr2.length];
        List<Integer> intersect= new ArrayList<>();
        int l = arr1.length;
        int m = arr2.length;
        int i=0;
        int j=0;
        int k=0;
        while (i<l&&j<m){
            if(arr1[i]<arr2[j]){
                res[k++]=arr1[i++];
            } else if (arr1[i]>arr2[j]) {
                res[k++]=arr2[j++];
            }else {
                res[k++]=arr2[j++];
                intersect.add(arr1[i]);
            }
        }
        while (i<l){
            res[k++]=arr1[i++];
        }
        while (j<m) {
            res[k++] = arr2[j++];
        }
        if(!intersect.isEmpty()){
            System.out.println("-------Intersection------");
            for(Integer in:intersect){
                System.out.print(in+"->");
            }
            System.out.println("-------Intersection  End------");
        }

        return res;
    }

    public static void main(String args[]){
        int arr[]= new int[]{3,6,9,9};
        int arr2[]= new int[]{1,2,5,6,7,8,9,15};
        int res []=unionOfSortedArr(arr,arr2);
        for (int i:res){
            System.out.print(i+"-->");
        }
    }
}
