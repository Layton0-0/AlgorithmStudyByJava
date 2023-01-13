package src.cyj.programmers.numberStringAndWords;

import java.util.*;

public class Main {

}

class Solution {
    public int solution(String s) {
        int answer = 0;

        int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        String[] words = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        StringBuilder temp = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                temp.append(c);
            } else {
                ans.append(c);
            }

            if (temp.length() > 0) {
                String tempS = temp.toString();
                int idx = Arrays.asList(words).indexOf(tempS);
                if (idx > -1) {
                    ans.append(nums[idx]);
                    temp = new StringBuilder();
                }
            }

        }
        answer = Integer.parseInt(ans.toString());

        return answer;
    }
}
