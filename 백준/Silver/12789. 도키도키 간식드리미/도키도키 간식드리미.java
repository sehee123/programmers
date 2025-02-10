import java.io.*;
import java.util.*;

public class Main {
    
    static Stack <Integer> stop = new Stack<>();
    static Stack <Integer> des = new Stack<>();
    
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i<n ; i++){
            int num = Integer.parseInt(st.nextToken());
            chkStack(num);
        }

        if(!des.isEmpty())chkStop();

        if(des.size() == n){
            System.out.println("Nice");
        }else{
            System.out.println("Sad");
        }
    }
    private static void chkStack(int num){
        if(des.isEmpty()){
            if(num ==1){
                des.push(num);
            }else{
                stop.push(num);
            }
        }else{
           chkStop();
           if(des.peek()+1 == num){
                des.push(num);
            }else {
                stop.push(num);
            }
        }
    }
    private static void chkStop(){
        while(!stop.isEmpty()&&stop.peek() == des.peek()+1){
            des.push(stop.peek());
            stop.pop();
        }
    }
    
}