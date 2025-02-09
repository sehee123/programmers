import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i< n; i++){
            String str = br.readLine();
            Stack<Character>stack = new Stack<>();
            
            for(int j = 0; j< str.length(); j++){
                if(!stack.isEmpty() && ')' == str.charAt(j) ){
                    if( stack.peek()=='('){
                         stack.pop();
                    }
                }else{
                    stack.push(str.charAt(j));
                }
            }
            if(stack.isEmpty()){
                sb.append("YES").append("\n");
            }else {
                sb.append("NO").append("\n");
            }
        }
        System.out.print(sb);
    }
    
}