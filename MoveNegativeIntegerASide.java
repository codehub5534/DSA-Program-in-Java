package com.amit.dsa.arrays;

public class MoveNegativeIntegerASide {

    public static int[]  arrangeNegativeLeftSide(int arr[]){
        //-1 -2 3 4 -6 -7  8   --> -1-2-6-7 3 4 8
        int negate[]=new int[arr.length];
        int postv[] =new int[arr.length];
        int j=0;
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                negate[j]=arr[i];
                j++;
            }else{
                postv[k++]=arr[i];
            }
        }
        int countOfNegative =j;
        int i=0;
        for( j=0;j<countOfNegative;j++){
            arr[i]=negate[j];
            i++;
        }
        for( k=0;k<arr.length-countOfNegative;k++){
            arr[i]=postv[k];
            i++;
        }
        return arr;
    }

    public static int[] moveNegativeUsingPartition(int arr[]){
        int low=0;
        int high=arr.length-1;
        int mid=0;

        while(low<high){
            if(arr[low]<0){
                low++;
            }else {

                while(arr[high]>=0){
                    high--;
                }
                int tmp=arr[high];
                arr[high]=arr[low];
                arr[low]=tmp;
                high--;
                low++;
            }
        }

        return arr;
    }
    public static void main(String args[]){
        int arr[]= new int[]{1,-1,0,0,-7,-8,7,8,6,-2,0,0,2,3,6,-7,-5,8,4,11,9,13};
        int res[] = arrangeNegativeLeftSide(arr);
        for(int k:res){
            System.out.print(k+"->");
        }
        System.out.println("-----------");
        int arr2[]= new int[]{9,9,8,7,7,-2,0,0,0,0,-6,-7,-1,1,0,7,8,9};
      //  100-1-20
      //          -200-110
         int []res2 = moveNegativeUsingPartition(arr2);
        for(int k:res2){
            System.out.print(k+"->");
        }
    }
}
