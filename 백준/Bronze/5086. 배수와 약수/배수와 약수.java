import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String [] args )throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            if(a== 0)break;
            int b = Integer.parseInt(st.nextToken());
            if(b%a == 0){
                System.out.println("factor");
            }else if(a%b == 0){
                System.out.println("multiple");
            }else {
                System.out.println("neither");
            }
        }
    }
    
}