import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        String [] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i<= n; i++){
            q.offer(i);
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<k-1; j++){
                int first = q.poll();
                q.offer(first);
            }
            if(q.size() == 1){
                sb.append(q.poll()).append(">");
            }else{
                sb.append(q.poll()).append(", ");
            }
        }

        System.out.println(sb);
    }
    
}