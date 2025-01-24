import java.io.*;
import java.util.*;

public class Main {
    
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean [][] area = new boolean [100][100];
        int result = 0;
        for(int i = 0 ; i<N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for(int j = x; j<x+10 ; j++){
                for(int k = y; k<y+10; k++){
                    if(!area[j][k]){
                        area[j][k] = true;
                    }
                }
            }
        }
        for(boolean [] arr : area){
            for(boolean IsTrue : arr){
                if(IsTrue){
                    result++;
                }
            }
        }
        System.out.print(result);
    }
    
}