package src.cyj.section02.number11;

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
        int maxSum = 0;
        int[][] studNum = new int[9][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < n; j++) {
                studNum[nums[j][i] - 1][i]++;
            }
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                sum += studNum[nums[i][j] - 1][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                answer = i + 1;
                System.out.println("maxSum " + maxSum);
            }
        }

        return answer;
    }
}