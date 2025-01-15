import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i = 0; i< n ; i++){
            String [] str = br.readLine().split(" ");
            sum += Integer.parseInt(str[0])*Integer.parseInt(str[1]);
        }
        if(total == sum ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        
    }
    
}