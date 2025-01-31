import java.io.*;

public class Main {
    
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strN = br.readLine();
        int n = Integer.parseInt(strN);
        br.close();

        int result= 0;
        
        for(int i = n-(9*strN.length()); i<= n; i++){
            int num = i;
            int res = 0;

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