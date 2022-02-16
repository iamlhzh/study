package com.lhzh.study.polymorphism.test2;

public class Solution {
    public class Father {
        public String name ="father";
        public String getName() {
            return name;
        }
    }
    public class Son {
        public String name ="son";

        public String getName() {
            return name;
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution.Father father =solution.new Father();
        System.out.println(father.getName());
    }
}
