import java.io.*;
import java.util.*;

public class Main{
    public static void main (String [] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char [][] charArr = new char [5][15];

        for(int i = 0; i<5;i++){
            Arrays.fill(charArr[i],'?');
        }

        for(int i = 0; i<5 ; i++){
            String str = br.readLine();
            for(int j = 0; j<str.length();j++){
                charArr[i][j] = str.charAt(j);
            }
        }

        for(int i = 0; i<15;i++){
            for(int j = 0; j<5; j++){
                char c = charArr[j][i];
                if(c != '?')sb.append(c);
            }
        }
        System.out.print(sb);
    }
}