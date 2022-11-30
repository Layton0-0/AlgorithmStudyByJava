package ajh.section01.stringEx09;
import java.util.*;

public class Main {
    public int solution(String input) {
        String answer = input.toUpperCase().replaceAll("[A-Z]", "");
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(T.solution(s));
    }
}
