import java.io.*;
import java.util.*;

public class Main {
    
    public static List<Integer> list = new ArrayList<>();
    
    public static void main(String [] args )throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
       int a = Integer.parseInt(br.readLine());
        List <Integer> list = new ArrayList<>();
        int i = 2;
        while(a >1){
            if(a%i == 0 && isPrime(i)){
                while(a%i == 0){
                    list.add(i);
                    a/=i;
                }
            }
            i++;
        }
        if(list.size() > 0){
            for (Integer integer : list) {
                System.out.println(integer);
            }
        }
    }
     private static boolean isPrime(int num){
        for(int i = 2 ; i<num; i++){
            if(num %i ==0)return false;
        }
        return true;
    }
}