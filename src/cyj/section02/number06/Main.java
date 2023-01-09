package src.cyj.section02.number06;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        for (int a : m.solution(n, nums)) {
            System.out.print(a + " ");
        }
    }

    public ArrayList<Integer> solution(int n, int[] nums) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int x : nums) {
            String num = new StringBuilder(String.valueOf(x)).reverse().toString();
            int y = Integer.parseInt(num);
            if (isPrime(y)) {
                answer.add(y);
            }
        }

        return answer;
    }

    public boolean isPrime(int num) {
        if (num == 1)
            return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
