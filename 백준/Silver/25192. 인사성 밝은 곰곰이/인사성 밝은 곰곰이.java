import java.io.*;
import java.util.*; 

public class Main {
    
    public static void main(String[]args )throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        Set<String> set = new HashSet<>();
        for(int i = 0; i< n; i++){
            String msg = br.readLine();
            if(!msg.equals("ENTER")){
                if(set.add(msg))cnt ++;
            }else{
                set.clear();
            }
        }
        System.out.println(cnt);
    }
    
}