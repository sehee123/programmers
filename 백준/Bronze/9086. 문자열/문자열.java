import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        for(int i = 0; i<cnt ; i++){
            String str = br.readLine();
            System.out.println(str.charAt(0)+""+str.charAt(str.length()-1));
        }
    }
    
}