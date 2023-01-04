package ajh.section01.stringEx04;

import java.util.*;

public class Main {
    public void solution(int n, String[] inputs) {
        String[] answer;
        int lt=0, rt;

        for(String w : inputs) {
            lt = 0;
            rt = w.length()-1;
            char[] word = w.toCharArray();
            char tmp;

            while(lt < rt) {

                tmp = word[lt];
                word[lt] = word[rt];
                word[rt] = tmp;

                lt += 1;
                rt -= 1;
            }

            System.out.print(word);
        }

    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

//        int input1 = sc.nextInt();
//        String[] words = new String[input1];
//        for(int i = 0 ; i < input1 ; i++) {
//            words.put(sc.next());
//        }
//
//        T.solution(input1, words);
    }
}