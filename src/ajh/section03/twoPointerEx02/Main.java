package ajh.section03.twoPointerEx02;
import java.util.*;

public class Main {
    public ArrayList<Integer> solution(int n, int[] nArray, int m, int[] mArray){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;

        Arrays.sort(nArray);
        Arrays.sort(mArray);

        while (p1 < n && p2 < m) {
            if (nArray[p1] > mArray[p2]) p2++;
            else if (nArray[p1] < mArray[p2]) p1++;
            else {
                answer.add(nArray[p1]);
                p1++;
                p2++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr1 = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }

        for(int i : T.solution(n, arr, m, arr1)){
            System.out.print(i + " ");
        }
    }
}
