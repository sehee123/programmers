   
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
     public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String [] strArr = str.split(" ");

        int a = Integer.parseInt(strArr[0]);
        int b = Integer.parseInt(strArr[1]);
        int c = Integer.parseInt(strArr[2]);

        int answer = 0 ;

        if(a==b && b==c){
            answer = 10000 + a*1000;
        }else if(a==b || b==c || c==a){
           if(a==b || a==c){
               answer = 1000 + a*100;
           }else {
               answer = 1000 + c*100;
           }
        }else if(a != b && b!=c && c!=a){
            answer = 100*Math.max(Math.max(a,b),c);
        }

        System.out.println(answer);
    }
}
