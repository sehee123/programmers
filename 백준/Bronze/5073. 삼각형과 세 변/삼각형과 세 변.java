import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String [] args)throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringBuilder sb = new StringBuilder();
        while(true){
            String [] arr = br.readLine().split(" ");
            int [] numArr = {Integer.parseInt(arr[0]), Integer.parseInt(arr[1]),Integer.parseInt(arr[2])};
            if(numArr[0] == 0) break;
            Arrays.sort(numArr);
            if(numArr[0] == numArr[1] && numArr[1]== numArr[2]){
                sb.append("Equilateral").append("\n");
            }else if(!(numArr[2] < numArr[1]+numArr[0])){
                sb.append("Invalid").append("\n");
            }else if(numArr[0] == numArr[1]  || numArr[1] == numArr[2]){
                sb.append("Isosceles").append("\n");
            }else{
                sb.append("Scalene").append("\n");
            }
        }
        System.out.println(sb);
    }
    
}