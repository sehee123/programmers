import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        for(int i = 0; i< n; i++){
            String [] arr = br.readLine().split(" ");
            if(arr[1].equals("leave")){
                set.remove(arr[0]);
            }else{
                set.add(arr[0]);
            }
        }

        List<String> list = new ArrayList<>(set);
        list.sort(Comparator.reverseOrder());
        for(String name: list){
            sb.append(name).append("\n");
        }
        System.out.print(sb);

    }
    
}