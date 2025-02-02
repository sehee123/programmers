import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String [] arr = br.readLine().split(" ");

        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        Set<String> set = new HashSet<>();

        for(int i =0; i< n; i++){
            set.add(br.readLine());
        }

        List <String> list = new ArrayList<>();
        for(int i = 0; i<m; i++){
            String name = br.readLine();
            if(set.contains(name)){
                list.add(name);
            }
        }

        list.sort(Comparator.comparing((String name) -> name));

        sb.append(list.size()).append("\n");

        for (String name : list) {
            sb.append(name).append("\n");
        }
        System.out.println(sb);
    }
    
    
}