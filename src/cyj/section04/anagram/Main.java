package src.cyj.section04.anagram;

import java.util.*;

public class Main {
      public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str1 = sc.next();
    String str2 = sc.next();

    String result = solution(str1, str2);
    System.out.println(result);
  }

  static String solution(String str1, String str2) {
    Map<Character, Integer> map1 = new HashMap<>();
    Map<Character, Integer> map2 = new HashMap<>();
    
    for(char c: str1.toCharArray()) {
      map1.put(c, map1.getOrDefault(c, 0)+1);
    }
    for(char c: str2.toCharArray()) {
      map2.put(c, map2.getOrDefault(c, 0)+1);
    }

    int count = 0;

    for(char c: map1.keySet()) {
      if(map1.get(c) == map2.get(c))
        count++;
    }

    if(count == map1.size()) {
      return "YES";
    }
    
    return "NO";
  }
}
