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
        int[] nums1 = {1};
        int []nums2 = {};
        double medianSortedArrays = findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0.0;
        int i1 = nums1.length;
        int i2 = nums2.length;
        int sum = i1 + i2;
        int index = 0;
        int mid1 = 0;
        int mid2 = 0;
        int mid3 = 0;
        int index1 = 0;
        int index2 = 0;
        int letter = 0;
        boolean flag = (sum) %2==0;
        if(flag){
            index1 = (sum) /2;
            index2 = index1+1;
        }else{
            index = (sum) /2+1;
        }
        int a = 0;
        int b = 0;
        for(int point = 1;point<=sum;point++){
            if(a<i1&&b<i2){
                if(nums1[a]<nums2[b]){
                    letter = nums1[a];
                    a++;
                }else{
                    letter = nums2[b];
                    b++;
                }
                if(flag){
                    if(point==index1){
                        mid2 = letter;
                    }
                    if(point==index2){
                        mid3=letter;
                        break;
                    }
                }else{
                    if(point==index){
                        mid1=letter;
                        break;
                    }
                }
            }else if(a>=i1&&b<i2){
                letter = nums2[b];
                b++;
                if(flag){
                    if(point==index1){
                        mid2 = letter;
                    }
                    if(point==index2){
                        mid3=letter;
                        break;
                    }
                }else{
                    if(point==index){
                        mid1=letter;
                        break;
                    }
                }
            }else if(a<i1&&b>=i2){
                letter = nums1[a];
                a++;
                if(flag){
                    if(point==index1){
                        mid2 = letter;
                    }
                    if(point==index2){
                        mid3=letter;
                        break;
                    }
                }else{
                    if(point==index){
                        mid1=letter;
                        break;
                    }
                }
            }
        }
        if (flag){
            result = (mid2+mid3)/2d;
        }else{
            result =mid1;
        }
        return result;
    }

}
