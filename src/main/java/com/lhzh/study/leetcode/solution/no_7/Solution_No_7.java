package com.lhzh.study.leetcode.solution.no_7;

import java.util.ArrayList;
import java.util.List;

/**
 * 7. 整数反转
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * <p>
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 * <p>
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：x = 123
 * 输出：321
 * 示例 2：
 * <p>
 * 输入：x = -123
 * 输出：-321
 * 示例 3：
 * <p>
 * 输入：x = 120
 * 输出：21
 * 示例 4：
 * <p>
 * 输入：x = 0
 * 输出：0
 * <p>
 * <p>
 * 提示：
 * <p>
 * -231 <= x <= 231 - 1
 */
public class Solution_No_7 {
    public static void main(String[] args) {
        int x = 1534236469;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        List<Integer> intList = new ArrayList<>();
        int i = 0;
        while (true) {
            if (x == 0) {
                break;
            }
            int i1 = x % 10;
            intList.add(0, i1);
            x = x / 10;
        }
        int result = 0;
        for (int k = 0; k < intList.size(); k++) {
            Integer integer = intList.get(k);
            if(k==9&&(integer>2||(integer==2&&result>147483647||result<-147483648))){
                return 0;
            }
            int pow = (int) Math.pow(10, k);
            result = result + integer * pow;
        }
        return result;
    }

}
