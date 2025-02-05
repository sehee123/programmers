import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 1;
        for(int i = 2 ; i*i<=n; i++){
            cnt ++;
        }
        System.out.println(cnt);
    }
    
}