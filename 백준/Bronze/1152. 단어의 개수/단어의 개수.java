import java.io.*;

public class Main{
    public static void main(String [] args )throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] arr = br.readLine().trim().split(" ");
        int len = arr.length;
        if(len == 1 ){
            if(arr[0].equals(""))len=0;
        }
        System.out.print(len);
    }
}