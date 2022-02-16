package com.lhzh.study.leetcode.solution.no_3;

/**
 * @author 卢宏政
 * @date 2022/1/25 17:08
 */

import org.springframework.util.StringUtils;

import java.util.*;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * 示例 4:
 * <p>
 * 输入: s = ""
 * 输出: 0
 *  
 * <p>
 * 提示：
 * <p>
 * 0 <= s.length <= 5 * 104
 * s 由英文字母、数字、符号和空格组成
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_No_3 {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
    Map<Character, Integer> characterIntegerMap = new HashMap<>();
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int maxLength = 1;
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        int base = 0;
        for (int i = 0; i < s.length(); i++) {
            char aChar = s.charAt(i);
            if (characterIntegerMap.containsKey(aChar) && characterIntegerMap.get(aChar) >= base) {
                base = characterIntegerMap.get(aChar) + 1;
                characterIntegerMap.put(aChar, i);
            } else {
                characterIntegerMap.put(aChar, i);
                if (i - base + 1 > maxLength) {
                    maxLength = i - base + 1;
                }
            }
        }
        return maxLength;
    }

    public static int lengthOfLongestSubstring1(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int maxLength = 1;
        Map<Character, List<Integer>> map = new HashMap<>();
        List<List<Integer>> listList = new ArrayList<>();
        char[] chars = s.toCharArray();
        int charLength = chars.length;
        for (int i = 0; i < charLength; i++) {
            char aChar = chars[i];
            if (map.containsKey(aChar)) {
                map.get(aChar).add(i);
            } else {
                List<Integer> indexList = new ArrayList<>();
                indexList.add(i);
                map.put(aChar, indexList);
                listList.add(indexList);
            }
        }
        for (int m = 0; m < charLength - maxLength + 1; m++) {
            for (int n = m + maxLength; n < charLength; n++) {
                if (n - m + 1 > maxLength) {
                    boolean flag = checkLength(m, n, listList);
                    if (flag) {
                        break;
                    } else {
                        maxLength = n - m + 1;
                    }
                }
            }
        }
        return maxLength;
    }

    private static boolean checkLength(int m, int n, List<List<Integer>> listList) {
        boolean flag = false;
        for (List<Integer> indexList : listList) {
            int num = 0;
            if (flag) {
                break;
            }
            for (Integer index : indexList) {
                if (index >= m && index <= n) {
                    num++;
                }
                if (num >= 2) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }
}
