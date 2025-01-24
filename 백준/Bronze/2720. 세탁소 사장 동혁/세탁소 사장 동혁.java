import java.io.*;

public class Main {
    public static void main(String [] args )throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
       int [] coins = {25, 10, 5, 1};

       for(int i = 0; i< n; i++){
           int input = Integer.parseInt(br.readLine());
           for(int j = 0; j<coins.length; j++){
               sb.append(input/coins[j]).append(" ");
               input = input%coins[j];
           }
           sb.append("\n");
       }
        System.out.println(sb);
    }
}