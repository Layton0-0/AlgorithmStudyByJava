package ajh.section01.stringEx12;
import java.util.*;

public class Main {
    public String solution(int i, String s) {
        String answer = "";

        for (int j = 0; j < i; j++) {
            String tmp = s.substring(j*7, j*7+7);
            tmp = tmp.replace('#', '1');
            tmp = tmp.replace('*', '0');

            int ascii = Integer.parseInt(tmp,2);
            answer += (char)ascii;
        }


        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String s = sc.next();

        System.out.print(T.solution(i, s));

    }
}