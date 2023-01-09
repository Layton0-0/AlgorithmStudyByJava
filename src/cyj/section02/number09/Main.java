package src.cyj.section02.number09;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] nums = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = sc.nextInt();
            }
        }

        System.out.println(m.solution(n, nums));
    }

    public int solution(int n, int[][] nums) {
        int answer = 0;
        int row = 0;
        int col = 0;
        int leftDiag = 0;
        int rightDiag = 0;
        for (int i = 0; i < n; i++) {
            row = 0;
            col = 0;
            for (int j = 0; j < n; j++) {
                row += nums[i][j];
                col += nums[j][i];
                if (i == j)
                    leftDiag += nums[i][j];
                if (i + j == n - 1)
                    rightDiag += nums[i][j];
            }
            answer = Math.max(answer, row);
            answer = Math.max(answer, col);
        }
        answer = Math.max(answer, leftDiag);
        answer = Math.max(answer, rightDiag);

        return answer;
    }
}
