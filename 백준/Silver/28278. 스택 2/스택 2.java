import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack <Integer> stack = new Stack<>();
        StringTokenizer st ;
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            
            String command = br.readLine();
            st = new StringTokenizer(command);
            switch(st.nextToken()){
                case "1":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "2":
                    if(stack.isEmpty()){
                        sb.append(-1).append("\n");
                    }else{
                         sb.append(stack.pop()).append("\n");
                    }
                    break;
                case "3":
                    sb.append(stack.size()).append("\n");
                    break;
                case "4":
                    sb.append(stack.isEmpty()? 1 : 0).append("\n");
                    break;
                case "5":
                    sb.append(stack.isEmpty()? -1: stack.peek()).append("\n");
                    break;
            }
            bw.write(sb.toString());
        }
        bw.flush();
        bw.close();
    }
    
}