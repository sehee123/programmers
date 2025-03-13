import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String [] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        Map<String , Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (str.length() >= m ){
                map.put(str,map.getOrDefault(str,0) + 1);
            }
        }

        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a,b)->{
            if (!a.getValue().equals(b.getValue())){
                return b.getValue() - a.getValue(); //내림차순
            }
            if (a.getKey().length() != b.getKey().length()){
                return b.getKey().length() - a.getKey().length();
            }

            return a.getKey().compareTo(b.getKey());
        });

        for (Map.Entry<String , Integer> entry : list) {
            sb.append(entry.getKey()).append("\n");
        }
        System.out.println(sb.toString());
    }
    
}