package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FindMedianSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int nums2[]){
        double d = 2.0f;

        List<Integer> nums = new ArrayList<>();
        if(nums1 != null){
            nums = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        }

        if(nums2 != null){
            nums.addAll(Arrays.stream(nums2).boxed().collect(Collectors.toList()));
        }

        System.out.println(nums.size());
        return d;
    }
}
