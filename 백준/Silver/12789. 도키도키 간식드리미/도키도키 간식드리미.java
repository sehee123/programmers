import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int idx = 1;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<n ; i++){
            int num = Integer.parseInt(st.nextToken());
            if(idx == num ){
                idx ++;
            }else {
                while(!stack.isEmpty() && stack.peek() == idx){
                    stack.pop();
                    idx ++;
                }
                stack.push(num);
            }
        }

        while(!stack.isEmpty() && stack.peek() == idx){
            stack.pop();
            idx ++;
        }

        if(idx-1 == n){
            System.out.println("Nice");
        }else{
            System.out.println("Sad");
        }
    }
    
}