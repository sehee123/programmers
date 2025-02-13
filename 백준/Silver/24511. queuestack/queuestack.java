import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        int [] isStack = new int [n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n ; i++){
            isStack[i] = Integer.parseInt(st.nextToken());
        }

        Deque<Integer> deque = new LinkedList<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n ; i++){
            int num = Integer.parseInt(st.nextToken());
            if(isStack[i] == 0){
                deque.offerLast(num);
            }
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<m ; i++){
            int x = Integer.parseInt(st.nextToken());
            deque.offerFirst(x);
            sb.append(deque.pollLast()).append(" ");
        }
        System.out.println(sb);
    }
}