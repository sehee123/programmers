import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String [] args )throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();
       
       int a = Integer.parseInt(br.readLine());
        
       for(int i = 2; i*i<=a;i++){
       		while(a%i == 0){
            	sb.append(i).append("\n");
                a/=i;
            }
       }
       if(a!= 1)sb.append(a);
       
       System.out.print(sb);
    }
}