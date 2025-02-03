import java.io.*;

public class Main {
    public static void main(String [] args)throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder ();

       int n = Integer.parseInt(br.readLine());

       for(int i = 0; i< n; i++){
           String [] arr = br.readLine().split(" ");
           int a = Integer.parseInt(arr[0]);
           int b = Integer.parseInt(arr[1]);
           int min = Math.min(a,b);
           int max = Math.max(a,b);
           int tmp = max;
           int idx = 1;
           while(max%min != 0){
               idx ++;
               max = tmp*idx;
           }
           sb.append(max).append("\n");
       }

        System.out.println(sb);
    }
}