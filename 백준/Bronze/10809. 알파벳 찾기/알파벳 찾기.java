import java.io.*;
import java.util.*;

public class Main {
   public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int [] answer = new int [26];
        Arrays.fill(answer, -1);

         for(int i =0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(answer [c - 'a'] == -1) {
                answer[c - 'a'] = i;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int num : answer) {
            bw.write(num + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}