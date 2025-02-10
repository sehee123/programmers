import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Queue <Integer> queue = new LinkedList<>();
        int lastNum = 0;
        for(int i = 0; i< n; i++){
            String msg = br.readLine();
            String [] msgArr = msg.split(" ");

            switch(msgArr[0]){
                case "push" :
                    lastNum = Integer.parseInt(msgArr[1]);
                    queue.offer(Integer.parseInt(msgArr[1]));
                    break;
                case "pop" :
                    sb.append(queue.isEmpty()?-1:queue.poll());
                    break;
                case "size" :
                    sb.append(queue.size());
                    break;
                case "empty" :
                    sb.append(queue.isEmpty()?1:0);
                    break;
                case "front" :
                    sb.append(queue.isEmpty() ? -1 : queue.peek());
                    break;
                case "back" :
                    sb.append(queue.isEmpty() ? -1: lastNum);
                    break;
            }
            if (!msgArr[0].equals("push")){
                sb.append("\n");
            }
        }
        System.out.println(sb);

    }
    
}