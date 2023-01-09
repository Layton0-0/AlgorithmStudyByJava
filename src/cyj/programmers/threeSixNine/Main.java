package src.cyj.programmers.threeSixNine;

class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] arr = String.valueOf(order).split("");
        for (String s : arr) {
            int gameNum = Integer.parseInt(s);
            if (gameNum == 3 || gameNum == 6 || gameNum == 9)
                answer++;
        }

        return answer;
    }
}

public class Main {

}