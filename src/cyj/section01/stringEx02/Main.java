package cyj.section01.stringEx02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }

    static String solution(String str) {
        StringBuilder answer = new StringBuilder();
        char[] arr = str.toCharArray();
        // Character의 함수들을 활용해 정답에 차례로 더해준다.
        for(char x: arr) {
            if(Character.isUpperCase(x)) {
                answer.append(Character.toLowerCase(x));
            } else {
                answer.append(Character.toUpperCase(x));
            }
        }
        return answer.toString();
    }
}
