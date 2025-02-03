import java.io.*;

public class Main{
    
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       String [] arr = br.readLine().split(" ");

       long a = Long.parseLong(arr[0]);
       long b = Long.parseLong(arr[1]);

       bw.write((a*b)/gcd(a,b)+"");
       bw.flush();
       bw.close();
       br.close();

    }

    private static long gcd(long a, long b){
        while(b != 0){
            long temp = b;
            b = a%b ;
            a = temp;
        }
        return a;
    }
    
}