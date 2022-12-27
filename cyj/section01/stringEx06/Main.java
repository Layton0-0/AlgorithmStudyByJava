package cyj.section01.stringEx06;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
        sc.close();
    }

    static String solution(String str) {
        StringBuilder answer = new StringBuilder();

        // 현재 인덱스가 현재 문자의 첫번째 인덱스와 같으면 중복이 아니다.
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer.append(str.charAt(i));
            }
        }
        return answer.toString();
    }
}
