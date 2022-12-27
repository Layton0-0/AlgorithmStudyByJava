package ajh.programmers.game369;
import java.util.*;

public class Main {
    public int solution(int order) {
        int answer = 0;
        for(String s : Integer.toString(order).split("")){
            if(s.equals("3") || s.equals("6") || s.equals("9")){
                answer++;
            }
        }

        return answer;
    }

}
