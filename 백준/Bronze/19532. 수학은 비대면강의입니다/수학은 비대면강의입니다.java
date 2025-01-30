import java.io.*;

public class Main{
       public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] arr  = br.readLine().split(" ");
        int [] numArr = new int [6];
        for(int i = 0; i< 6; i++) {
            numArr[i] = Integer.parseInt(arr[i]);
        }
        System.out.println((numArr[4]*numArr[2] - numArr[1]*numArr[5])/(numArr[0]*numArr[4] - numArr[1]*numArr[3]));
        System.out.print((numArr[0]*numArr[5] - numArr[2]*numArr[3])/(numArr[0]*numArr[4] - numArr[1]*numArr[3]));

    } 
        
    
    
}