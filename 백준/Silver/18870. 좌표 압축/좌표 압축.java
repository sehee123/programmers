import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int [] arr = new int [n];
        Set <Integer> set = new TreeSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i< n ; i++){
            int num =Integer.parseInt(st.nextToken());
            arr[i]= num;
            set.add(num);
        }

        Map <Integer , Integer> map = new HashMap<>();
        int idx = 0;
        for(int i : set){
            map.put(i,idx++);
        }

        for(int i = 0; i< n; i++){
            sb.append(map.get(arr[i])).append(" ");
        }
        System.out.println(sb);
    }
    
}