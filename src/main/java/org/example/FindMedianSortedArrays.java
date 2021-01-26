package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Collections;

public class FindMedianSortedArrays {

    public static double findMedianSortedList(int[] nums1, int nums2[]){
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

    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
        int[] nums = new int[nums1.length + nums2.length];
        double d = 0f;

        addArray(nums, nums1, 0);
        addArray(nums, nums2, nums1.length);

        Arrays.sort(nums);

        int median = nums.length / 2;
        if(nums.length%2 == 0){
            int left = median - 1;
            d = nums[median] + nums[left] / 2f;
        }else{
            d = nums[median];
        }

        return d;

    }

    public static int[] addArray(int[] nums, int[] nums1, int count){
        for(int i=0; i< nums1.length; i++){
            ///System.out.println(count + i);
            nums[count + i] = nums1[i];
        }

        return nums;
    }
}
