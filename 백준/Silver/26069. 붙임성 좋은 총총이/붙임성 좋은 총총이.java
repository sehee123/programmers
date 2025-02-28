import java.util.*;
import java.io.*;

public class Main {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        set.add("ChongChong");
        for(int i = 0; i< n; i++){
            String [] record = br.readLine().split(" ");
            if(set.contains(record[0]) || set.contains(record[1])){
                set.add(record[0]);
                set.add(record[1]);
            }
        }
        System.out.println(set.size());
    }
}