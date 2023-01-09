package ajh.section02.arrayEx05;
import java.util.*;

public class Main {
    public int solution(int num){
        int answer = 0;
        int[] arr = new int[num+1];

        for(int i=2 ; i <= num ; i++){
            if(arr[i] == 0) answer++;
            for(int j=i ; j<=num ; j+= i){
                arr[j] = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
