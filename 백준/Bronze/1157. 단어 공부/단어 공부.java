import java.io.*;
import java.util.*;

public class Main{
    public static void main(String [] args )throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.toUpperCase();
        char [] charArr = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : charArr) {
            map.put(c, map.getOrDefault(c,0)+1);
        }
        char result = 0;
        int max = 0;
        for (Character c : map.keySet()) {
            int cnt = map.get(c);

            if(max<cnt){
                max=cnt;
                result = c;
            }else if(max == cnt){
                result = '?';
            }
        }
        System.out.print(result);

    }
}