package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Collections;

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

        Collections.sort(nums);

        int median = nums.size() / 2;
        if(nums.size()%2 == 0){
            int left = median - 1;
            d = nums.get(median) + nums.get(left) / 2f;
        }else{
            d = nums.get(median);
        }
        System.out.println(nums.size());
        return d;
    }
}
