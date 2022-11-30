package ajh.section01.stringEx06;
import java.util.*;

public class Main {
    public String solution(String input) {
        String answer = "";

        for(int i = 0 ; i < input.length() ; i++) {
            char c = input.charAt(i);
            if(input.indexOf(c) == i){
                answer += c;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(T.solution(s));
    }
}
