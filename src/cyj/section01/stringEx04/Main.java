package cyj.section01.stringEx04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        
        // stream을 사용해 리스트 내용 출력
        solution(arr).forEach(System.out::println);
    }

    static List<String> solution(String[] arr) {
        List<String> answer = new ArrayList<>();
        for(String s: arr) {
            // StringBuilder 클래스는 String과 다르게 고유하지 않고 수정이 가능하다.
            String str = new StringBuilder(s).reverse().toString();
            answer.add(str);
        }
        return answer;
    }
}