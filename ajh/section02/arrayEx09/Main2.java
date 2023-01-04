package ajh.section02.arrayEx09;
import java.util.*;

public class Main2 {
    public int solution(int N, int[][] arr) {
        int answer = 0;
        int sum1 = 0, sum2 = 0;

        /**
         * sum1 = 행의 합
         * sum2 = 열의 합
         */
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }

            int tmp = Math.max(sum1, sum2);
            answer = Math.max(answer, tmp);

            sum1 = 0;
            sum2 = 0;
        }

        /**
         * sum1 = 왼쪽 -> 오른쪽 대각선의 합
         * sum2 = 오른쪽 -> 왼쪽 대각선의 합
         */
        for(int i = 0 ; i < N ; i++) {
            sum1 += arr[i][i];
            sum2 = arr[i][N-i-1];
        }
        int tmp = Math.max(sum1, sum2);
        answer = Math.max(answer, tmp);

        return answer;
    }

    public static void main(String[] args){
        Main2 T = new Main2();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print(T.solution(n, arr));

    }
}
