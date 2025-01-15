import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String [] numbers = str.split(" ");
        long sum = 0; 
        for(String num : numbers){
            sum += Long.parseLong(num);
        }
        System.out.println(sum);
    }
    
}