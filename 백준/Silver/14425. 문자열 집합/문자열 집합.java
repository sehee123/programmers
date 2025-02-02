import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] arr = br.readLine().split(" ");

        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        List <String> list = new ArrayList<>();
        int cnt = 0;

        for(int i = 0; i< n; i++){
            list.add(br.readLine());
        }
        for(int i = 0; i< m; i++){
            if(list.contains(br.readLine()))cnt++;
        }

        System.out.print(cnt);

    }
    
}