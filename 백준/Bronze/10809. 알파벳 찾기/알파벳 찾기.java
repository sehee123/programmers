import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int [] alphabetArr = new int [26];
        Arrays.fill(alphabetArr,-1);
        for(int i = 0; i<str.length();i++){
            int Ascii = (int)str.charAt(i);
            int idx = Ascii - 97;
            if(alphabetArr[idx] == -1)alphabetArr[idx] = i;        
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<alphabetArr.length; i++){
            sb.append(alphabetArr[i]+" ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    
}