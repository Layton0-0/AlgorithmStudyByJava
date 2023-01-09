package src.cyj.section02.number10;

import java.util.*;

public class Main01 {
    public static void main(String[] args) {
        Main01 m = new Main01();
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
        // 상하좌우 순서
        int[] dirX = { -1, 1, 0, 0 };
        int[] dirY = { 0, 0, -1, 1 };
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int mount = 0;
                for (int k = 0; k < 4; k++) {
                    int x = i + dirX[k];
                    int y = j + dirY[k];
                    if (x < 0 || y < 0 || x >= n || y >= n)
                        continue;
                    // 나보다 큰 수가 있으면
                    if (nums[x][y] >= nums[i][j]) {
                        mount++;
                        break;
                    }
                }
                if (mount == 0)
                    answer++;
            }
        }

        return answer;
    }
}