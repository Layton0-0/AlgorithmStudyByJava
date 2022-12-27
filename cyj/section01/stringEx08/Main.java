package cyj.section01.stringEx08;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
        sc.close();
    }

    static String solution(String str) {
        // 정규식 ^ -> 아닌 것, a-z -> 알파벳 소문자
        str = str.toLowerCase().replaceAll("[^a-z]", "");
        // 현재 문자열을 뒤집어서도 같은지 확인 = 앞뒤가 같은 문자열
        String str2 = new StringBuilder(str).reverse().toString();
        if (str.equals(str2)) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
