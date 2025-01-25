import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args )throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            int num = Integer.parseInt(br.readLine());
            if(num == -1)break;
            int sum = 0;
            List <Integer> list = new ArrayList<>();
            for(int i = 1; i< num ; i++){
                if(num % i ==0 ){
                    list.add(i);
                    sum+= i;
                }
            }
            if(sum == num){
                sb.append(num).append(" = ");
                for (int i = 0; i<list.size() ; i++) {
                    sb.append(list.get(i));
                    if(i<list.size()-1)sb.append(" + ");
                }

            }else{
                sb.append(num).append(" is NOT perfect.");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}