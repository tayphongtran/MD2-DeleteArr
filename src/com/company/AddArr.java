package com.company;


import java.util.Arrays;

public class AddArr {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr1Addarrr2 = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, arr1Addarrr2,0, arr1.length);
        System.arraycopy(arr2, 0, arr1Addarrr2,arr1.length, arr2.length);

        System.out.println(Arrays.toString(arr1Addarrr2));
    }


}
