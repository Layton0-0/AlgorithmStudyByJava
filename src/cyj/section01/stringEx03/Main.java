package cyj.section01.stringEx03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // next()는 문자열 하나만 읽어오기 때문에 문장으로 읽어와야 split 함수를 사용할 수 있다.
        String s = sc.nextLine();
        System.out.println(solution(s));
    }

    static String solution(String str) {
        String answer = "";
        int len = 0;
        String[] arr = str.split(" ");

        // 길이가 지금까지 중에 가장 클 경우에만 길이와 정답을 갱신.
        for(String s: arr) {
            if(s.length() > len) {
                len = s.length();
                answer = s;
            }
        }
        return answer;
    }
}