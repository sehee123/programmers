import java.io.*;

public class Main{

    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
          
        String [] arrNum = br.readLine().split(" ");
            
        int v = Integer.parseInt(br.readLine());
        
        int cnt = 0;
        
        for(String num : arrNum){
            if(v == Integer.parseInt(num)){
                cnt ++;
            }
        }
        
        System.out.println(cnt);
        
    }

}