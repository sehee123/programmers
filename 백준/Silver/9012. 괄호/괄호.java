import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i< n; i++){
            String str = br.readLine();
            int sum = 0;
            for(int j = 0; j< str.length(); j++){
                if(str.charAt(j) == '('){
                    sum++;
                }else{
                    sum--;
                }
                if(sum < 0){
                    break;
                }
            }
            if(sum == 0){
                sb.append("YES").append("\n");
            }else {
                sb.append("NO").append("\n");
            }
        }
        System.out.print(sb);
    }
    
}