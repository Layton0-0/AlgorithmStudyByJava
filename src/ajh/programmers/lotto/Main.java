package ajh.programmers.lotto;

public class Main {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroCount = 0;
        int correct = 0;

        for(int i = 0 ; i < 6 ; i++) {
            int tmp = lottos[i];
            if (tmp == 0) zeroCount++;

            for(int j = 0 ; j < 6 ; j++) {
                if(tmp == win_nums[j]) correct++;
            }
        }

        int total = zeroCount + correct;
        for(int i = 0 ; i < 2 ; i++) {
            switch(total) {
                case 6:
                    answer[i] = 1;
                    break;
                case 5:
                    answer[i] = 2;
                    break;
                case 4:
                    answer[i] = 3;
                    break;
                case 3:
                    answer[i] = 4;
                    break;
                case 2:
                    answer[i] = 5;
                    break;
                default:
                    answer[i] = 6;
                    break;
            }

            total -= zeroCount;
        }

        return answer;
    }
}
