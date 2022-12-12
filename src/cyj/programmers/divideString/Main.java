package src.cyj.programmers.divideString;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int count = 0;
        int exCount = 0;
        char startChar = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (count == 0) {
                startChar = s.charAt(i);
                count++;
            } else {
                if (s.charAt(i) == startChar) {
                    count++;
                } else {
                    exCount++;
                }
            }

            if (count == exCount) {
                answer++;
                count = 0;
                exCount = 0;
            }
        }

        if (count > 0)
            answer++;
        return answer;
    }
}