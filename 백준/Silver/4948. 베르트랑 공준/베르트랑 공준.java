import java.io.*;

public class Main {
    
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            int num = Integer.parseInt(br.readLine());
            if(num ==0)break;
            int cnt = 0;
            for(int i = num+1; i<=num*2; i++){
                if(isPrime(i))cnt++;
            }
            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }

    private static boolean isPrime(int num){
        if(num <2) return false;
        if(num ==2) return true;
        if(num %2 ==0) return false;
        for(int i = 3; i<= Math.sqrt(num); i++){
           if(num % i ==0) return false;
        }
        return true;
    }
    
}