package com.lhzh.study.leetcode.solution.no_2;

import java.util.LinkedList;

/**
 * @author 卢宏政
 * @date 2022/1/25 17:09
 */
public class No_2_TwoNumberAdd {
    public LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> result = new LinkedList();
        int size1 = l1.size();
        int size2 = l2.size();
        int max = Math.max(size1, size2);
        Integer base = 0;
        for (int i = 0; i < max; i++) {
            Integer integer = l1.get(i);
            Integer integer1 = l2.get(i);
            if (integer != null && integer1 != null) {
                Integer integer2 = integer + integer1 + base;
                if (integer2 >= 10) {
                    result.add(integer2 % 10);
                    base = 1;
                } else {
                    result.add(integer2);
                    base = 0;
                }
            } else if (integer != null && integer1 == null) {
                Integer integer2 = integer + base;
                if (integer2 >= 10) {
                    result.add(integer2 % 10);
                    base = 1;
                } else {
                    result.add(integer2);
                    base = 0;
                }
            } else if (integer == null && integer1 != null) {
                Integer integer2 = integer1 + base;
                if (integer2 >= 10) {
                    result.add(integer2 % 10);
                    base = 1;
                } else {
                    result.add(integer2);
                    base = 0;
                }
            }
        }
        if (base > 0) {
            result.add(base);
        }
        return result;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode temp = result;
        int base = 0;
        while (l1 != null || l2 != null) {
            int i1 = l1 == null ? 0 : l1.val;
            int i2 = l2 == null ? 0 : l2.val;
            int i3 = i1 + i2 + base;
            temp.val = i3 % 10;
            if (i3 >= 10) {
                base = 1;
            } else {
                base = 0;
            }
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            if (l1 != null || l2 != null) {
                temp.next = new ListNode(0);
                temp = temp.next;
            }
        }
        if (base > 0) {
            temp.next = new ListNode(base);
        }
        return result;
    }
}
