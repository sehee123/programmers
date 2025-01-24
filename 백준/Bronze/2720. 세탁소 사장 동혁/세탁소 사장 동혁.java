import java.io.*;

public class Main {
    public static void main(String [] args )throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
       int n = Integer.parseInt(br.readLine());
       int [] coins = {25, 10, 5, 1};
       int [][] resultArr = new int [n][4];
       for(int i = 0; i< n; i++){
           int input = Integer.parseInt(br.readLine());
           for(int j = 0; j<coins.length; j++){
               if(input >=coins[j]){
                   resultArr[i][j]= input/coins[j];
                   input = input%coins[j];
               }
           }
       }
       StringBuilder sb = new StringBuilder();
       for(int i =0; i< n ; i++){
           for (int j = 0; j< 4; j++){
               sb.append(resultArr[i][j] + " ");
           }
           sb.append("\n");
        }
        System.out.println(sb);
    }
}