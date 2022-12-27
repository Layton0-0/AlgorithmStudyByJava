package cyj.section01.stringEx11;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }

    static String solution(String str) {
        str += " ";
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i));
                // 갯수가 1일 경우에는 갯수를 표기하지 않음
                if (count > 1)
                    sb.append(count);
                count = 1;
            }
        }

        return sb.toString();
    }
}