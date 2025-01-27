import java.io.*;
import java.util.*;


public class Main{
    
    public static void main(String [] args )throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List <Integer> list = new ArrayList<>();
        
        for(int i = 1; i<=n ; i++){
            if(n%i == 0){
                list.add(i);
                if(list.size() == k)break;
            }
        }
        if(list.size() < k){
            System.out.print(0);
        }else{
            System.out.print(list.get(k-1));
        }
    }
    
}