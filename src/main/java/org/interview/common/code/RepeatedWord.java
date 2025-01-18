package org.interview.common.code;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatedWord {

    public static String searchingRepeatedWord(String str) {
        int maxRepeatedCount = 0;
        String maxRepeatedWord = "";
        String[] words = str.split("\\s+"); // space or tab or newline with multiple of then (+)
        for (String word : words) {
            Map<Character, Integer> map = new HashMap<>();
            for (char c : word.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            int repeatedCount = 0;
            for (int i : map.values()) {
                if (i > 1) {
                    repeatedCount++;
                }
            }
            if (repeatedCount > maxRepeatedCount) {
                maxRepeatedCount = repeatedCount;
                maxRepeatedWord = word;
            }
        }
        if (maxRepeatedCount == 0) {
            return "-1";
        }
        return maxRepeatedWord;
    }

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
        /*
         * StringBuilder sb2 = new StringBuilder();
         * for(int i = str.length() - 1 ; i >= 0 ; i++){
         * sb.append(str.charAt(i));
         * }
         */
    }

    public static void main(String[] args) {
        // find the word with maximum repeated character count
        // input can be a sentence
        System.out.print("Input: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Original String: " + str);
        String str2 = searchingRepeatedWord(str);
        System.out.println("Word with maximum repeated character count : " + str2);
        System.out.println("Reversed of the word: " + reverse(str2));
    }
}
