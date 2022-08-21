package com.company;

import java.util.Scanner;

public class binary_search_kunal {
    public static void main(String[] args) {

//        int start = 0;
//        int end = n;
//        int mid = 0;
//        int temp = 0;
//
//        while (start <= end) {
//            mid = start + (end - start) / 2;
//            if (isBadVersion(mid)) {
//                temp = mid;
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }
//        }





        int n = 16;
        int start = 0;
        int end = n ;
        boolean square = true;
        while (start <= end ){
            int mid = start + (end - start)/2 ;
            if(mid*mid == n){
                 ;
            }
            else if (mid*mid < n){
                start =  mid + 1;
            }
            else{
                end = mid-1 ;
            }





//            int start = 0;
//            int end = letters.length - 1;
//            while (start <= end) {
//                int mid = start + (end - start) / 2;
//                if (target < letters[mid]) {
//                    end = mid - 1;
//                } else if (target > letters[mid]){
//                    start = mid + 1;
//                } else {
//                    start = mid + 1;
//                }
//            }
//            return letters[start % letters.length];










//            class Solution {
//                public int findKthPositive(int[] arr, int k) {
//                    int start = 0;
//                    int end = arr.length;
//                    while(start<end)
//                    {
//                        int mid = start + (end-start)/2;
//                        if(arr[mid]-(mid+1) >= k)
//                        {
//                            end = mid;
//                        }
//                        else{
//                            start = mid+1;
//                        }
//                    }
//                    return start + k;

//                }
        }
    }

}
