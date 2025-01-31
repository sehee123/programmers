import java.io.*;

public class Main {
    
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strN = br.readLine();
        int n = Integer.parseInt(strN);
        br.close();

        int result= 0;
        
        for(int i = n-(9*strN.length()); i<= n; i++){
            int sum = i ;
            String strI = String.valueOf(i);
            for(int j = 0; j<strI.length(); j++){
                sum +=(strI.charAt(j)- '0');
            }
            
            if(sum == n ){
                result =  i ;
                break;
            }
        }
        System.out.println(result);
    }
    
}