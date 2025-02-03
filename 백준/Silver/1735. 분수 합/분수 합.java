import java.io.*;

public class Main {
    
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       StringBuilder sb = new StringBuilder();

       String [] arr1 = br.readLine().split(" ");
       String [] arr2 = br.readLine().split(" ");

       int a = Integer.parseInt(arr1[0]);
       int b = Integer.parseInt(arr1[1]);
       int c = Integer.parseInt(arr2[0]);
       int d = Integer.parseInt(arr2[1]);

       int m = (b*d)/gcd(b,d);
       int s = a*(m/b)+c*(m/d);

       int gcd = gcd(m,s);

       sb.append(s/gcd).append(" ").append(m/gcd);
       bw.write(sb.toString());
       bw.flush();
       bw.close();
       br.close();

    }

    private static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a%b ;
            a = temp;
        }
        return a;
    }
}