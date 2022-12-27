package cyj.section01.stringEx12;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(solution(n, str));
    }

    static String solution(int n, String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String s = str.substring(i * 7, i * 7 + 7)
                    .replace('#', '1')
                    .replace('*', '0');
            char two = (char) Integer.parseInt(s, 2);
            sb.append(two);
        }

        return sb.toString();
    }
}
