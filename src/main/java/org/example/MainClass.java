package org.example;

public class MainClass {

    public static void main(String[] arg){
        System.out.println("test");

        int[] num1 = new int[]{1,2};
        int[] num2 = new int[]{2,3};
        System.out.println(FindMedianSortedArrays.findMedianSortedArrays(num1, num2));
    }


}
