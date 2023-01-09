package ajh.section02.arrayEx10;
import java.util.*;

public class Main {
    public int solution(int N, int[][] arr) {
        int answer = 0;
        for (int i = 1; i < N+1 ; i++) {
            for (int j = 1; j < N+1 ; j++) {
                int target = arr[i][j];
                // 위쪽 , 아랫쪽, 왼쪽, 오른쪽 비교
                if ((arr[i-1][j] < target) && (arr[i+1][j] < target) && (arr[i][j-1] < target) && (arr[i][j+1] < target)) answer++;

            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n+2][n+2];

        for(int i = 1 ; i < n+1 ; i++){
            for(int j = 1 ; j < n+1 ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));

    }
}
