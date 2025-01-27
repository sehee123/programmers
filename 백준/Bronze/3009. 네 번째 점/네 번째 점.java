import java.io.*;

public class Main{
    
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] arr1 = br.readLine().split(" ");
        String [] arr2 = br.readLine().split(" ");
        String [] arr3 = br.readLine().split(" ");
        String [] result = new String[2];
        
        for(int i = 0  ; i< 2; i++){
            if(arr1[i].equals(arr2[i])){
                result[i] = arr3[i];
            }else if(arr2[i].equals(arr3[i])){
                result[i] = arr1[i];
            }else{
                result[i] = arr2[i];
            }
        }
        System.out.print(result[0] + " " + result[1]);
    }
    
}