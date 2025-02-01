import java.io.*;
import java.util.*;

public class Main {
    
    public static void main (String [] args)throws IOException{
       BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n= Integer.parseInt(br.readLine());
        int [][] arr = new int [n][2];

        for(int i = 0; i< n; i++){
            String[] strArr = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(strArr[0]);
            arr[i][1] = Integer.parseInt(strArr[1]);
        }

       Arrays.sort(arr , (a,b) -> {
            if(a[0]== b[0])return Integer.compare(a[1], b[1]);
            return Integer.compare( a[0] , b[0]);
        });

        for(int [] point : arr){
            sb.append(point[0]).append(" ").append(point[1]).append("\n");
        }

        System.out.print(sb);

    }
    
}