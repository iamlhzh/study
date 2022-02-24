package com.lhzh.study.leetcode.solution.no_6;

/**
 * 6. Z 字形变换
 * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
 * <p>
 * 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
 * <p>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
 * <p>
 * 请你实现这个将字符串进行指定行数变换的函数：
 * <p>
 * string convert(string s, int numRows);
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "PAYPALISHIRING", numRows = 3
 * 输出："PAHNAPLSIIGYIR"
 * 示例 2：
 * 输入：s = "PAYPALISHIRING", numRows = 4
 * 输出："PINALSIGYAHRPI"
 * 解释：
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 * 示例 3：
 * <p>
 * 输入：s = "A", numRows = 1
 * 输出："A"
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= s.length <= 1000
 * s 由英文字母（小写和大写）、',' 和 '.' 组成
 * 1 <= numRows <= 1000
 */
public class Solution_No_6 {
    public static void main(String[] args) {
        String s = "AB";
        System.out.println(convert(s,1));
    }
    public static String convert2(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        String result = "";
        String []strArr = new String[numRows];
        int k = 0;
        boolean flag = true;
        for(int i=0;i<s.length();i++) {
            if(strArr[k]==null) {
                strArr[k] = "" + s.charAt(i) ;
            }else {
                strArr[k] = strArr[k] + s.charAt(i);
            }
            if(k == numRows-1) {
                flag = false;
            }
            if(k == 0) {
                flag = true;
            }
            if(flag) {
                k++;
            } else {
                k--;
            }
        }
        for(int m =0;m<numRows;m++) {
            if(strArr[m]!=null){
                result = result + strArr[m];
            }
        }
        return result;
    }

    public static String convert(String s, int numRows) {
        String result = "";
        if(numRows == 1){
            return s;
        }
        String []strArr = new String[numRows];
        char[] chars = s.toCharArray();
        int k = 0;
        boolean flag = true;
        for(int i=0;i<chars.length;i++) {
            if(strArr[k]==null) {
                strArr[k] = "" + chars[i] ;
            }else {
                strArr[k] = strArr[k] + chars[i] ;
            }
            if(k == numRows-1) {
                flag = false;
            }
            if(k == 0) {
                flag = true;
            }
            if(flag) {
                k++;
            } else {
                k--;
            }
        }
        for(int m =0;m<numRows;m++) {
            if(strArr[m]!=null){
                result = result + strArr[m];
            }
        }
        return result;
    }

}
