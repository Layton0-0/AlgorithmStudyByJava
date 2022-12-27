package ajh.section01.stringEx02;

import java.util.*;

public class Main {
    public String solution(String input) {

        String answer = "";
        for(char x : input.toCharArray()) {
            answer += Character.isUpperCase(x) ? Character.toLowerCase(x) : Character.toUpperCase(x);
        }

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(T.solution(s));
    }
}