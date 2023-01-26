package cyj.section03.slidingWindow01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main ma = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(ma.solution(n, k, nums));
    }

    public int solution(int n, int k, int[] nums) {
        int answer = 0;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        answer = sum;

        for (int i = k; i < n; i++) {
            sum += nums[i] - nums[i - k];
            if (answer < sum)
                answer = sum;
        }

        return answer;
    }
}