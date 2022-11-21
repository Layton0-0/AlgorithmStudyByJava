package ajh.section01.stringEx01;

import java.util.*;

class Main {

    public int solution(String input, char c) {
        int answer = 0;
        input = input.toUpperCase();
        c = Character.toUpperCase(c);

        for(char x : input.toCharArray()) {
            if (x == c) answer++;
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char c  = sc.next().charAt(0);

        System.out.println(T.solution(s, c));
    }
}
