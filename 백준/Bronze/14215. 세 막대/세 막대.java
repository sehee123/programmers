import java.io.*;
import java.util.*;

public class Main{
    
     public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] arr = br.readLine().split(" ");
        int [] numArr = new int [3];
        for(int i= 0; i< 3; i++){
            numArr[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(numArr);
        if(!(numArr[2]< numArr[0] + numArr[1])){
            while(!(numArr[2]< numArr[0] + numArr[1]))numArr[2]--;
        }
        System.out.print(numArr[0]+numArr[1] + numArr[2]);
    }
    
}