package cyj.section03.combined01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main ma = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] nums = new int[n + 1];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(ma.solution(n, m, nums));
    }

    public int solution(int n, int m, int[] nums) {
        int answer = 0;
        int sum = nums[0];

        int start = 0;
        int end = 0;

        while (end <= n - 1 && start <= end && start <= n - 1) {

            if (m < sum) {
                sum -= nums[start];
                start++;
            } else if (m > sum) {
                end++;
                sum += nums[end];
            } else {
                end++;
                sum += nums[end] - nums[start];
                start++;

                answer++;
            }
            if (end > n - 1 && m > sum)
                break;
            if (end > n - 1 && start < n - 1)
                end = n - 1;

        }

        return answer;
    }
}
