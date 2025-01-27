import java.io.*;
import java.util.*; 

public class Main {
    public static void main(String [] args )throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;
        for(int i = 0; i<n; i++){
            int num =Integer.parseInt(st.nextToken());
            if(num != 1)result ++ ;
            for(int j = 2; j<num; j++){
                if(num % j == 0){
                    result --;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}