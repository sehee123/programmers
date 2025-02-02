import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String [] arr = br.readLine().split(" ");
        
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        String [] dic = new String [n+1];
        Map <String,Integer> map = new HashMap<>();
        
        for(int i = 1; i<=n; i++){
            String name = br.readLine();
            dic[i] = name;
            map.put(name, i);
        }

        for(int i = 0; i< m ; i++){
            String str = br.readLine();
            if(Character.isDigit(str.charAt(0))){
                sb.append(dic[Integer.parseInt(str)]).append("\n");
            }else {
                sb.append(map.get(str)).append("\n");
            }
        }
        System.out.print(sb);
    }
    
}