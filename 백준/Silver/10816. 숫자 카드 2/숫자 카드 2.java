import java.io.*;
import java.util.*;

public class Main {
    
     public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map < String , Integer > map = new HashMap<>();
        for(int i = 0; i< n; i++){
            String token = st.nextToken();
            map.put(token,map.getOrDefault(token,0)+1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i< m ; i++){
            sb.append(map.getOrDefault(st.nextToken(),0)).append(" ");
        }
        System.out.print(sb);
    }
    
}