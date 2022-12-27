package cyj.programmers.fruitSeller;

import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int end = score.length - 1, boxCount = score.length / m;
        for (int i = 0; i < boxCount; i++) {
            answer += score[end - (m - 1)] * m;
            end -= m;
        }

        return answer;
    }
}

public class Main {

}
