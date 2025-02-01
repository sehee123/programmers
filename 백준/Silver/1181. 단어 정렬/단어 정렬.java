import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        for(int i = 0; i < n; i++){
           set.add(br.readLine());
        }
        List <String> list = new ArrayList<>(set);
        list.sort(Comparator.comparingInt((String str) -> str.length())
                .thenComparing(str -> str));

        for (String s : list) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
    
}