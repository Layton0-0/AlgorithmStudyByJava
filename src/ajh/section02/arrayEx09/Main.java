package ajh.section02.arrayEx09;
import java.util.*;

public class Main {
    public int solution(int N, int[][] arr){
        int answer = 0;
        int total = 0;
        for (int i = 0; i < N; i++) {
            total = Arrays.stream(arr[i]).sum();
            if(answer < total) answer = total;
            total = 0;
        }

        for (int i = 0; i < N; i++) {
            total = 0;
            for (int j = 0; j < N; j++) {
                total += arr[j][i];
            }
            if(answer < total) answer = total;
        }

        total = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    total += arr[i][j];
                    break;
                }
            }
        }
        if(answer < total) answer = total;

        total = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if ((i+j) == (N-1)) {
                    total += arr[i][j];
                    break;
                }
            }
        }
        if(answer < total) answer = total;

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i < n;i++) {
            for (int j = 0; j < n ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print(T.solution(n, arr));

    }
}