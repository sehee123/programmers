import java.io.*;

public class Main {
    public static void main(String [] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 2;
        for(int i = 0; i<N; i++){
            result += Math.pow(2,i);
        }
        System.out.print((int)Math.pow(result,2));
    }
}