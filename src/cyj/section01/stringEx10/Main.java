package src.cyj.section01.stringEx10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        for (int x : solution(str, c)) {
            System.out.print(x + " ");
        }
    }

    static int[] solution(String str, char c) {
        int[] answer = new int[str.length()];
        int temp = 999;
        // 앞에서부터 가장 작은 수로 업데이트
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                temp = 0;
            } else {
                temp++;
            }
            answer[i] = temp;
        }

        temp = 999;
        // 뒤에서부터 가장 작은 수로 업데이트
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == c) {
                temp = 0;
            } else {
                temp++;
            }

            if (temp < answer[i]) {
                answer[i] = temp;
            }

        }

        return answer;
    }
}