import java.io.*;
import java.util.*;

public class Main {
    
   public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            String str = br.readLine();
            if(str.equals("."))break;
            sb.append(getResult(str)).append("\n");
        }
        System.out.print(sb);
    }
    private static String getResult(String str){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c == '(' || c == '[' ) {
                stack.push(c);
            }else if(c== ')'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }else{
                    return "no";
                }
            }else if(c == ']'){
                if(!stack.isEmpty() && stack.peek() == '['){
                    stack.pop();
                }else{
                    return "no";
                }
            }
        }
        if(stack.isEmpty()){
            return "yes";
        }else {
           return "no";
        }
    }
}