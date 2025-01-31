import java.io.*;
import java.util.*;

public class Main{
    
     public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String strN = br.readLine();
        int len = strN.length();

        char [] arr = strN.toCharArray();
        Arrays.sort(arr);

        System.out.println(new StringBuilder(new String(arr)).reverse().toString());
    }
    
}