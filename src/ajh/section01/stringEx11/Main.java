package ajh.section01.stringEx11;
import java.util.*;

public class Main {
    public String solution(String input) {
        input += " ";
        String answer = "";
        int p = 1;
        int len = input.length();

        for(int i = 0 ; i < len-1 ; i++) {
            if(input.charAt(i) == input.charAt(i+1)) {
                p++;
            }
            else{
                if (p == 1) {
                    answer += input.charAt(i);
                }
                else{
                    answer += (input.charAt(i) + String.valueOf(p));
                }
                p = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.print(T.solution(s));
    }
}
