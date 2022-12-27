package ajh.section02.arrayEx06;
import java.util.*;

public class Main {
    public boolean prime(int n){
        if(n == 1) return false;

        for(int i = 2 ; i < n ; i++){
            if( n % i == 0) return false;
        }
        return true;

    }

    public ArrayList<Integer> solution(int n, int[] nums){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0 ; i < n ; i++) {
            int res = 0, tmp = nums[i];
            while(tmp > 0) {
                res = (tmp % 10) + (res * 10);
                tmp /= 10;
            }

            if(prime(res)) answer.add(res);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i : T.solution(n, arr)){
            System.out.print(i + " ");
        }
    }
}
