import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String strN = br.readLine();
        int len = strN.length();
        int [] arr = new int[len];
        for(int i = 0; i<len; i++){
            arr[i] = strN.charAt(i)-'0';
        }
        Arrays.sort(arr);
        for(int i= len-1; i>=0; i--){
            sb.append(arr[i]);
        }
        System.out.println(sb);
    }
    
}