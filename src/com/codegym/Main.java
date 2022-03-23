package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {4,12,7,8,1,-6,-9};
        System.out.println("số nhỏ nhất là "+ minValue(arr));
    }
    public static int minValue(int [] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
