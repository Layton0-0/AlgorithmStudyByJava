package src.cyj.programmers.lotto;

public class Main {

}

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int zeroCount = 0;
        int count = 0;

        for (int l : lottos) {
            if (l == 0) {
                zeroCount++;
            } else {
                for (int w : win_nums) {
                    if (l == w)
                        count++;
                }
            }
        }

        answer[1] = 7 - count;
        if (answer[1] > 6)
            answer[1] = 6;

        answer[0] = 7 - (count + zeroCount);
        if (answer[0] > 6)
            answer[0] = 6;

        return answer;
    }
}
