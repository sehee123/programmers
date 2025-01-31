import java.io.*;

public class Main {
    
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        int result= 0;

        for(int i = 0; i<= n; i++){
            int num = i;
            int res = 0 ;

            while(num > 0){
                res += num % 10 ;
                num /= 10 ;
            }

            if(res + i == n ){
                result =  i ;
                break;
            }
        }
        System.out.println(result);
    }
    
}