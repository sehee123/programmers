import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<int [] > q = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int [n];
        for(int i = 0; i< n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("1").append(" ");
        int jump = arr[0];

        for(int i = 1; i<n; i++){
            q.add(new int [] {i+1,arr[i]});
        }
        while(!q.isEmpty()){
            if( jump > 0 ){
                for(int i = 1; i< jump; i++){
                    q.add(q.poll()); //첫번째 get remove
                }
                int [] next = q.poll();
                jump = next[1];
                sb.append(next[0]).append(" ");
            }else{
                for(int i= 1; i<-jump; i++ ){
                    q.addFirst(q.pollLast());
                }
                int [] next = q.pollLast();
                jump = next[1];
                sb.append(next[0]).append(" ");
            }
        }
        System.out.println(sb);
    }
    
}