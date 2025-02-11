import java.util.*;
import java.io.*;

public class Main {
    
     public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

       
        Deque<String> deque = new LinkedList<>();
        for(int i = 0; i<n; i++){
            String [] arr = br.readLine().split(" ");

            switch(arr[0]){
                case "1" :
                    deque.addFirst(arr[1]);
                    break;
                case "2" :
                    deque.addLast(arr[1]);
                    break;
                case "3" :
                    sb.append(deque.isEmpty()?"-1":deque.removeFirst());
                    break;
                case "4" :
                    sb.append(deque.isEmpty()?"-1":deque.removeLast());
                    break;
                case "5" :
                    sb.append(deque.size());
                    break;
                case "6" :
                    sb.append(deque.isEmpty()?"1":"0");
                    break;
                case "7" :
                    sb.append(deque.isEmpty()?"-1":deque.peekFirst());
                    break;
                case "8" :
                    sb.append(deque.isEmpty()?"-1":deque.peekLast());
                    break;
            }
            if(!arr[0].equals("1") && !arr[0].equals("2"))sb.append("\n");
        }
        System.out.println(sb);
    }
}