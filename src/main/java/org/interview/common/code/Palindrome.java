package org.interview.common.code;

import java.util.HashMap;
import java.util.Map;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int oddCount = 0;
        for (int i : map.values()) {
            if (i % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount <= 1;
    }

    public static void main(String[] args) {
        // 回文
        String str = "abcba";
        if (isPalindrome(str)) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + " is not palindrome");
        }
        String str2 = "abac";
        if (isPalindrome(str2)) {
            System.out.println(str2 + " is palindrome");
        } else {
            System.out.println(str2 + " is not palindrome");
        }
    }
}
