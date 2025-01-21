import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String [] args )throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        String input = br.readLine();

        Map<Character,Integer> map = new HashMap<>();
        int idx = 1;
        for(int i=0; i<26; i++){
           char alphabet = (char) ('A'+i);
           if(idx < 7){
               if(map.size()%3== 0 )idx ++ ;
           }else{
               if(alphabet == 'T') idx ++;
               if(alphabet == 'W') idx ++;
           }
           map.put(alphabet,idx);
        }
        int sum = 0;
        for(int i = 0; i<input.length() ; i++){
            int num = map.get(input.charAt(i));
            sum+= num+1;
        }
        System.out.println(sum);
    }
    
}