import java.io.*;
import java.util.*;

public class Main{
    
public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb =new StringBuilder();

        String [] arr_idx = br.readLine().split(" ");
        String [] arr_nums = br.readLine().split(" ");

        int num = Integer.parseInt(arr_idx[1]);
        int size = Integer.parseInt(arr_idx[0]);

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<size ; i++){
            int n = Integer.parseInt(arr_nums[i]);
            if(n < num){
                list.add(n);
            }
        }
        for(int i = 0; i< list.size(); i++){
            if(i == 0){
                sb.append(list.get(0));
            }else {
                sb.append(" ");
                sb.append(list.get(i));
            }

        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}