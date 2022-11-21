package cyj.section01.stringEx01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // 문자를 바로 받는 방법이 없어 문자열에서 하나의 문자만 추출
        char c = sc.next().charAt(0);
        System.out.println(solution(s, c));
    }

    static int solution(String str, char c) {
        int answer = 0;
        // 문자열 전체를 소문자로 바꿔 비교하기 편하게 만듦
        str = str.toLowerCase();
        char[] arr = str.toCharArray();

        // 문자열 전체를 조회하며 같은 문자를 발견하면 정답+1
        for(char x: arr) {
            if(x == c) answer++;
        }

        return answer;
    }

}
