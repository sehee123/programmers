import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        int sum = 0;
        if(a==1)a++;
        for(int i = a ; i<=b ; i++){
            Boolean IsPrime = true;
            for(int j = 2; j<i ; j++){
                if(i%j == 0){
                    IsPrime = false;
                    break;
                }
            }
            if(IsPrime){
                list.add(i);
                sum+=i;
            }
        }
        if(list.size()>0){
            System.out.println(sum);
            System.out.println(list.get(0));
            
        }else{
            System.out.print(-1);
        }
    }
    
}