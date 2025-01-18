import java.io.*;
import java.util.*;
import java.util.stream.DoubleStream;

public class Main{
     public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        String []scoreArr = br.readLine().split(" ");
        int max = 0;
        for(int i = 0; i<cnt; i++){
            int score = Integer.parseInt(scoreArr[i]);
            if(max < score) max = score;
        }
        double[] scoreIntArr = new double [cnt];
        for(int i = 0; i<cnt; i++){
            int score = Integer.parseInt(scoreArr[i]);
            scoreIntArr[i] = (double)score/max*100;
        }
        System.out.print(DoubleStream.of(scoreIntArr).average().orElse(0.0));
    }
}