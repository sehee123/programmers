import java.io.*;
import java.util.*;

public class Main{
     public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        for(int i = 0; i< cnt ; i++){
            StringBuilder sb = new StringBuilder();
            String [] strArr = br.readLine().split(" ");
            int loof = Integer.parseInt(strArr[0]);
            String str = strArr[1];
            for(int j = 0; j<str.length(); j++){
                for(int k =0; k<loof; k++){
                    sb.append(str.charAt(j));
                }
            }
            bw.write(sb.toString());
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}