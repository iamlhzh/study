package com.lhzh.study.leetcode.solution.no_4;

/**
 * @author 卢宏政
 * @date 2022/1/25 17:08
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 4. 寻找两个正序数组的中位数
 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。

 算法的时间复杂度应该为 O(log (m+n)) 。



 示例 1：

 输入：nums1 = [1,3], nums2 = [2]
 输出：2.00000
 解释：合并数组 = [1,2,3] ，中位数 2
 示例 2：

 输入：nums1 = [1,2], nums2 = [3,4]
 输出：2.50000
 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5




 提示：

 nums1.length == m
 nums2.length == n
 0 <= m <= 1000
 0 <= n <= 1000
 1 <= m + n <= 2000
 -106 <= nums1[i], nums2[i] <= 106
 */
public class Solution_No_4 {
    public static void main(String[] args) {
        int[] nums1 = {1,3,4,5,6,7,8,9};
        int []nums2 = {2};
        double medianSortedArrays = findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0d;
        int i1 = nums1.length;
        int i2 = nums2.length;
        int index = (i1+i2)/2+1;
        boolean flag = (i1+i2)%2==0;
        int k = 0;
        int i =0;
        int j=0;
        int littler;
        for (; i < i1; i++) {
            if(j<i2){
                for (; j < i2; j++) {
                    if(i<i1){
                        if(nums1[i]<nums2[j]){
                            littler = nums1[i];
                            k++;
                            if(index==k){
                                return littler;
                            }
                            break;
                        }else{
                            littler = nums2[j];
                            k++;
                            if(index==k){
                                return littler;
                            }
                        }

                    }else{
                        littler = nums2[j];
                        k++;
                        if(index==k){
                            return littler;
                        }
                    }
                }
            }else{
                littler = nums1[i];
                k++;
                if(index==k){
                    return littler;
                }
            }
        }
        return result;
    }

}
