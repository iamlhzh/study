package com.lhzh.study.leetcode.solution.no_5;

import org.apache.poi.util.ArrayUtil;
import org.springframework.util.StringUtils;

import java.lang.reflect.Array;

/**
 5. 最长回文子串
 给你一个字符串 s，找到 s 中最长的回文子串。



 示例 1：

 输入：s = "babad"
 输出："bab"
 解释："aba" 同样是符合题意的答案。
 示例 2：

 输入：s = "cbbd"
 输出："bb"


 提示：

 1 <= s.length <= 1000
 s 仅由数字和英文字母组成
 */
public class Solution_No_5 {
    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        String result = "";
        if(s==null||s.trim().length()==0){
            return result;
        }else{
            char[] chars = s.toCharArray();
            for(int i = 0;i<chars.length;i++){
                String ss = getLongestPalindromeOdd(i,chars);
                if(ss.length()>result.length()){
                    result = ss;
                }
                String even = getLongestPalindromeEven(i,chars);
                if(even.length()>result.length()){
                    result = even;
                }

            }
            return result;
        }
    }

    private static String getLongestPalindromeEven(int i, char[] chars) {
        String s ="";
        int k = i+1;
        int m = i;
        int length = chars.length;
        while(k-1>=0&&m+1<length){
            if(chars[k-1]==chars[m+1]){
                k=k-1;
                m=m+1;
            }else{
                break;
            }
        }
        for(;k<=m;k++){
            s = s+chars[k];
        }
        return s;
    }

    private static String getLongestPalindromeOdd(int i, char[] chars) {
        String s ="";
        int k = i;
        int m = i;
        int length = chars.length;
        while(k-1>=0&&m+1<length){
            if(chars[k-1]==chars[m+1]){
                k=k-1;
                m=m+1;
            }else{
                break;
            }
        }
        for(;k<=m;k++){
            s = s+chars[k];
        }
        return s;
    }

}
