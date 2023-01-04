package cyj.section02.number08;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        for(int x: m.solution(n, nums)) {
            System.out.print(x + " ");
        }
    }

    public int[] solution(int n, int[] nums) {
        int[] answer = new int[n];
        for(int i = 0; i < n; i++) {
            answer[i] = 1;
            for(int j = 0; j < n; j++) {
                if(nums[i] < nums[j]) answer[i]++;
            }
        }

        return answer;
    }
}
