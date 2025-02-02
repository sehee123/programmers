import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st  = new StringTokenizer(br.readLine());
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i< n; i++){
            set.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i< m ; i++){
            if(set.add(Integer.parseInt(st.nextToken()))){
                sb.append(0).append(" ");
            }else{
                sb.append(1).append(" ");
            }
        }

        System.out.print(sb);

    }

}