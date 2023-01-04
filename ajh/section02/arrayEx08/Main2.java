package ajh.section02.arrayEx08;
import java.util.*;

public class Main2 {
    public int[] solution(int N, int[] arr) {
        int[] answer = new int[N];
        int count = 1;

        for(int i = 0 ; i < N ; i++) {
            for(int j = 0 ; j < N ; j++) {
                if(arr[i] < arr[j]) count++;
            }

            answer[i] = count;
            count = 1;
        }

        return answer;
    }

    public static void main(String[] args){
        Main2 T = new Main2();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i : T.solution(n, arr)) {
            System.out.print(i + " ");
        }
    }
}
