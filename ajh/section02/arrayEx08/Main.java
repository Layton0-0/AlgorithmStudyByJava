package ajh.section02.arrayEx08;
import java.util.*;

public class Main {
    public int[] solution(int N, int[] arr){
        int[] answer = new int[N];
        int rank = 0;

        for(int i = 0 ; i < N ; i++) {
            int tmp = arr[i];
            int same = 0;
            for (int j = 0; j < N; j++) {
                if(tmp == arr[j]) same++;
                if(tmp <= arr[j]) rank++;
            }

            answer[i] = rank-same+1;
            rank = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n;i++) {
            arr[i] = sc.nextInt();
        }

        for (int i :
                T.solution(n, arr)) {
            System.out.print(i + " ");
        }
    }
}