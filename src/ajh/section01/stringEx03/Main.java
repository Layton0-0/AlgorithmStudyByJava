package ajh.section01.stringEx03;

import java.util.*;

public class Main {
    public String solution(String input) {
        String answer = "";
        String[] words = input.split(" ");
        int maxL = 0;
        for(String w : words) {
            if(w.length() > maxL) {
                maxL = w.length();
                answer = w;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.print(T.solution(s));
    }
}