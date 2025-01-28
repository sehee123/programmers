import java.io.*;

public class Main{
    
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int n =Integer.parseInt(br.readLine());
        int [] maxArr = {-10001,-10001};
        int [] minArr = {10001, 10001};
        for(int i = 0; i< n ; i++){
            String[] arr = br.readLine().split(" ");
            for(int j = 0; j<2 ; j++){
                maxArr[j] = Math.max(Integer.parseInt(arr[j]), maxArr[j]);
                minArr[j] = Math.min(Integer.parseInt(arr[j]), minArr[j]);
            }
        }
        System.out.print(Math.abs(maxArr[0]-minArr[0])*Math.abs(maxArr[1]-minArr[1]));
    }
    
}