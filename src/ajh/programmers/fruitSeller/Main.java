package ajh.programmers.fruitSeller;

import java.util.Arrays;

public class Main {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int len = score.length;
        int[] input = new int[len];

        for(int i=0 ; i < len ; i++) {
            input[i] = score[len-1-i];
        }

        for(int i=0 ; i < len-1 ; i += m) {
            if(len - i < m) {
                // 배열에 남은 숫자의 개수가 상자에 담아야하는 개수보다 적을 때 종료
                break;
            }
            else {
                answer += (input[i+m-1] * m);
            }
        }
        return answer;
    }
}
