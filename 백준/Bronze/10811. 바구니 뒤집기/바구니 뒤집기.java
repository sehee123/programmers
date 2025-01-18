import java.io.*;
import java.util.*;

public class Main{
    public static void main(String []args )throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] numArr = br.readLine().split(" ");
        int basketCnt = Integer.parseInt(numArr[0]);
        int loofCnt = Integer.parseInt(numArr[1]);
        
        int [] resultArr = new int [basketCnt+1];
        
        for(int i =1; i<= basketCnt; i++){
            resultArr[i] = i;
        }
        
        for(int i = 0 ; i<loofCnt; i++){
            String [] basketArr = br.readLine().split(" ");
            int start = Integer.parseInt(basketArr[0]);
            int end = Integer.parseInt(basketArr[1]);
            int [] tmp = new int [basketCnt +1];
            for(int j=start ; j<=end; j++){
                tmp[j] = resultArr[j];
            }
            for(int j=start ; j<=end; j++){
                 resultArr[end-j+start] = tmp[j];
            }
            
        }
        
        for(int i =1; i<=basketCnt; i++){
            System.out.print(resultArr[i]+" ");
            
        }
    }
}