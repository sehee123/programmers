import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main{
    public static void main(String []args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n ; i++){
            String [] strArr = br.readLine().split(" ");
            int sum = Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[1]);
            bw.write(String.valueOf(sum));
            bw.newLine();          
        }
        bw.flush();
        bw.close();
    }
}