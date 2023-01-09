package ajh.programmers.divideString;

public class section1_String {

    public int solution(String s) {
        int answer = 0;
        int x=0, y=0, cnt=0;
        char target;

        while(s.length() > 0) {
            target = s.charAt(0);
            for(cnt=0 ; cnt < s.length() ; cnt++){
                if(target == s.charAt(cnt)) {
                    x += 1;
                }
                else{
                    y += 1;
                }
                if(x == y || cnt== (s.length()-1)){
                    s = s.substring(cnt+1);
                    answer += 1;
                    break;
                }


            }
        }

        return answer;
    }
}
