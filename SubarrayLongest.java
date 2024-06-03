package org.example;

import java.util.Scanner;

public class SubarrayLongest {


    public static void main(String[] args) {


        int a []={6,2,2,-1,6};
        int n=a.length;
        int k=7;



//       int len= findMaxConsecutiveOnes(a);
//
//
//        System.out.println("single: " + len);
    }
    public static int singleNumber(int[] nums) {

        int maxi = nums[0];
        for (int i = 0; i < nums.length; i++) {
            maxi = Math.max(maxi, nums[i]);
        }
        int hash[]=new int[maxi+1];
        for(int i=0;i<nums.length;i++) {

            hash[nums[i]]++;
        }
        for(int i=0;i<hash.length;i++) {
            if(hash[i]==1){
                return i;
            }
        }
        return 1;

    }
    public int findMaxConsecutiveOnes(int[] nums) {
        int len=0;
        for(int i=0;i<nums.length;i++)  {
            if(nums[i]==0){

                len=Math.max(len,i-1);

            }
        }
        return len;
    }


    private static int subarrayoflength(int[] a, int k) {
        int n = a.length; // size of the array.
int sum=0;
        int len = 0;
        for (int i = 0; i < n; i++) { // starting index
            for (int j = i; j < n; j++) {

                // ending index

                  sum=sum+a[j];

                if (sum == k) {
                    len = Math.max(len, j - i + 1);
                }
            }
             sum=0;
        }
        return len;

    }
}
