import java.io.*;

public class Main {
    
    public static void main(String [] args)throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = -1;
        
        if(n%5 == 0 || (n%5)%3 == 0){
           cnt = n/5;
           cnt += (n%5)/3;
        }else if(n%5!=0 && n>8){
            int tmp = n%5;
            while(tmp<n){
                tmp +=5;
                if(tmp%3 ==0){
                    break;
                }
            }
            cnt = (n-tmp)/5+(tmp/3);
        }else if(n%3 == 0){
            cnt = n/3;
        }
        System.out.println(cnt);
    }
    
}